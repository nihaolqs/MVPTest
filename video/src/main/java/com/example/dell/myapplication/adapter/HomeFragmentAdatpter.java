package com.example.dell.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.Ui.fragment.HomeFragment;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.utils.HttpUtil;

import java.util.List;

/**
 * Created by dell on 2016/9/12.
 */
public class HomeFragmentAdatpter extends BaseRecyclerViewAdapter<VideoListHolder,VideoBean>{

    public HomeFragmentAdatpter(Context context, List<VideoBean> list) {
        super(context, list);
    }

    @Override
    protected int getItemLayoutResoures() {
        return R.layout.layout_videolist_item;
    }

    @Override
    protected VideoListHolder setItemView2Holder(View itemView) {
        return new VideoListHolder(itemView);
    }

    @Override
    protected void initViewHolder(VideoListHolder holder, VideoBean data) {
        String title = data.getTitle();
        String face = data.getFace();
        ImageView imageView = holder.getmIvVideoImage();
        HttpUtil.LolderImage(getmContext(),imageView,face);

    }
}


