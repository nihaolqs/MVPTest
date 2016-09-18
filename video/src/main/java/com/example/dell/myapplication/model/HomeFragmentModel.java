package com.example.dell.myapplication.model;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.utils.HttpResponseListener;
import com.example.dell.myapplication.utils.HttpUtil;
import com.example.dell.myapplication.utils.IHttpRequesedListener;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragmentModel implements IHomeFragmentModel{

    private Context mContext;
    private HomeFragmentData mData;

    public HomeFragmentModel(Context context)
    {
        this.mContext = context;
    }
    @Override
    public List<VideoBean> getBannerList() {
        return this.mData.getBanner();
    }

    @Override
    public List<VideoBean> getVideoList() {
        return this.mData.getVideos();
    }

    public void replaceData(final IHttpRequesedListener httpRequesedListener)
    {
        String urlStr = Constants.ApiCline.VIDEO_HOME;
        HttpResponseListener<String> listener = new HttpResponseListener<String>() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(mContext,volleyError.getMessage(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String o) {
//                Log.e("HomeFragmentModel",o);  有下载数据
                Gson gson = new Gson();
                HomeFragmentData data = gson.fromJson(o, HomeFragmentData.class);
                HomeFragmentModel.this.mData = data;
                httpRequesedListener.requesed();    //回调方式处理时机问题
            }
        };
        HttpUtil.httpStringGetReques(mContext,urlStr,listener);
    }
}
