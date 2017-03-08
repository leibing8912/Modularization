package cn.jianke.liba;

import android.os.Bundle;
import android.view.View;

/**
 * @className: LibaActivity
 * @classDescription: module a page
 * @author: leibing
 * @createTime: 2017/3/8
 */
public class LibaActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liba);
        // onClick
        findViewById(R.id.btn_liba_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                turnToNewPage(LibaSecondActivity.class);
            }
        });
    }
}
