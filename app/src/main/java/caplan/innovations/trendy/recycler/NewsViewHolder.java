package caplan.innovations.trendy.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import caplan.innovations.trendy.R;

/**
 * Created by ryanpapazoglou on 2/14/17.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.news_feed_title_text_view)
    TextView titleTextView;

    @BindView(R.id.news_feed_title_text_view)
    TextView authorTextView;

    @BindView(R.id.news_feed_image)
    ImageView imageView;


    //private OnNewsActionListenerInternal mListenerInteral;

    NewsViewHolder(View viewItem, OnNewsActionListenerInteral listenerInteral){
        super(viewItem);
        ButterKnife.bind(this, itemView);
        //mListenerInteral = listenerInteral;
    }





}
