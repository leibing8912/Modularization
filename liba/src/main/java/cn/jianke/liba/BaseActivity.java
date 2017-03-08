package cn.jianke.liba;

import android.app.Activity;
import android.content.Intent;

/**
 * @className: BaseActivity
 * @classDescription: base activity
 * @author: leibing
 * @createTime: 2017/3/8
 */
public class BaseActivity extends Activity{
    /**
     * go to new page
     * @author leibing
     * @createTime 2017/3/8
     * @lastModify 2017/3/8
     * @param pageCls page cls
     * @return
     */
    public void turnToNewPage(Class pageCls){
        Intent intent = new Intent();
        intent.setClass(this, pageCls);
        startActivity(intent);
    }
}
