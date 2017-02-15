package caplan.innovations.trendy.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
import android.widget.TextView;

import butterknife.BindView;
import caplan.innovations.trendy.R;
import caplan.innovations.trendy.model.NewsItem;

/**
 * The main activity that is the entry-point for our app.
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.news_feed_title_text_view)
    TextView titleTextView;

    @BindView(R.id.news_feed_title_text_view)
    TextView authorTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        NewsItem newsItem = new NewsItem("Android Course 101", "Corey", null, null, null);
        titleTextView.setText(newsItem.getTitle());
        authorTextView.setText(newsItem.getAuthor());

    }

    @LayoutRes
    @Override
    int getContentView() {
        return R.layout.activity_main;
    }

}
