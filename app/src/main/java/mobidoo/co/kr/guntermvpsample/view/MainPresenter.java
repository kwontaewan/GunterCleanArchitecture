package mobidoo.co.kr.guntermvpsample.view;

import android.content.Context;
import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import mobidoo.co.kr.guntermvpsample.model.source.main.MainRepository;
import mobidoo.co.kr.guntermvpsample.utills.NetworkUtils;
import mobidoo.co.kr.guntermvpsample.view.adapter.contract.MainAdapterContract;


/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public class MainPresenter implements MainContract.Presneter {

    private static final String TAG = MainPresenter.class.getSimpleName();

    private MainContract.View view;
    private Context context;

    private MainAdapterContract.Model adapterModel;
    private MainAdapterContract.View adapterView;

    private MainRepository mainRepository;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    public MainPresenter(MainContract.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void setRepository(MainRepository repository) {
        this.mainRepository = repository;
    }

    @Override
    public void setAdapaterModel(MainAdapterContract.Model model) {
        this.adapterModel = model;
    }

    @Override
    public void setAdapterView(MainAdapterContract.View view) {
        this.adapterView = view;
    }

    @Override
    public void getData() {

        NetworkUtils.isNetworkAvailableObservable(context).doOnNext(networkAvailable -> {
            if (!networkAvailable) {
                Log.d(TAG, "no connexion");
                // UiUtils.showSnackbar();
                // Show Snackbar can't use app
            }
        }).
                filter(isNetworkAvailable -> true)
                .flatMap(isNetworkAvailable -> mainRepository.getData())
                .doOnNext(data -> Log.d(TAG,data.toString()))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(data->{
                    adapterModel.addItems(data);
                    adapterView.notifyAdapter();
                },error-> view.showToast(error.getLocalizedMessage()));
    }
}
