package com.example.dell.myapplication.Ui.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.bean.VideoBean;
import com.example.dell.myapplication.utils.HttpUtil;
import com.example.dell.myapplication.widget.viewpage_widget.BaseFragment;
import com.example.dell.myapplication.widget.viewpage_widget.BaseViewPage;
import com.example.dell.myapplication.widget.viewpage_widget.FragmentFactory;

import java.io.Serializable;

/**
 * Created by dell on 2016/9/14.
 */

public class HomeBannerFragment extends BaseViewPage<VideoBean>{

    @Override
    protected BaseFragment<VideoBean> getPage(VideoBean videoBean) {

        return FragmentFactory.getFragment(FragmentPage.class,videoBean);
    }

    public static class FragmentPage extends BaseFragment<VideoBean>{

        private ImageView mIvVideoFace;
        private TextView mTvVideoTitle;

        @Override
        public void initUi(VideoBean data, View layout) {
            initFindView(layout);
            showView(data);
        }

        private void showView(VideoBean data) {
            if(data != null){

                mTvVideoTitle.setText(data.getTitle());
                HttpUtil.LolderImage(getContext(),mIvVideoFace,data.getFace());
            }
        }

        private void initFindView(View layout) {
            mIvVideoFace = (ImageView) layout.findViewById(R.id.iv_banner_video_face);
            mTvVideoTitle = (TextView) layout.findViewById(R.id.tv_banner_video_title);
            Log.e("mTvVideoTitle",mTvVideoTitle +"");
            Log.e("layout",layout +"");
            Log.e("tv_banner_video_title",R.id.tv_banner_video_title +"");
            Log.e("mIvVideoFace",mIvVideoFace+"");
        }

        @Override
        protected int getLauoutResour() {
            return R.layout.fragment_banner_page;
        }
    }
}
