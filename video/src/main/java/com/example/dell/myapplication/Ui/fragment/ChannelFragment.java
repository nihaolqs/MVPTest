package com.example.dell.myapplication.Ui.fragment;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.presenter.IChannelPresenter;
import com.example.dell.myapplication.view.IChannelView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/9/18.
 */

public class ChannelFragment extends BaseRecyerViewFragment<ArrayList<ChannelBean>> implements IChannelView {

    private RecyclerView mRcvChannelList;
    private ArrayList<ChannelBean> mList = new ArrayList<>();
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void initRecyerViewHeader(RecyclerView recyclerView) {

    }

    @Override
    protected RecyclerView getRecyclerView() {
        return null;
    }

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        gridLayoutManager = new GridLayoutManager(getContext(), 2);
        return gridLayoutManager;
    }

    @Override
    public RecyclerView.Adapter getBaseRecyclerViewAdapter() {
        return null;
    }

    @Override
    public void showChannelList(List<ChannelBean> list) {

    }

    @Override
    public IChannelPresenter getChannelPresenter() {
        return null;
    }


    @Override
    public void initUi(ArrayList<ChannelBean> data, View layout) {
        initFindView(layout);
    }

    private void initFindView(View layout) {
        mRcvChannelList = (RecyclerView) layout.findViewById(R.id.rv_cf_channel_list);
    }

    @Override
    protected int getLayoutResour() {
        return R.layout.fragment_channel;
    }
}
