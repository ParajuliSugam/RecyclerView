package com.example.sugamparajuli.recyclerview;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieListingAdapter extends RecyclerView.Adapter<MovieListingAdapter.MovieListingViewHolder>{

    private ArrayList<MovieListingDetail> movieListingDetailArrayList;

    public MovieListingAdapter(ArrayList<MovieListingDetail> movieListingDetailArrayList) {
        this.movieListingDetailArrayList = movieListingDetailArrayList;
    }

    @NonNull
    @Override
    public MovieListingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_listing,parent,false);
        MovieListingViewHolder rcv = new MovieListingViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListingViewHolder holder, int position) {
        holder.ivMoviePoster.setImageResource(movieListingDetailArrayList.get(position).getMoviePosterPath());
        holder.tvMovieName.setText(movieListingDetailArrayList.get(position).getMovieName());

    }

    @Override
    public int getItemCount() {
        return movieListingDetailArrayList.size();
    }

    public class MovieListingViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivMoviePoster;
        public TextView tvMovieName;

        public MovieListingViewHolder(View itemView) {
            super(itemView);

            ivMoviePoster = itemView.findViewById(R.id.iv_movie_poster);
            tvMovieName = itemView.findViewById(R.id.tv_movie_name);
        }
    }

}
