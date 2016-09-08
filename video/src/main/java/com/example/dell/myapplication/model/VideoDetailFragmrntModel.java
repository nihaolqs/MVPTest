package com.example.dell.myapplication.model;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.utils.HttpResponseListener;
import com.example.dell.myapplication.utils.HttpUtil;
import com.example.dell.myapplication.utils.IHttpRequesedListener;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragmrntModel implements IVideoDetailFragmentModel{

    private VideoDetailFragmentData mVideoDetailFragmentData;
    private Context mContext;

    public VideoDetailFragmrntModel(Context context)
    {
        this.mContext = context;
    }

    @Override
    public List<CommentBean> getComments() {
        return mVideoDetailFragmentData.getComments();
    }

    @Override
    public void replaceData(int id, final IHttpRequesedListener httpRequesedListener) {
        String urlStr = Constants.ApiCline.VIDEO_BY_ID.replaceAll("%d",id +"");
        HttpResponseListener<String> listener = new HttpResponseListener<String>() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(mContext,volleyError.getMessage(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String s) {
                Gson gson = new Gson();
                VideoDetailFragmentData data = gson.fromJson(s, VideoDetailFragmentData.class);
                VideoDetailFragmrntModel.this.mVideoDetailFragmentData = data;
                httpRequesedListener.requesed();
            }
        };
        HttpUtil.httpStringGetReques(mContext,urlStr,listener);
    }

    @Override
    public VideoBean getVideoDetail() {
        return mVideoDetailFragmentData.getVideo();
    }


}
