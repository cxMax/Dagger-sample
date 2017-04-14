package com.cxmax.dagger_sample.module;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * @describe : A module for android-specific dependencies which require below params to create
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */
@Module
public class MainModule {

    @Provides
    public Gson provideGson() {
        return new Gson();
    }
}
