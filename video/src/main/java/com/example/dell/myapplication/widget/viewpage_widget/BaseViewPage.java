package com.example.dell.myapplication.widget.viewpage_widget;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import android.view.View;

import com.example.dell.myapplication.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by dell on 2016/9/13.
 */

public abstract class BaseViewPage<T extends Serializable> extends BaseFragment<ArrayList<T>>{
    protected ArrayList<T> mList = new ArrayList<>();

//    public static final int CARDINAL = 10000;  // 假如是Banner Page页面放大倍数
    protected ViewPager mViewPage;
    private MyFragmentPagerAdapter mFragmentPageAdapter;
    protected IInitBanner mInitBanner;
    private boolean isBanner;
    private boolean isDragging;
    private boolean isDestory;

    @Override
    public void initUi(ArrayList<T> data, View layout) {
         mList.addAll(data);
         initViewPage();
    }

    protected void initViewPage(){
        mViewPage = (ViewPager) getLayout().findViewById(getViewPageResour());
        mFragmentPageAdapter = new MyFragmentPagerAdapter(getChildFragmentManager());
        mViewPage.setAdapter(mFragmentPageAdapter);
        if(isBanner)
        {
            initBanner();
        }
    }

    /**
     * 对Banner进行初始化
     */
    protected void initBanner(){
        mViewPage.setCurrentItem(mList.size()*mInitBanner.CARDINAL/2);
        bannerAutoRun();

    }

    private void bannerAutoRun() {
        isDestory = false;
        mViewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {  //是否用户拖拽的标记变量变更
                switch (state)
                {
                    case ViewPager.SCROLL_STATE_DRAGGING:
                        isDragging = true;
                        break;
                    case ViewPager.SCROLL_STATE_IDLE:
                        isDragging = false;
                        break;
                    default:
                        isDragging = false;
                }
            }
        });
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!isDestory) {
                    if (!isDragging) {
                        int currentItem = mViewPage.getCurrentItem();
                        currentItem++;
                        mViewPage.setCurrentItem(currentItem);
                    }
                    handler.postDelayed(this, mInitBanner.getIntervalTime());
                }
            }
        },mInitBanner.getIntervalTime());
    }

    /**
     * 返回布局资源,如果需要更改布局的话请重写该方法
     * @return
     */
    protected int getLauoutResour() {
        return R.layout.layout_banner;
    }

    /**
     * 返回ViewPage资源,如果需要更改布局的话请重写该方法
     * @return
     */
    protected int getViewPageResour()
    {
        return R.id.banner_viewpage;
    }

    public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter
    {

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            T t = mList.get(position);
            BaseFragment<T> page = getPage(t);
            return page;
        }

        @Override
        public int getCount() {
            int num = 1;
            if(isBanner){
                num = mInitBanner.CARDINAL;
            }
            return mList.size()*num;
        }
    }

    /**
     * 返回子页面的方法
     * @param t
     * @return
     */
    protected abstract BaseFragment<T> getPage(T t);

    /**
     * 根据返回值切换是否是Banner如果是Banner需要进行部分逻辑处理
     * @return
     */
//    protected abstract boolean isBanner();

    /**
     * 当viewPage是banner的时候必须先调用
     * @param InitBanner
     */
    public void setmInitBanner(IInitBanner InitBanner)
    {
        this.isBanner = true;
        this.mInitBanner = InitBanner;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        isDestory = true;   //销毁后不应该滚动
    }

    public void rePlaceViewPage(List<T> dataList){  //跟新viewPage的方法
        mList.clear();
        mList.addAll(dataList);
        mFragmentPageAdapter.notifyDataSetChanged();
    }
}
