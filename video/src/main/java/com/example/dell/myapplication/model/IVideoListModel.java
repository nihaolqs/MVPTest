package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.VideoBean;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public interface IVideoListModel {
    List<VideoBean> getVideoList();
    void replaceData();
}
