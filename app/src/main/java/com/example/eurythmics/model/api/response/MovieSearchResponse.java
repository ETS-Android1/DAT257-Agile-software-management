package com.example.eurythmics.model.api.response;

import com.example.eurythmics.model.api.models.MovieModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This class is the object that will hold the list of movie json objects
 * @author Omar Sulaiman
 */
public class MovieSearchResponse {

    @SerializedName("total_results") @Expose() private int total_count;

    @SerializedName("results") @Expose() private List<MovieModel> movies;

    public int getTotal_count(){
        return total_count;
    }

    public List<MovieModel> getMovies(){
        return movies;
    }


    @Override
    public String toString() {
        return "MovieSearchResponse{" +
                "total_count=" + total_count +
                ", movies=" + movies +
                '}';
    }
}
