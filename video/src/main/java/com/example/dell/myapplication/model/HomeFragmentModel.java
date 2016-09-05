package com.example.dell.myapplication.model;

import com.example.dell.myapplication.app.Constants;
import com.example.dell.myapplication.bean.VideoBean;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragmentModel implements IBannerModel, IVideoListModel{
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
    }
}
