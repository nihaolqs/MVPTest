package com.example.dell.myapplication.presenter;

import com.example.dell.myapplication.model.ICommentModel;
import com.example.dell.myapplication.view.ICommentView;

/**
 * Created by dell on 2016/9/6.
 */
public interface ICommentPresenter {
    ICommentView getCommentView();
    ICommentModel getCommentModel();
    void replaceData(int id);
}
