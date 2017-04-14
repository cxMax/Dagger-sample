package com.cxmax.dagger_sample.bean;

import android.location.LocationManager;

import javax.inject.Inject;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */

public class Test3 {

    private LocationManager locationManager;


    @Inject
    public Test3(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

}
