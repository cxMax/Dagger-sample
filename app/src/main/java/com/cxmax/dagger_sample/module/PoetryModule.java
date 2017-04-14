package com.cxmax.dagger_sample.module;

import com.cxmax.dagger_sample.bean.Poetry;

import dagger.Module;
import dagger.Provides;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */
@Module
public class PoetryModule {

    @Provides
    public Poetry providePoetry(String poems) {
        return new Poetry(poems);
    }

    @Provides
    public String providePoems() {
        return "草拟嘛草拟嘛草拟嘛草拟嘛草拟嘛";
    }
}
