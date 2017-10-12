package mobidoo.co.kr.guntermvpsample.application.builder;

import dagger.Module;
import dagger.Provides;
import mobidoo.co.kr.guntermvpsample.utills.AppRxSchedulers;
import mobidoo.co.kr.guntermvpsample.utills.RxSchedulers;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
@Module
public class RxModule {

    @Provides
    RxSchedulers provideRxSchedulers() {
        return new AppRxSchedulers();
    }


}
