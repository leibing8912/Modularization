package cn.jianke.libb;

import android.content.Context;

/**
 * @className: DensityUtil
 * @classDescription: 屏幕显示密度单位转换工具
 * @author: leibing
 * @createTime: 2017/3/7
 */
public class DensityUtil {
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     * @author leibing
     * @createTime 2017/3/7
     * @lastModify 2017/3/7
     * @param context
     * @param dpValue
     * @return
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     * @author leibing
     * @createTime 2017/3/7
     * @lastModify 2017/3/7
     * @param context
     * @param pxValue
     * @return
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
