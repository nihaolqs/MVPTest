package com.example.dell.myapplication.widget.viewpage_widget;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/9/8.
 * 模板方法设计
 */
public abstract class BaseViewPage extends Fragment implements ViewPager.OnPageChangeListener {

    public static final int MULTI = 10000;
    private int anInt;
    private Context mContext;
    private View mLayout;
    private ViewPager viewPage;
    private List<IViewPageData> mList = new ArrayList<>();

    private boolean isAutoRunOpen;
    private boolean isUserDrag;

    public BaseViewPage(Context context)
    {
        mContext = context;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mLayout = inflater.inflate(R.layout.layout_banner, null);
        initUI();
        return mLayout;
    }

    protected void initUI() {
        viewPage = (ViewPager) mLayout.findViewById(R.id.banner_viewpage);
        FragmentManager fm = getChildFragmentManager();
        PagerAdapter adapter =new MyPageAdapter(fm);
        viewPage.setAdapter(adapter);
        if(isBanner())
        {
            initBanner();
        }
    }

    protected void initBanner()   //如果是Banner时进行进一步的处理
    {
        viewPage.setCurrentItem(mList.size()/2);
        if(isAutoRun())
        {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(isAutoRunOpen&&!isUserDrag) {
                        int currentItem = viewPage.getCurrentItem();
                        currentItem++;
                        viewPage.setCurrentItem(currentItem);
                    }
                    handler.postDelayed(this,3000);
                }
            },3000);
            viewPage.addOnPageChangeListener(this);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if(state == ViewPager.SCROLL_STATE_DRAGGING){
            isUserDrag = true;
        }else if(state == ViewPager.SCROLL_STATE_SETTLING){
            isUserDrag =false;
        }
    }

    class MyPageAdapter extends FragmentStatePagerAdapter {


        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            if(isBanner())
            {
                anInt = mList.size() * MULTI;
                return anInt;   //为了做循环二使用基数
            }else{
                return mList.size();
            }
        }

        @Override
        public Fragment getItem(int position) {

            return getPageFragment(mList.get(position%mList.size()));   //主要是为了考虑到有时候需要用在Banner上面的时候需要循环播放时的逻辑处理
        }
    }

    /**
     * @param  data
     * @return Fragment 可通过继承抽象类BaseFragment快速实现
     */
    protected abstract BaseFragment getPageFragment(IViewPageData data);

    protected abstract boolean isBanner();  //判断是否是Banner的钩子方法

    protected abstract boolean isAutoRun();  //是否要自动滚动的

    protected void setIsAutoRunOpen(boolean isOpen)
    {
        this.isAutoRunOpen = isOpen;
    }
}
