package com.niupme.purephoto.bean;

import android.graphics.Bitmap;

/**
 * 图片列表页
 * User: liulongzhenhai(longzhenhai.liu@qyer.com)
 * Date: 2015-11-21
 */
public class PhotoListItem {

    /**
     * 标题内容
     */
    private String title;
    /**
     * 时间,只包括开始时间
     */
    private String time;
    /**
     * 缩略图,存放在数据库
     */
    private Bitmap thumbnails;
    /**
     * 文件名
     */
    private String fileName;

    private String filePath;
}
