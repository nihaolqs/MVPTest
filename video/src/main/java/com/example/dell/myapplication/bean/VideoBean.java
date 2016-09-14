package com.example.dell.myapplication.bean;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/5.
 */
public class VideoBean implements Serializable {
    private int id;  //视频ＩＤ
    private int cid; //频道
    private String url; //视频地址
    private String face; // 封面地址
    private String title; //标题
    private byte flag; //标志位
    private int like; //喜欢数
    private int comment; //评论数

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }
}

