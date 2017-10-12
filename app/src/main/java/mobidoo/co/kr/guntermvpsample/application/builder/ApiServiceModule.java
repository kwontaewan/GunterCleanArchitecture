package mobidoo.co.kr.guntermvpsample.application.builder;

import dagger.Module;
import dagger.Provides;
import mobidoo.co.kr.guntermvpsample.api.ApiService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yassinegharsallah on 31/03/2017.
 */

@Module
public class ApiServiceModule {

    public static final String BASE_URL = "https://api.learn2crack.com/";

    @AppScope
    @Provides
    ApiService provideApiService(OkHttpClient client, GsonConverterFactory gson, RxJava2CallAdapterFactory rxAdapter)
    {
        Retrofit retrofit =   new Retrofit.Builder().client(client)
                .baseUrl(BASE_URL).addConverterFactory(gson).
                        addCallAdapterFactory(rxAdapter).build();

        return  retrofit.create(ApiService.class);
    }


}
