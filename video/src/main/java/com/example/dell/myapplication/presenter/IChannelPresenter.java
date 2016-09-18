package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.model.ChannelModel;
import com.example.dell.myapplication.view.IChannelView;

/**
 * Created by dell on 2016/9/18.
 */

public interface IChannelPresenter {
    ChannelModel getChannelModel();
    IChannelView getChannelView();
    void replaceData();
    void listChannelOnclick(ChannelBean bean);
}
