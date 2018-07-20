package com.okrxt.www.ui.acitivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.okrxt.www.R;
import com.okrxt.www.controller.bast.BaseActivity;
import com.okrxt.www.model.Model;
import com.okrxt.www.model.bean.Bean;
import com.okrxt.www.utils.LogUtil;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Description:
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.bn_main)
    Button bnMain;
    @BindView(R.id.tv_main)
    TextView tvMain;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(Bean bean) {
        LogUtil.e("请求成功");
        tvMain.setText(bean.toString());
    }

    @OnClick(R.id.bn_main)
    public void onViewClicked() {
        bnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"请求中",Toast.LENGTH_SHORT).show();
                Model.getInstance().apiLogin("paramValue1");
            }
        });
    }
}
