package com.example.dell.myapplication.widget.viewpage_widget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/8.
 *  S 附加数据类型
 */
public abstract  class BaseFragment<S extends Serializable> extends Fragment{

    protected View mLayout;
    protected S mDate;
    private int mPageResour;
    protected LayoutInflater mInflater;
//    public static final String BUNDLE_KEY= "bundle_key";

    public BaseFragment()
    {
        this.mPageResour = getLayoutResour();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.mInflater = inflater;
        mLayout = inflater.inflate(mPageResour, null);
        initData();
        initUi(mDate,mLayout);
        return mLayout;
    }

    /**
     * 取出附加数据
     */
    protected  void initData(){
        Bundle bundle = getArguments();
        S o = (S) bundle.get(FragmentFactory.BUNDLE_KEY);
        this.mDate = o;
    }


    /**
     * 初始化UI
     * @param data S类型附加数据
     * @param layout Fragment的根布局
     */
    public abstract void initUi(S data,View layout);

    /**
     *  备注
     * @param tClass BaseFragment的子类
     * @param data  附加数据可以为NULL 多参数通过容器导入
     * @param tClass 泛型传入子类
     * @return BaseFragment对象
     */
//    public static <T extends BaseFragment,S extends Serializable> BaseFragment getInstance(Class<T> tClass,S data){
//        T t = null;
//        try {
//            t = tClass.newInstance();
//            Bundle bundle= new Bundle();
//            bundle.putSerializable(BUNDLE_KEY,data);
//            t.setArguments(bundle);
//        } catch (java.lang.InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return t;
//    }

    /**
     *
     * @return 布局资源
     */
    protected abstract int getLayoutResour();

    public View getLayout() {
        return mLayout;
    }
}
