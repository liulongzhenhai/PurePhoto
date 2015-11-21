package com.niupme.purephoto.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * User: liulongzhenhai(longzhenhai.liu@qyer.com)
 * Date: 2015-11-19
 */
public abstract class BaseMainView extends LinearLayout {


    private View mMain;

    public BaseMainView(Context context) {
        super(context);
        initView();
    }

    private void initView() {

        mMain = LayoutInflater.from(getContext().getApplicationContext()).inflate(getLayoutId(), this);
    }

    public View mainFindViewById(int id){

        return mMain.findViewById(id);
    }
    protected void onStart() {
    }

    protected void onPause() {
    }

    protected void onStop() {
    }

    protected void onDestroy() {
    }
    //-----------------------------

    /**
     * 当切换的时候会进行调用,通知view现在在当前
     */
    public abstract void viewShow();

    /**
     * 获取layoutid
     *
     * @return
     */
    protected abstract int getLayoutId();

}
