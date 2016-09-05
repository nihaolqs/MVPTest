package com.example.dell.myapplication.utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;

/**
 * Created by dell on 2016/9/5.
 * ImageLoader的单实例方法
 */
public class MyImageLoader extends ImageLoader{

    private static MyImageLoader Instance;
    private final Context mContext;

    private MyImageLoader(Context context)
    {
        super(HttpRequestQueue.getInstance(context).getRequestQueue(),new BitmapCache());
        mContext = context.getApplicationContext();
    }

    public static ImageLoader getInstance(Context context)
    {
        if (Instance == null)
        {
            Instance = new MyImageLoader(context);
        }
        return Instance;
    }
}
