package com.example.dell.myapplication.Ui.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.presenter.IBannerPresenter;
import com.example.dell.myapplication.presenter.IVideoListPresenter;
import com.example.dell.myapplication.view.IBannerView;
import com.example.dell.myapplication.view.IVideoListView;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragment extends BaseRecyerViewFragment implements IBannerView, IVideoListView{

    private RecyclerView mRecyclerView;

    @Override
    protected void initFindView(View layout) {

    }

    @Override
    public int getFragmentLayoutResurce() {
        return R.layout.fragment_home;
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
