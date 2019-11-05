package com.example.anew.msbuddy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by New on 27/01/2018.
 */
public class article_title_location_rank_adapter extends RecyclerView.Adapter<article_title_location_rank_adapter.MyViewHolder> {
    private List<article_uni> articleList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,location,rank;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.textView2_article_title);

            rank =(TextView) view.findViewById(R.id.textView2_article_title3);

        }
    }


    public article_title_location_rank_adapter(List<article_uni> articleList) {
        this.articleList = articleList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_uni_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        article_uni ar = articleList.get(position);
        holder.title.setText(ar.getTitle());
        holder.rank.setText(ar.getRank());

    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }


}
