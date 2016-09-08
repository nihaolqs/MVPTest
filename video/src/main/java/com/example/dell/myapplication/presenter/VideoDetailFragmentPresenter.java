package com.example.dell.myapplication.presenter;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dell.myapplication.Ui.fragment.VideoDetailFragment;
import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.model.ICommentModel;
import com.example.dell.myapplication.model.IVideoDetailFragmentModel;
import com.example.dell.myapplication.model.IVideoDetailModel;
import com.example.dell.myapplication.model.VideoDetailFragmentData;
import com.example.dell.myapplication.model.VideoDetailFragmrntModel;
import com.example.dell.myapplication.utils.HttpResponseListener;
import com.example.dell.myapplication.utils.HttpUtil;
import com.example.dell.myapplication.utils.IHttpRequesedListener;
import com.example.dell.myapplication.view.ICommentView;
import com.example.dell.myapplication.view.IVideoDetailView;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragmentPresenter implements IVideoDetailPresenter, ICommentPresenter{

    private final Context mContext;
    private IVideoDetailView videoDetailView;
    private ICommentView commentView;
    private IVideoDetailFragmentModel model;

    public VideoDetailFragmentPresenter(Context context)
    {
        this.mContext = context;
    }
    
    @Override
    public ICommentView getCommentView() {
        return commentView;
    }

    @Override
    public ICommentModel getCommentModel() {
        return model;
    }

    @Override
    public void replaceData(int id) {
        model.replaceData(id, new IHttpRequesedListener() {
            @Override
            public void requesed() {
                List<CommentBean> comments = getCommentModel().getComments();
                getCommentView().showComments(comments);
                VideoBean videoDetail = getVideoDetailModel().getVideoDetail();
                getVideoDetailView().showVideoDetail(videoDetail);
            }
        });
    }

    @Override
    public IVideoDetailModel getVideoDetailModel() {
        return model;
    }

    @Override
    public IVideoDetailView getVideoDetailView() {
        return videoDetailView;
    }
}
