package com.example.dell.myapplication.Ui.activity;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.utils.HttpUtil;

/**
 * Created by dell on 2016/9/18.
 */

public class WelcomeActivity extends Activity{
    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_welcome,null);
        initUI(layout);
        return layout;
    }

    private void initUI(View layout) {
        ImageView wacImage = (ImageView) layout.findViewById(R.id.iv_wac_img);


    }
}
