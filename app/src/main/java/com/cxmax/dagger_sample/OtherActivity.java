package com.cxmax.dagger_sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.cxmax.dagger_sample.bean.Poetry;
import com.google.gson.Gson;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */

public class OtherActivity extends Activity {
    @BindView(R.id.hello_tv)
    TextView hello;

    @Inject
    Poetry poetry;
    @Inject
    Gson gson;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        setData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    private void initComponent() {
        DaggerMainComponent.builder()
                .build()
                .inject(this);
        unbinder = ButterKnife.bind(this);
    }

    private void setData() {
        hello.setText(gson.toJson(poetry));
    }
}
