package com.example.dell.myapplication.Ui.fragment;

import android.support.v4.app.Fragment;

import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.presenter.ICommentPresenter;
import com.example.dell.myapplication.presenter.IVideoDetailPresenter;
import com.example.dell.myapplication.view.ICommentView;
import com.example.dell.myapplication.view.IVideoDetailView;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragment extends Fragment implements IVideoDetailView,ICommentView{

    @Override
    public void showComments(List<CommentBean> commentBeanList) {

    }

    @Override
    public ICommentPresenter getCommentPresenter() {
        return null;
    }

    @Override
    public void showVideoDetail(VideoBean videoBean) {

    }

    @Override
    public IVideoDetailPresenter getVideoDetailPresenter() {
        return null;
    }
}
