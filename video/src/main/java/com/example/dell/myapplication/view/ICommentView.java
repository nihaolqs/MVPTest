package com.example.dell.myapplication.view;

import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.presenter.ICommentPresenter;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public interface ICommentView {
    void showComments(List<CommentBean> commentBeanList);
    ICommentPresenter getCommentPresenter();
}
