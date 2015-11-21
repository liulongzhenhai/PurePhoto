package com.niupme.purephoto.activity.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.niupme.purephoto.R;
import com.niupme.purephoto.activity.main.view.MapPhotoView;
import com.niupme.purephoto.activity.main.view.PhotoListView;
import com.niupme.purephoto.activity.main.view.PhotoMangerView;
import com.niupme.purephoto.activity.main.view.SettingView;
import com.niupme.purephoto.view.BaseMainView;

//添加注释
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private LinearLayout mContentLayout;//容器view

    private int mSelectId;
    private PhotoListView mPhotoListView;
    private PhotoMangerView mPhotoMangerView;
    private SettingView mSettingView;
    private MapPhotoView mMapPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        changeView(item.getItemId());
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initView() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mContentLayout=(LinearLayout)findViewById(R.id.content_layout);
        changeView(R.id.nav_photo);
    }

    //更新非让没跟他的试图
    private void changeView(int id) {

        if (mSelectId == id) {
            return;
        }
        BaseMainView baseMainView = null;
        if (id == R.id.nav_map) { //地图图片

            if (mMapPhotoView == null) {
                mMapPhotoView = new MapPhotoView(this);
            }
            baseMainView = mMapPhotoView;
        } else if (id == R.id.nav_setting) {//设置

            if (mSettingView == null) {
                mSettingView = new SettingView(this);
            }
            baseMainView = mSettingView;
        } else if (id == R.id.nav_manger) {//图片管理

            if (mPhotoMangerView == null) {
                mPhotoMangerView = new PhotoMangerView(this);
            }
            baseMainView = mPhotoMangerView;
        } else if (id == R.id.nav_photo) {//图片列表

            if (mPhotoListView == null) {
                mPhotoListView = new PhotoListView(this);
            }
            baseMainView = mPhotoListView;
        }
        if (baseMainView != null) {
            mContentLayout.removeAllViews();
            //再考虑动画
            mContentLayout.addView(baseMainView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            baseMainView.viewShow();
        }

    }
}
