package com.example.dell.myapplication.Ui.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.example.dell.myapplication.R;
import com.example.dell.myapplication.adapter.HomeFragmentAdatpter;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.model.HomeFragmentData;
import com.example.dell.myapplication.presenter.HomeFragmentPresenter;
import com.example.dell.myapplication.presenter.IBannerPresenter;
import com.example.dell.myapplication.presenter.IVideoListPresenter;
import com.example.dell.myapplication.view.IBannerView;
import com.example.dell.myapplication.view.IVideoListView;
import com.example.dell.myapplication.widget.viewpage_widget.BaseFragment;
import com.example.dell.myapplication.widget.viewpage_widget.FragmentFactory;
import com.example.dell.myapplication.widget.viewpage_widget.IInitBanner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragment extends BaseFragment<HomeFragmentData> implements IBannerView, IVideoListView{

    private RecyclerView mRecyclerView;
    private ArrayList<VideoBean> mBannerList = new ArrayList<>();
    private ArrayList<VideoBean> mList = new ArrayList<>();
    private HomeFragmentAdatpter mAdatpter;
    private HomeBannerFragment mHomeBannerFragment;
    private HomeFragmentPresenter mHomeFragmentPresenter;


    @Override
    public void initUi(HomeFragmentData data, View layout) {
        initFindView(layout);
        initRecyclerView();
    }

    private void initRecyclerView() {
        mAdatpter = new HomeFragmentAdatpter(getContext(), mList);
        //TODO 暂时注销
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, RecyclerView.VERTICAL));
        RecyclerViewHeader recyclerViewHeader = RecyclerViewHeader.fromXml(getContext(), R.layout.layout_header);

        mRecyclerView.setAdapter(mAdatpter);
        recyclerViewHeader.attachTo(mRecyclerView);
        FragmentManager fm = getChildFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        mHomeBannerFragment = FragmentFactory.getFragment(HomeBannerFragment.class, mBannerList);
        mHomeBannerFragment.setmInitBanner(new IInitBanner() {
            @Override
            public int getIntervalTime() {
                return 3000;
            }
        });
        ft.replace(R.id.fl_header, mHomeBannerFragment);
        ft.commit();
        mHomeFragmentPresenter.replaceData();
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
        mHomeBannerFragment.rePlaceViewPage(videoList);
    }

    @Override
    public IBannerPresenter getBannerPresenter() {
        return this.mHomeFragmentPresenter;
    }

    @Override
    public void showVideoList(List<VideoBean> videoList) {
        mList.clear();
        mList.addAll(videoList);
//        Log.e("showVideoList",""+mList.toString());
        mAdatpter.notifyDataSetChanged();
    }

    @Override
    public IVideoListPresenter getVideoListPresenter() {
        return this.mHomeFragmentPresenter;
    }

    @Override
    protected void initData() {
        super.initData();
        mHomeFragmentPresenter = new HomeFragmentPresenter(getContext(),this,this);

    }
}
