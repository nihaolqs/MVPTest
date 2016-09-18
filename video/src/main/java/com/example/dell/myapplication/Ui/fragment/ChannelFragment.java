package com.example.dell.myapplication.Ui.fragment;

import android.view.View;

import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.presenter.IChannelPresenter;
import com.example.dell.myapplication.view.IChannelView;

import java.util.List;

/**
 * Created by dell on 2016/9/18.
 */

public class ChannelFragment extends BaseRecyerViewFragment<ChannelBean> implements IChannelView {
    @Override
    public void showChannelList(List<ChannelBean> list) {

    }

    @Override
    public IChannelPresenter getChannelPresenter() {
        return null;
    }

    @Override
    protected void initFindView(View layout) {

    }

    @Override
    public void initUi(ChannelBean data, View layout) {

    }

    @Override
    protected int getLayoutResour() {
        return 0;
    }
}
