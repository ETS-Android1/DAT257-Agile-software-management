package com.example.eurythmics.api.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * A class representing a movie
 */
public class MovieModel implements Parcelable {

    private String title;
    private String posterPath;
    private String releaseDate;
    private int movie_id;
    private float voteAverage;
    private String movie_overView;


    public MovieModel(String title, String posterPath, String releaseDate, int movie_id, float voteAverage, String movie_overView) {
        this.title = title;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.movie_id = movie_id;
        this.voteAverage = voteAverage;
        this.movie_overView = movie_overView;
    }


    protected MovieModel(Parcel in) {
        title = in.readString();
        posterPath = in.readString();
        releaseDate = in.readString();
        movie_id = in.readInt();
        voteAverage = in.readFloat();
        movie_overView = in.readString();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public String getMovie_overView() {
        return movie_overView;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(posterPath);
        parcel.writeString(releaseDate);
        parcel.writeInt(movie_id);
        parcel.writeFloat(voteAverage);
        parcel.writeString(movie_overView);
    }
}
