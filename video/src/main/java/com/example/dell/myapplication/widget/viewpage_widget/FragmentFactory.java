package com.example.dell.myapplication.widget.viewpage_widget;

import android.os.Bundle;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/14.
 */

public class FragmentFactory {
    public static final String BUNDLE_KEY= "bundle_key";

    /**
     *  备注
     * @param tClass BaseFragment的子类
     * @param data  附加数据可以为NULL 多参数通过容器导入
     * @param tClass 泛型传入子类
     * @return BaseFragment对象
     */
    public static<S extends Serializable,T extends BaseFragment<S>> T getFragment(Class<T> tClass,S data) {
        T t = null;
        try {
            t = tClass.newInstance();
            Bundle bundle= new Bundle();
            bundle.putSerializable(BUNDLE_KEY,data);
            t.setArguments(bundle);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
