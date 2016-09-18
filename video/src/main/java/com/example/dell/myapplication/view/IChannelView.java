package com.example.dell.myapplication.view;

import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.presenter.IChannelPresenter;

import java.util.List;

/**
 * Created by dell on 2016/9/18.
 */

public interface IChannelView {
    void showChannelList(List<ChannelBean> list);
    IChannelPresenter getChannelPresenter();
}
