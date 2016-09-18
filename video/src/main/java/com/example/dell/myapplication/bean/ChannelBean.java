package com.example.dell.myapplication.bean;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/18.
 */

public class ChannelBean implements Serializable {

    /**
     * id : 1
     * title : 午夜秀场
     * face : http://app.ipicpic.top:8092/bao/lishi_g.jpg
     * update : 8
     */

    private String id;
    private String title;
    private String face;
    private int update;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }
}
