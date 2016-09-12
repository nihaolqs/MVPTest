package com.example.dell.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/9/12.
 */
public abstract class BaseRecyclerViewAdapter<T extends RecyclerView.ViewHolder,S> extends RecyclerView.Adapter<T>{

    private final List<S> mDataList;
//    private final Class<T> mTClass;
    private Context mContext;

    public BaseRecyclerViewAdapter (Context context, List<S> list)
    {
        this.mContext = context;
        this.mDataList = list;
//        this.mTClass = tClass;
    }
    @Override
    public T onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View latyout = layoutInflater.inflate(getItemLayoutResoures(), parent);
//        T t = getItemHolder(mTClass);
        T t = setItemView2Holder(latyout);
        return t;
    }

    @Override
    public void onBindViewHolder(T holder, int position) {
        initViewHolder(holder,mDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public Context getmContext()
    {
        return this.mContext;
    }

    /**
     * @return 返回行布局ID
     */
    protected abstract int getItemLayoutResoures();

    protected abstract T setItemView2Holder(View itemView);

    protected abstract void initViewHolder(T holder,S data);


//    private T getItemHolder(Class<T> tClass)
//    {
//        T t = null;
//        try {
//            t = tClass.newInstance();
//
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        if(t == null)
//        {
//            Toast.makeText(mContext,"VideoList列表行布局实例化失败",Toast.LENGTH_SHORT).show();
//        }
//        return t;
//    }

}
