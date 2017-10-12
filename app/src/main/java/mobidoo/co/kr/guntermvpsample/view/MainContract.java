package mobidoo.co.kr.guntermvpsample.view;

import mobidoo.co.kr.guntermvpsample.model.source.main.MainRepository;
import mobidoo.co.kr.guntermvpsample.view.adapter.contract.MainAdapterContract;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public interface MainContract {

    interface View {
        void showToast(String title);
    }

    interface Presneter {

        void detachView();

        void setRepository(MainRepository repository);

        void setAdapaterModel(MainAdapterContract.Model model);

        void setAdapterView(MainAdapterContract.View view);

        void getData();
    }
}
