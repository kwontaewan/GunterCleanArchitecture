package mobidoo.co.kr.guntermvpsample.model.source.main;

import java.util.List;

import io.reactivex.Observable;
import mobidoo.co.kr.guntermvpsample.model.Android;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public class MainRepository implements MainSource {

    private MainDataSource mainDataSource;

    private static MainRepository INSTANCE;

    public static MainRepository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new MainRepository();
        }

        return INSTANCE;
    }

    public MainRepository(){
        mainDataSource = MainDataSource.getInstance();
    }

    @Override
    public Observable<List<Android>> getData() {
        return mainDataSource.getData();
    }

}
