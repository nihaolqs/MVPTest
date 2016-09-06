package com.example.dell.myapplication.presenter;

import android.provider.MediaStore;

import com.example.dell.myapplication.Ui.fragment.HomeFragment;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.model.HomeFragmentModel;
import com.example.dell.myapplication.model.IBannerModel;
import com.example.dell.myapplication.model.IVideoListModel;
import com.example.dell.myapplication.view.IBannerView;
import com.example.dell.myapplication.view.IVideoListView;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragmentPresenter implements IBannerPresenter, IVideoListPresenter{

    private HomeFragmentModel model;    //实现了IBannerModel 和 IListVideoModel
    private HomeFragment homeFragment;  //实现了IBannerView 和 IListVideoView

    //以下为IBannerPresenter方法
    @Override
    public IBannerView getBannerView() {
        return homeFragment;
    }

    @Override
    public IBannerModel getBannerModel() {
        return model;
    }

    @Override
    public void BannerOnclick(VideoBean video) {

    }

    @Override
    public void autoRun() {

    }

//    以下为IVideoListPresenter方法

    @Override
    public IVideoListView getVideoListView() {
        return homeFragment;
    }

    @Override
    public IVideoListModel getVideoListModel() {
        return model;
    }

    @Override
    public void listVideoOnclick(VideoBean video) {

    }

    @Override
    public void replaceData() {    //共有方法
        model.replaceData();
        homeFragment.showBanner(getBannerModel().getBannerList());
        homeFragment.showVideoList(getVideoListModel().getVideoList());
    }

    private void showVideoDetail(VideoBean videoBean)
    {
        int id = videoBean.getId();

    }
}
