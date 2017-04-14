package com.cxmax.dagger_sample.bean;

import javax.inject.Inject;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */

public class Test2 {
    private int a;

    @Inject
    public Test2(int a) {
        this.a = a;
    }
}
