package com.gilbram.submissionn5.fragment;

import com.gilbram.submissionn5.model.tv.TvItem;

import java.util.ArrayList;

public interface LoadTvCallback {
    void preExecute();

    void postExecute(ArrayList<TvItem> tvItems);
}
