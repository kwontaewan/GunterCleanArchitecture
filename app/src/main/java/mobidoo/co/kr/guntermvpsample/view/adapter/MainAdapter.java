package mobidoo.co.kr.guntermvpsample.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mobidoo.co.kr.guntermvpsample.R;
import mobidoo.co.kr.guntermvpsample.model.Android;
import mobidoo.co.kr.guntermvpsample.view.adapter.contract.MainAdapterContract;
import mobidoo.co.kr.guntermvpsample.view.adapter.holder.MainViewHolder;

/**
 * Created by Gunter on 2017-10-12.
 * Company : Mobidoo
 * Email : gunter@mobidoo.co.kr
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements MainAdapterContract.Model, MainAdapterContract.View {

    private Context context;

    private ArrayList<Android> androids;

    public MainAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_row,parent,false));
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        if(holder==null)return;
        holder.tvName.setText(androids.get(position).getName());
        holder.tvVersion.setText(androids.get(position).getApi());
        holder.tvApiLevel.setText(androids.get(position).getVer());

    }

    @Override
    public int getItemCount() {
        return androids != null ? androids.size() : 0;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void addItems(List<Android> androidList) {
        androids = new ArrayList<>(androidList);
    }
}
