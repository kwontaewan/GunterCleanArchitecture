package mobidoo.co.kr.guntermvpsample.model.source.main;

import java.util.List;

import io.reactivex.Observable;
import mobidoo.co.kr.guntermvpsample.api.ApiService;
import mobidoo.co.kr.guntermvpsample.api.RetrofitModule;
import mobidoo.co.kr.guntermvpsample.model.Android;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public class MainDataSource implements MainSource {

    private static final String TAG = MainDataSource.class.getSimpleName();
    private static MainDataSource INSTANCE;

    private ApiService apiService;

    public MainDataSource(){
        apiService = RetrofitModule.createRetrofit().create(ApiService.class);
    }

    public static MainDataSource getInstance(){
        if(INSTANCE == null){
            INSTANCE = new MainDataSource();
        }

        return INSTANCE;
    }

    @Override
    public Observable<List<Android>> getData() {
        return apiService.getData();
    }

}
