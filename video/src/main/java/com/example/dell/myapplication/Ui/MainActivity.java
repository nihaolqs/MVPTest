package com.example.dell.myapplication.Ui;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.myapplication.R;
import com.example.dell.myapplication.Ui.fragment.HomeFragment;
import com.example.dell.myapplication.widget.viewpage_widget.FragmentFactory;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        HomeFragment fragment = FragmentFactory.getFragment(HomeFragment.class,null);
        ft.replace(R.id.fl_main,fragment);
        ft.commit();
    }
}
