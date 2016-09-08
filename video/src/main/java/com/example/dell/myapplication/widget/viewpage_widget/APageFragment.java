package com.example.dell.myapplication.widget.viewpage_widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dell on 2016/9/8.
 */
public abstract class APageFragment extends Fragment{

    private View mLayout;
    private IViewPageData viewPageDate;
    private int mPageResour;

    public APageFragment(IViewPageData data,int pageResour)
    {
        this.viewPageDate = data;
        this.mPageResour = pageResour;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mLayout = inflater.inflate(mPageResour, null);
        initUi(viewPageDate,mLayout);
        return mLayout;
    }
    public abstract void initUi(IViewPageData data,View layout);
}
