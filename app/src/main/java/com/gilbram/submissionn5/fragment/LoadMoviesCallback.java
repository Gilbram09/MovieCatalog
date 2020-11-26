package com.gilbram.submissionn5.fragment;
import com.gilbram.submissionn5.model.movie.MovieItem;

import java.util.ArrayList;

public interface LoadMoviesCallback {
    void preExecute();

    void postExecute(ArrayList<MovieItem> movieItems);
}
