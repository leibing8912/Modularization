package cn.jianke.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import cn.jianke.liba.StringUtil;
import cn.jianke.libb.DensityUtil;
import cn.jianke.libc.PackageUtil;

/**
 * @className: MainActivity
 * @classDescription: 测试组件化页面
 * @author: leibing
 * @createTime: 2017/3/7
 */
public class MainActivity extends AppCompatActivity {
    // log tag
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // printer liba class method
        Log.e(TAG, "--StringUtil#" + StringUtil.getObject(MainActivity.class.getName()));
        // printer libb class method
        Log.e(TAG, "--DensityUtil#" + DensityUtil.dip2px(this, 10));
        // printer libb class method
        Log.e(TAG, "--PackageUtil#" + PackageUtil.isQQClientAvailable(this));
    }
}
