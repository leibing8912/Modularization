package cn.jianke.libb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * @className: LibbActivity
 * @classDescription: lib b page
 * @author: leibing
 * @createTime: 2017/3/9
 */
public class LibbActivity extends AppCompatActivity {
    // lib b fragment
    private LibbFragment mLibbFragment;
    // lib b second fragment
    private LibbSecondFragment mLibbSecondFragment;
    // is savedInstanceState not null
    private boolean isSavedNotNull = false;
    // fragment index
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libb);
        // onClick
        findViewById(R.id.btn_switch_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index ++;
                switchFragment(index);
            }
        });
        if (savedInstanceState == null){
            initFragmentCommit();
            isSavedNotNull = false;
        }else {
            isSavedNotNull = true;
        }
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if (isSavedNotNull){
            isSavedNotNull = false;
            initFragmentCommit();
        }
    }

    /**
     * init fragment
     * @author leibing
     * @createTime 2017/3/9
     * @lastModify 2017/3/9
     * @param
     * @return
     */
    private void initFragmentCommit(){
        mLibbFragment = LibbFragment.instance();
        mLibbSecondFragment = LibbSecondFragment.instance();
        getFragmentManager().beginTransaction()
                .add(R.id.ly_container,mLibbFragment)
                .add(R.id.ly_container, mLibbSecondFragment)
                .show(mLibbFragment)
                .hide(mLibbSecondFragment)
                .commit();
    }

    /**
     * switch fragment by index
     * @author leibing
     * @createTime 2017/3/9
     * @lastModify 2017/3/9
     * @param
     * @return
     */
    private void switchFragment(int i){
        if (i % 2 == 1){
            getFragmentManager().beginTransaction()
                    .hide(mLibbFragment)
                    .show(mLibbSecondFragment)
                    .commit();
        }else {
            getFragmentManager().beginTransaction()
                    .show(mLibbFragment)
                    .hide(mLibbSecondFragment)
                    .commit();
        }
    }
}
