package com.example.dell.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.myapplication.R;

/**
 * Created by dell on 2016/9/19.
 */

public class ChannelListHolder extends RecyclerView.ViewHolder{

    private final ImageView mIvChannelFace;
    private final TextView mTvChannelTitle;

    public ChannelListHolder(View itemView) {
        super(itemView);
        mIvChannelFace = (ImageView) itemView.findViewById(R.id.iv_channel_item_faceimg);
        mTvChannelTitle = (TextView) itemView.findViewById(R.id.tv_channel_item_title);
    }

    public ImageView getmIvChannelFace() {
        return mIvChannelFace;
    }

    public TextView getmTvChannelTitle() {
        return mTvChannelTitle;
    }
}
