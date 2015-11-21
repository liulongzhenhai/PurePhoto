package com.niupme.purephoto.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.niupme.purephoto.bean.PhotoListItem;

import java.util.List;

/**
 * User: liulongzhenhai(longzhenhai.liu@qyer.com)
 * Date: 2015-11-21
 */
public class PhotoListAdapter extends RecyclerView.Adapter {



    /**
     * 设置列表
     * @param list
     */
    public void setList(List<PhotoListItem> list){

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {


        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }
}
