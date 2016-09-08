package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.model.IVideoDetailModel;
import com.example.dell.myapplication.view.IVideoDetailView;

/**
 * Created by dell on 2016/9/6.
 */
public interface IVideoDetailPresenter {
    IVideoDetailModel getVideoDetailModel();
    IVideoDetailView getVideoDetailView();
    void replaceData(int id);
}
