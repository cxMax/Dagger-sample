package com.cxmax.dagger_sample.module;

import android.content.Context;
import android.location.LocationManager;

import com.cxmax.dagger_sample.DemoApplication;
import com.cxmax.dagger_sample.bean.Test;

import javax.inject.Singleton;

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
public class AndroidModule {
    private final DemoApplication demoApplication;

    public AndroidModule(DemoApplication demoApplication) {
        this.demoApplication = demoApplication;
    }

    @Provides
    Context ApplicationContext() {
        return demoApplication;
    }

    @Provides
    LocationManager provideLocationManager() {
        return (LocationManager) demoApplication.getSystemService(Context.LOCATION_SERVICE);
    }

    @Provides
    Test provideTest() {
        return new Test(demoApplication);
    }

}
