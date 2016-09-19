package com.example.dell.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.bean.ChannelBean;
import com.example.dell.myapplication.utils.HttpUtil;

import java.util.List;

/**
 * Created by dell on 2016/9/19.
 */

public class ChannelFragmentAdapter extends BaseRecyclerViewAdapter<ChannelListHolder,ChannelBean> {
    public ChannelFragmentAdapter(Context context, List list) {
        super(context, list);
    }

    @Override
    protected int getItemLayoutResoures() {
        return R.layout.layout_channel_item;
    }

    @Override
    protected ChannelListHolder setItemView2Holder(View itemView) {
        ChannelListHolder holder = new ChannelListHolder(itemView);
        return holder;
    }

    @Override
    protected void initViewHolder(ChannelListHolder holder, ChannelBean data) {
        String face = data.getFace();
        String title = data.getTitle();
        ImageView imageView = holder.getmIvChannelFace();
        TextView textView = holder.getmTvChannelTitle();
        textView.setText(title);
        HttpUtil.LolderImage(getmContext(),imageView,face);
    }
}
