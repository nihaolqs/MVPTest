package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.VideoBean;

import java.util.List;

/**
 * Created by dell on 2016/9/5.
 */
public class HomeFragmentData {

    /**
     * id : 1
     * cid : 2
     * url : http://125.64.98.13/xdispatch/o8h2s12kh.bkt.clouddn.com/20.mp4
     * face : https://img.alicdn.com/imgextra/i4/1034084009/TB24.tuqVXXXXbDXpXXXXXXXXXX-1034084009.jpg
     * title : 操到她潮喷不止
     * flag : 0
     */

    private List<VideoBean> banner;
    /**
     * id : 5
     * cid : 2
     * url : http://dd.wgwee.xyz:8823/video/hot2.mp4
     * face : http://app.jeoib.com:8092/bao/hot2.jpg
     * title : 超市未夜眠
     * flag : 1
     */

    private List<VideoBean> videos;

    public List<VideoBean> getBanner() {
        return banner;
    }

    public void setBanner(List<VideoBean> banner) {
        this.banner = banner;
    }

    public List<VideoBean> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoBean> videos) {
        this.videos = videos;
    }
}