package cn.jianke.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.jianke.liba.LibaActivity;
import cn.jianke.liba.StringUtil;
import cn.jianke.libb.DensityUtil;
import cn.jianke.libb.LibbActivity;
import cn.jianke.libc.PackageUtil;
import cn.jianke.modularization.ImageLoader;

/**
 * @className: MainActivity
 * @classDescription: 测试组件化页面
 * @author: leibing
 * @createTime: 2017/3/7
 */
public class MainActivity extends AppCompatActivity {
    // log tag
    private final static String TAG = "MainActivity";
    // 图片加载
    private ImageView imgOneIv, imgTwoIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // findView
        imgOneIv = (ImageView) findViewById(R.id.iv_img_one);
        imgTwoIv = (ImageView) findViewById(R.id.iv_img_two);
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
        // load img
        String oneUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1491635599670&di=4461cd5117b50f3877ecd102d845b206&imgtype=0&src=http%3A%2F%2Fimg.dongqiudi.com%2Fuploads%2Favatar%2F2017%2F01%2F07%2F2dZPvOhfdy_thumb_1483779927583.jpg";
        ImageLoader.getInstance().load(this, imgOneIv, oneUrl);
        String twoUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1491635599670&di=3447c8c3a4f75c04ecdabff29c40c67d&imgtype=0&src=http%3A%2F%2Fn1.itc.cn%2Fimg8%2Fwb%2Frecom%2F2016%2F08%2F09%2F147068723173354358.JPEG";
        Glide.with(this).load(twoUrl).into(imgTwoIv);
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
