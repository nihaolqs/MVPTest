package com.example.dell.myapplication.Ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.myapplication.widget.viewpage_widget.BaseFragment;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/8.
 */
public abstract class  BaseRecyerViewFragment<T extends Serializable> extends BaseFragment<T>{



    protected abstract void initFindView(View layout);

    public View getLayout() {
        return super.mLayout;
    }

    public LayoutInflater getInflater(){
        return mInflater;
    }

}
