package com.example.dell.myapplication.view;

import com.example.dell.myapplication.bean.Video;
import com.example.dell.myapplication.presenter.IBannerPresenter;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public interface IBannerView {
    void showBanner(List<Video> videoList);
    IBannerPresenter getBannerPresenter();
}
