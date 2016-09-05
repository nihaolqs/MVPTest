package com.example.dell.myapplication.model;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.utils.HttpResponseListener;
import com.example.dell.myapplication.utils.HttpUtil;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragmentModel implements IBannerModel, IVideoListModel{

    private Context mContext;

    public HomeFragmentModel(Context context)
    {
        this.mContext = context;
    }
    @Override
    public List<VideoBean> getBannerList() {
        return null;
    }

    @Override
    public List<VideoBean> getVideoList() {
        return null;
    }

    public void replaceData()
    {
        String urlStr = Constants.ApiCline.VIDEO_HOME;
        HttpResponseListener listener = new HttpResponseListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(mContext,volleyError.getMessage(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(Object o) {

            }
        };
        HttpUtil.httpStringGetReques(mContext,urlStr,listener);
    }
}
