package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.bean.Video;
import com.example.dell.myapplication.model.IBannerModel;
import com.example.dell.myapplication.model.IVideoListModel;
import com.example.dell.myapplication.view.IBannerView;
import com.example.dell.myapplication.view.IVideoListView;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragmentPresenter implements IBannerPresenter, IVideoListPresenter{
    @Override
    public IBannerView getBannerView() {
        return null;
    }

    @Override
    public IBannerModel getBannerModel() {
        return null;
    }

    @Override
    public void BannerOnclick(Video video) {

    }

    @Override
    public void autoRun() {

    }

    @Override
    public IVideoListView getVideoListView() {
        return null;
    }

    @Override
    public IVideoListModel getVideoListModel() {
        return null;
    }

    @Override
    public void videoOnclick() {

    }

    @Override
    public void replaceData() {

    }
}
