package com.niupme.purelib.adapter;

import android.view.View;

/**
 * item的click事件
 * User: liulongzhenhai(longzhenhai.liu@qyer.com)
 * Date: 2015-11-21
 */
public interface OnItemViewClickListener<T> {

    void onItemViewClick(int position, View clickView, T t);

}
