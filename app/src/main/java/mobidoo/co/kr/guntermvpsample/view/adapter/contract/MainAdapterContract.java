package mobidoo.co.kr.guntermvpsample.view.adapter.contract;

import java.util.List;

import mobidoo.co.kr.guntermvpsample.model.Android;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public interface MainAdapterContract {

    interface View {

        void notifyAdapter();

    }

    interface  Model {

        void addItems(List<Android> androidList);

    }

}
