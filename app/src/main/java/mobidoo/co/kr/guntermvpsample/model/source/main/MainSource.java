package mobidoo.co.kr.guntermvpsample.model.source.main;

import java.util.List;

import io.reactivex.Observable;
import mobidoo.co.kr.guntermvpsample.model.Android;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public interface MainSource {

    Observable<List<Android>> getData();

}
