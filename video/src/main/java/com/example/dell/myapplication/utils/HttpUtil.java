package com.example.dell.myapplication.utils;

import android.content.Context;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.example.dell.myapplication.R;

/**
 * Created by dell on 2016/9/5.
 * Volley网络请求封装方法
 */
public class HttpUtil {
    public static void httpStringGetReques(Context context,String url,HttpResponseListener listener)
    {
        RequestQueue requestQueue = HttpRequestQueue.getInstance(context).getRequestQueue();
        StringRequest stringRequest = new StringRequest(Request.Method.GET,url, listener, listener);
        requestQueue.add(stringRequest);
    }

    public static void LolderImage(Context context,ImageView imageView,String imageUrl)
    {
        ImageLoader imageLoader = MyImageLoader.getInstance(context);
        ImageLoader.ImageListener imageListener = ImageLoader.getImageListener(imageView, R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        imageLoader.get(imageUrl,imageListener);
    }
}
