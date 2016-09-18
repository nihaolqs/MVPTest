package com.example.dell.myapplication.model;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.utils.HttpResponseListener;
import com.example.dell.myapplication.utils.HttpUtil;
import com.example.dell.myapplication.utils.IHttpRequesedListener;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/9/18.
 */

public class ChannelModel implements IChannelModel {
    private Context mContext;
    private ArrayList<ChannelBean> mList = new ArrayList<>();

    public ChannelModel(Context context)
    {
        this.mContext = context;
    }
    @Override
    public List<ChannelBean> getChannelList() {
        return this.mList;
    }

    @Override
    public void replaceData(final IHttpRequesedListener httpRequesedListener) {
        String channelListUrl = Constants.ApiCline.CHANNEL_LIST;

        HttpUtil.httpStringGetReques(mContext, channelListUrl, new HttpResponseListener<String>() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(mContext,"加载频道数据失败",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String s) {
                Gson gson = new Gson();
                Type type = new TypeToken<List<ChannelBean>>() {
                }.getType();
                mList = gson.fromJson(s, type);
                httpRequesedListener.requesed();
            }
        });
    }
}
