package com.example.dell.myapplication.view;

import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.presenter.IVideoDetailPresenter;

/**
 * Created by dell on 2016/9/6.
 */
public interface IVideoDetailView {
    void showVideoDetail(VideoBean videoBean);
    IVideoDetailPresenter getVideoDetailPresenter();
}
