package com.example.dell.myapplication.model;

import com.example.dell.myapplication.bean.CommentBean;
import com.example.dell.myapplication.bean.VideoBean;

import java.util.List;

/**
 * Created by dell on 2016/9/6.
 */
public class VideoDetailFragmentData {

    /**
     * id : 20
     * cid : 4
     * url : http://huihewoodencrafts.com/telecom/omzp/om0004.mp4
     * face : http://app.jeoib.com:8092/bao/ll_01128.jpg
     * title : 奴隶美少女
     * flag : 0
     * like : 21
     * share : 9
     * comment : 34
     */

    private VideoBean video;
    /**
     * id : 5
     * username : Candy
     * content : 好痒啊，求插，(*^__^*) 嘻嘻……
     * avatar : http://q.qlogo.cn/headimg_dl?dst_uin=3183066638&amp;spec=100&amp;img_type=png
     * replytime : 2016-09-06 14:00:42
     */

    private List<CommentBean> comments;

    public VideoBean getVideo() {
        return video;
    }

    public void setVideo(VideoBean video) {
        this.video = video;
    }

    public List<CommentBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentBean> comments) {
        this.comments = comments;
    }
}
