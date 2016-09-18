package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.utils.IHttpRequesedListener;

import java.util.List;

/**
 * Created by dell on 2016/9/18.
 */

public interface IChannelModel {
    List<ChannelBean> getChannelList();
    void replaceData(IHttpRequesedListener httpRequesedListener);
}
