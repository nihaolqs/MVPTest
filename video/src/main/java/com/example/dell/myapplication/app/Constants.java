package com.example.dell.myapplication.app;

/**
 * Created by dell on 2016/9/5.
 */
public class Constants {

    public static final class ApiCline
    {
         private final static String BASE_URL = "http://app.97aita.com/Api/";// 服务器API接口
         public final static String NOTIFY_WFT = BASE_URL + "Order/wft";
         public final static String VIDEO_HOME = BASE_URL + "Video/getHome";
         public final static String CHANNEL_LIST = BASE_URL + "Channel/getList";
         public final static String VIDEO_BY_CHANNEL = BASE_URL + "Video/getByChannel/cid/%d";
         public final static String VIDEO_BY_ID = BASE_URL + "Video/getInfo/id/%d";
         public final static String COMMENT_BY_VID = BASE_URL + "Comment/getByVid/vid/%d";
         public final static String ACTIVE_VIP = BASE_URL + "Order/active/code/%s";
         public final static String ORDER_LOG = BASE_URL + "Order/log";
    }
}
