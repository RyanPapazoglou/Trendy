package caplan.innovations.trendy.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import caplan.innovations.trendy.model.NewsItem;

/**
 * Created by ryanpapazoglou on 2/14/17.
 */

public class NewsItemRecyclerAdapter extends RecyclerView.Adapter {


    @NonNull
    private ArrayList<NewsItem> mData;




    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newsVite = inflater.inflate(R.layout)

    }

}
