package mobidoo.co.kr.guntermvpsample.utills;

import io.reactivex.Scheduler;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public interface RxSchedulers {

    Scheduler androidThread();

    Scheduler io();

    Scheduler thread();

    Scheduler single();

    Scheduler computation();

    Scheduler trampoline();
}
