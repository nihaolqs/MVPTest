package com.example.dell.myapplication.utils;

import com.android.volley.Response;

/**
 * Created by dell on 2016/9/5.
 */
public interface HttpResponseListener<T> extends Response.ErrorListener, Response.Listener<T>{
}
