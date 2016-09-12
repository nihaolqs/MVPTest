package com.example.dell.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.myapplication.R;

/**
 * Created by dell on 2016/9/12.
 */
public class VideoListHolder extends RecyclerView.ViewHolder{
    private ImageView mIvVideoImage;
    private TextView mTvVideoTitle;

    public VideoListHolder(View itemView) {
        super(itemView);
        mIvVideoImage = (ImageView) itemView.findViewById(R.id.iv_vlt_video_image);
        mTvVideoTitle = (TextView) itemView.findViewById(R.id.tv_vlt_video_name);
    }

    public ImageView getmIvVideoImage() {
        return mIvVideoImage;
    }

    public void setmIvVideoImage(ImageView mIvVideoImage) {
        this.mIvVideoImage = mIvVideoImage;
    }

    public TextView getmTvVideoTitle() {
        return mTvVideoTitle;
    }

    public void setmTvVideoTitle(TextView mTvVideoTitle) {
        this.mTvVideoTitle = mTvVideoTitle;
    }
}
