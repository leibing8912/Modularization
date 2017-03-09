package cn.jianke.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import cn.jianke.liba.LibaActivity;
import cn.jianke.liba.StringUtil;
import cn.jianke.libb.DensityUtil;
import cn.jianke.libb.LibbActivity;
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
        // onClick
        findViewById(R.id.btn_go_to_module_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToNewPage(LibaActivity.class);
            }
        });
        findViewById(R.id.btn_go_to_module_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToNewPage(LibbActivity.class);
            }
        });
    }

    /**
     * go to new page
     * @author leibing
     * @createTime 2017/3/8
     * @lastModify 2017/3/8
     * @param pageCls page cls
     * @return
     */
    private void turnToNewPage(Class pageCls){
        Intent intent = new Intent();
        intent.setClass(this, pageCls);
        startActivity(intent);
    }
}
