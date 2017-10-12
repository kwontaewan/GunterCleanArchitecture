package mobidoo.co.kr.guntermvpsample.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import mobidoo.co.kr.guntermvpsample.R;
import mobidoo.co.kr.guntermvpsample.model.source.main.MainRepository;
import mobidoo.co.kr.guntermvpsample.view.adapter.MainAdapter;

public class MainActivity extends RxAppCompatActivity implements MainContract.View {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;


    private MainAdapter mainAdapter;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initRecyclerView();

        mainPresenter = new MainPresenter(this,getApplicationContext());
        mainPresenter.setAdapaterModel(mainAdapter);
        mainPresenter.setAdapterView(mainAdapter);
        mainPresenter.setRepository(MainRepository.getInstance());

    }

    @Override
    protected void onResume() {
        super.onResume();
        mainPresenter.getData();
    }

    private void initRecyclerView(){
        mainAdapter = new MainAdapter(getApplicationContext());
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainAdapter);
    }

    @Override
    public void showToast(String title) {
        Toast.makeText(getApplicationContext(),title,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachView();
    }
}
