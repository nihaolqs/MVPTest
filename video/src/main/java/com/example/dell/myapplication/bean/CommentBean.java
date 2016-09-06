package com.example.dell.myapplication.bean;

/**
 * Created by dell on 2016/9/6.
 */
public class CommentBean {

    /**
     * id : 11
     * username : 永恒的太阳丶
     * content : 好烦啊，用了这个软件每天都要打飞机，会不会很影响身体健康？
     * avatar : http://q.qlogo.cn/headimg_dl?dst_uin=2241599860&amp;spec=100&amp;img_type=png
     */

    private String id;
    private String username;
    private String content;
    private String avatar;
    /**
     * replytime : 2016-09-06 14:00:42
     */

    private String replytime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime;
    }
}
