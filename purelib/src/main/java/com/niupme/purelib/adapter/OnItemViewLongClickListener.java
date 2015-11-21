package com.niupme.purelib.adapter;

import android.view.View;

/**
 * 长按事件
 * User: liulongzhenhai(longzhenhai.liu@qyer.com)
 * Date: 2015-11-21
 */
public interface OnItemViewLongClickListener<T> {

    void onItemViewLongClick(int position, View clickView, T t);

}
