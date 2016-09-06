package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.model.IVideoListModel;
import com.example.dell.myapplication.view.IVideoListView;

/**
 * Created by dell on 2016/9/5.
 */
public interface IVideoListPresenter {
    IVideoListView getVideoListView();
    IVideoListModel getVideoListModel();
    void listVideoOnclick(VideoBean video);
    void replaceData();
}
