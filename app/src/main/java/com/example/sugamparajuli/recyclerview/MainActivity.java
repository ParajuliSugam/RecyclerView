package com.example.sugamparajuli.recyclerview;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovieListing;
    private RecyclerView.Adapter adapter;
    private List<LauncherActivity.ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovieListing = findViewById(R.id.rv_movie_listing);
        rvMovieListing.setHasFixedSize(true);
        rvMovieListing.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvMovieListing.setLayoutManager(gridLayoutManager);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        rvMovieListing.setLayoutManager(linearLayoutManager);

        rvMovieListing.setAdapter(new MovieListingAdapter(getMovieList()));
    }
    private ArrayList<MovieListingDetail> getMovieList() {
        ArrayList<MovieListingDetail> moviesList = new ArrayList<>();
        moviesList.add(new MovieListingDetail("Sultan", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Bajrangi Bhaijaan", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Kick", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Jai Ho", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Sultan", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Bajrangi Bhaijaan", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Kick", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Jai Ho", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Sultan", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Bajrangi Bhaijaan", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Kick", R.mipmap.ic_launcher));
        moviesList.add(new MovieListingDetail("Jai Ho", R.mipmap.ic_launcher));
        return moviesList;
    }
}
