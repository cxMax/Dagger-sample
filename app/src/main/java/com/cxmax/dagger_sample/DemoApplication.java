package com.cxmax.dagger_sample;

import android.app.Application;
import android.location.LocationManager;



import javax.inject.Inject;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */

public class DemoApplication extends Application {
    @Inject
    LocationManager manager;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder()
                .build()
                .inject(this);
    }
}
