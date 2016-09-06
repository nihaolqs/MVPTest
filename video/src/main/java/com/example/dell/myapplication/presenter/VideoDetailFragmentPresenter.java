package com.example.dell.myapplication.presenter;

import android.content.Context;

import com.example.dell.myapplication.Ui.fragment.VideoDetailFragment;
import com.example.dell.myapplication.model.ICommentModel;
import com.example.dell.myapplication.model.IVideoDetailModel;
import com.example.dell.myapplication.model.VideoDetailFragmrntModel;
import com.example.dell.myapplication.view.ICommentView;
import com.example.dell.myapplication.view.IVideoDetailView;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragmentPresenter implements IVideoDetailPresenter, ICommentPresenter{

    private final Context mContext;
    private VideoDetailFragment detailFragment;
    private VideoDetailFragmrntModel model;

    public VideoDetailFragmentPresenter(Context context)
    {
        this.mContext = context;
    }
    
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
