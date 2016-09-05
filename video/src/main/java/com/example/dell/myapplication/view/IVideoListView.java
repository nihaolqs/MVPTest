package com.example.dell.myapplication.view;

import com.example.dell.myapplication.bean.Video;
import com.example.dell.myapplication.presenter.IVideoListPresenter;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public interface IVideoListView {
    void showVideoList(List<Video> videoList);
    IVideoListPresenter getVideoListPresenter();
}
