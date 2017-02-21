package caplan.innovations.trendy.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import caplan.innovations.trendy.R;
import caplan.innovations.trendy.model.NewsItem;

/**
 * Created by ryanpapazoglou on 2/14/17.
 */

public class NewsItemRecyclerAdapter extends RecyclerView.Adapter<NewsViewHolder> implements NewsViewHolder.OnNewsActionListenerInternal {



    @Override
    public void onNewsClickInternal(int position) {
        NewsItem newsItem = data.get(position);
        listner.onNewsItemClick(newsItem);
    }


    public interface OnNewsItemActionListener{

        /**
         * Called when a news item is clicked
         *
         * @param item The news item on which the user clicked.
         */
        void onNewsItemClick(NewsItem item);

    }

    @NonNull
    private ArrayList<NewsItem> data;
    private OnNewsItemActionListener listner;

    public NewsItemRecyclerAdapter(@NonNull ArrayList<NewsItem> newsItems,
                                   OnNewsItemActionListener mListener) {
        data = newsItems;
        listner = mListener;
    }


    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        // Get an instance of LayoutInflater to inflate our view from XML
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newsView = inflater.inflate(R.layout.news_feed_item, parent, false);
        return new NewsViewHolder(newsView, this);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        NewsItem item = data.get(position);
        holder.Bind(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
