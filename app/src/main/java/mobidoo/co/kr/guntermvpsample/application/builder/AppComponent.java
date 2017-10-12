package mobidoo.co.kr.guntermvpsample.application.builder;

import dagger.Component;
import mobidoo.co.kr.guntermvpsample.api.ApiService;
import mobidoo.co.kr.guntermvpsample.utills.RxSchedulers;

/**
 * Created by ygharsallah on 30/03/2017.
 */
@AppScope
@Component(modules = {NetworkModule.class, AppContextModule.class, RxModule.class, ApiServiceModule.class})
public interface AppComponent {

    RxSchedulers rxSchedulers();
    ApiService apiService();


}
