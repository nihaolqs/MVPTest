package com.example.dell.myapplication.utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by dell on 2016/9/5.
 */
public class HttpRequestQueue {
    private static HttpRequestQueue mInstance;
    private RequestQueue mQueue;
    private Context mContext;
    private HttpRequestQueue(Context context)
    {
        this.mContext = context.getApplicationContext();
        this.mQueue = Volley.newRequestQueue(mContext);
    }

    public static HttpRequestQueue getInstance(Context context){
        if(mInstance == null)
        {
          mInstance = new HttpRequestQueue(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue()
    {
        return this.mQueue;
    }
}
