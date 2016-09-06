package com.example.dell.myapplication.Ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.presenter.IBannerPresenter;
import com.example.dell.myapplication.presenter.IVideoListPresenter;
import com.example.dell.myapplication.view.IBannerView;
import com.example.dell.myapplication.view.IVideoListView;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragment extends Fragment implements IBannerView, IVideoListView{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void showBanner(List<VideoBean> videoList) {

    }

    @Override
    public IBannerPresenter getBannerPresenter() {
        return null;
    }

    @Override
    public void showVideoList(List<VideoBean> videoList) {

    }

    @Override
    public IVideoListPresenter getVideoListPresenter() {
        return null;
    }
}
