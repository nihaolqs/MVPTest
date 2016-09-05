package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.bean.Video;
import com.example.dell.myapplication.model.IBannerModel;
import com.example.dell.myapplication.view.IBannerView;

/**
 * Created by dell on 2016/9/5.
 */
public interface IBannerPresenter {
    IBannerView getBannerView();
    IBannerModel getBannerModel();
    void BannerOnclick(Video video);
    void autoRun();
}
