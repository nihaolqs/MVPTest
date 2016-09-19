package com.example.dell.myapplication.Ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.myapplication.widget.viewpage_widget.BaseFragment;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/8.
 */
public abstract class  BaseRecyerViewFragment<T extends Serializable> extends BaseFragment<T>{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        initRecyerView();
        return mLayout;
    }

    protected void initRecyerView()
    {
        RecyclerView recyclerView = getRecyclerView();
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(getBaseRecyclerViewAdapter());
        initRecyerViewHeader(recyclerView);
    }

    /**
     * 为RecyclerView添加Header的方法
     * @param recyclerView
     */
    protected abstract void initRecyerViewHeader(RecyclerView recyclerView);

    /**
     * 延时到具体子类InitUI后返回RecyClerView 钩子方法
     * @return
     */
    protected abstract RecyclerView getRecyclerView();

    /**
     * 返回布局管理器
     * @return
     */
    public abstract RecyclerView.LayoutManager getLayoutManager();

    /**
     * 返回适配器
     * @return
     */
    public abstract RecyclerView.Adapter getBaseRecyclerViewAdapter();
}
