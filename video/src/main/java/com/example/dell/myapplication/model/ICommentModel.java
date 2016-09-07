package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.utils.IHttpRequesedListener;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public interface ICommentModel {
    List<CommentBean> getComments();
    void replaceData(int id, IHttpRequesedListener httpRequesedListener);
}
