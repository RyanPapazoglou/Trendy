package caplan.innovations.trendy.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import caplan.innovations.trendy.R;
import caplan.innovations.trendy.model.NewsItem;

/**
 * Created by ryanpapazoglou on 2/14/17.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {


    interface OnNewsActionListenerInternal{

        void onNewsClickInternal(int position);
    }

    @BindView(R.id.news_feed_title_text_view)
    TextView titleTextView;

    @BindView(R.id.news_feed_author_text_view)
    TextView authorTextView;

    @BindView(R.id.news_feed_image)
    ImageView imageView;


    private OnNewsActionListenerInternal mListenerInternal;

    NewsViewHolder(View viewItem, OnNewsActionListenerInternal listenerInternal){
        super(viewItem);
        ButterKnife.bind(this, itemView);
        mListenerInternal = listenerInternal;
    }

    void Bind(NewsItem item){
        titleTextView.setText(item.getTitle());
        authorTextView.setText(item.getAuthor());
    }

    @OnClick(R.id.news_feed_container)
    void onNewsItemClick(){
        // Use the adapter position to get the position of the click
        int position = getAdapterPosition();
        mListenerInternal.onNewsClickInternal(position);
    }
}
