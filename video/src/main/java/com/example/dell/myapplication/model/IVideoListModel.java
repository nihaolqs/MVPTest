package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.utils.IHttpRequesedListener;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public interface IVideoListModel {
    List<VideoBean> getVideoList();
    void replaceData(IHttpRequesedListener httpRequesedListener);
}
