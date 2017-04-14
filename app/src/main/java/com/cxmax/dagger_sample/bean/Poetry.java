package com.cxmax.dagger_sample.bean;

import javax.inject.Inject;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-13.
 */

public class Poetry {
    public String poem;

    @Inject
    public Poetry() {
        poem = "牛逼牛逼牛逼牛逼牛逼";
    }

    public Poetry(String poem) {
        this.poem = poem;
    }

    public String getPoem() {
        return poem;
    }
}
