package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.bean.VideoBean;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragmrntModel implements ICommentModel, IVideoDetailModel{

    private VideoDetailFragmentData mData;
    @Override
    public List<CommentBean> getComments() {
        return this.mData.getComments();
    }

    @Override
    public void replaceData() {

    }

    @Override
    public VideoBean getVideoDetail() {
        return this.mData.getVideo();
    }
}
