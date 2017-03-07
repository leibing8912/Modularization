package cn.jianke.libc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;

/**
 * @className:PackageUtil
 * @classDescription: 包工具
 * @author: leibing
 * @createTime: 2016/11/9
 */

public class PackageUtil {

    /**
     * 判断是否微信可用
     * @author leibing
     * @createTime 2016/11/9
     * @lastModify 2016/11/9
     * @param context
     * @return
     */
    public static boolean isWeixinAvilible(Context context) {
        // 获取packagemanager
        final PackageManager packageManager = context.getPackageManager();
        // 获取所有已安装程序的包信息
        List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equals("com.tencent.mm")) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 判断QQ是否可用
     * @author leibing
     * @createTime 2016/11/9
     * @lastModify 2016/11/9
     * @param context
     * @return
     */
    public static boolean isQQClientAvailable(Context context) {
        final PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);
        if (pinfo != null) {
            for (int i = 0; i < pinfo.size(); i++) {
                String pn = pinfo.get(i).packageName;
                if (pn.equals("com.tencent.mobileqq")) {
                    return true;
                }
            }
        }
        return false;
    }
}
