package caplan.innovations.trendy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import caplan.innovations.trendy.R;
import caplan.innovations.trendy.model.NewsItem;
import caplan.innovations.trendy.recycler.NewsItemRecyclerAdapter;

/**
 * The main activity that is the entry-point for our app.
 */
public class MainActivity extends BaseActivity implements NewsItemRecyclerAdapter.OnNewsItemActionListener {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @SuppressWarnings("FieldCanBeLocal")
    private NewsItemRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<NewsItem> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(NewsItem.getDummy());
        }

        /* Pass "this" since Activity is an instance of Context */
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        /* Pass "this" since Activity implements OnNewsItemActionListener */
        mAdapter = new NewsItemRecyclerAdapter(items, this);
        mRecyclerView.setAdapter(mAdapter);


    }

    @LayoutRes
    @Override
    int getContentView() {
        return R.layout.activity_main;
    }

    public void onNewsItemClick(NewsItem item){
        Intent intent = NewsDetailsActivity.createIntent(item);
        this.startActivity(intent);
    }


}

