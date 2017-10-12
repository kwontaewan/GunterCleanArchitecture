package mobidoo.co.kr.guntermvpsample.view.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobidoo.co.kr.guntermvpsample.R;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public class MainViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_name)
    public TextView tvName;

    @BindView(R.id.tv_version)
    public TextView tvVersion;

    @BindView(R.id.tv_api_level)
    public TextView tvApiLevel;


    public MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
