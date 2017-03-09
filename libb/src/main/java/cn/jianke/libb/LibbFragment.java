package cn.jianke.libb;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @className: LibbFragment
 * @classDescription: lib b fragment
 * @author: leibing
 * @createTime: 2017/3/9
 */
public class LibbFragment extends BaseFragment{
    // page ref
    private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onDetach() {
        this.context = null;
        super.onDetach();
    }

    /**
     * get lib b fragment instance
     * @author leibing
     * @createTime 2017/3/9
     * @lastModify 2017/3/9
     * @param
     * @return
     */
    public static LibbFragment instance(){
        return new LibbFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_libb, null);
        return view;
    }
}
