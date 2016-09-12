package com.example.dell.myapplication.Ui.fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.adapter.HomeFragmentAdatpter;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.model.HomeFragmentData;
import com.example.dell.myapplication.presenter.IBannerPresenter;
import com.example.dell.myapplication.presenter.IVideoListPresenter;
import com.example.dell.myapplication.view.IBannerView;
import com.example.dell.myapplication.view.IVideoListView;
import com.example.dell.myapplication.widget.viewpage_widget.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragment extends BaseFragment<HomeFragmentData> implements IBannerView, IVideoListView{

    private RecyclerView mRecyclerView;
    private ArrayList<VideoBean> mList = new ArrayList<>();
    private HomeFragmentAdatpter mAdatpter;


    @Override
    public void initUi(HomeFragmentData data, View layout) {
        initFindView(layout);
        initRecyclerView();

    }

    private void initRecyclerView() {
        mAdatpter = new HomeFragmentAdatpter(getContext(), mList);
        mRecyclerView.setAdapter(mAdatpter);
    }

    private void initFindView( View layout) {
        mRecyclerView = (RecyclerView) layout.findViewById(R.id.rcv_fhome_showvideolist);
    }

    @Override
    protected int getLauoutResour() {
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

    @Override
    protected void initData() {
        super.initData();
    }
}
