package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.model.ICommentModel;
import com.example.dell.myapplication.model.IVideoDetailModel;
import com.example.dell.myapplication.view.ICommentView;
import com.example.dell.myapplication.view.IVideoDetailView;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragmentPresenter implements IVideoDetailPresenter, ICommentPresenter{
    @Override
    public ICommentView getCommentView() {
        return null;
    }

    @Override
    public ICommentModel getCommentModel() {
        return null;
    }

    @Override
    public void replaceData() {

    }

    @Override
    public IVideoDetailModel getVideoDetailModel() {
        return null;
    }

    @Override
    public IVideoDetailView getVideoDetailView() {
        return null;
    }
}
