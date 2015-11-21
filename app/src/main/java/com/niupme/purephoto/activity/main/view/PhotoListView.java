package com.niupme.purephoto.activity.main.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.niupme.purephoto.R;
import com.niupme.purephoto.view.BaseMainView;

/**
 * 图片列表
 * User: liulongzhenhai(longzhenhai.liu@qyer.com)
 * Date: 2015-11-19
 */
public class PhotoListView extends BaseMainView {

    private RecyclerView mList;

    public PhotoListView(Context context) {
        super(context);
        initView();
    }

    @Override
    protected void onDestroy() {
        //清理图片数据
    }

    @Override
    public void viewShow() {

    }

    @Override
    protected int getLayoutId() {

        return R.layout.view_main_photolist;
    }

    private void initView() {

        mList = (RecyclerView) mainFindViewById(R.id.rv_photos);
    }
}
