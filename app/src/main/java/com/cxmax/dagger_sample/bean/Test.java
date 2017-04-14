package com.cxmax.dagger_sample.bean;

import android.content.Context;

import javax.inject.Inject;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */

public class Test {
    Context context;
    @Inject
    public Test(Context context) {
        this.context = context;
    }
}
