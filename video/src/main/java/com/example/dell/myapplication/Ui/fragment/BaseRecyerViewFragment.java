package com.example.dell.myapplication.Ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.myapplication.widget.viewpage_widget.BaseFragment;

/**
 * Created by dell on 2016/9/8.
 */
public abstract class BaseRecyerViewFragment extends BaseFragment{
    protected LayoutInflater mInflater;
    protected View mLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.mInflater = inflater;
        mLayout = inflater.inflate(getFragmentLayoutResurce(), null);
        initUI();
        return null;
    }

    protected void initUI(){
        initFindView(getLayout());
    }

    protected abstract void initFindView(View layout);

    public View getLayout() {
        return mLayout;
    }

    public LayoutInflater getInflater(){
        return mInflater;
    }

    public abstract int getFragmentLayoutResurce();
}
