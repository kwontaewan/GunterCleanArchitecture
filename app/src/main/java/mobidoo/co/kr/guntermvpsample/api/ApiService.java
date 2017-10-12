package mobidoo.co.kr.guntermvpsample.api;

import java.util.List;

import io.reactivex.Observable;
import mobidoo.co.kr.guntermvpsample.model.Android;
import retrofit2.http.GET;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public interface ApiService {

    @GET("android/jsonarray/")
    Observable<List<Android>> getData();

}
