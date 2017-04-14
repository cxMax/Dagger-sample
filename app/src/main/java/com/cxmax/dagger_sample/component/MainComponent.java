package com.cxmax.dagger_sample.component;

import android.location.LocationManager;

import com.cxmax.dagger_sample.MainActivity;
import com.cxmax.dagger_sample.OtherActivity;
import com.cxmax.dagger_sample.anotation.PerActivity;
import com.cxmax.dagger_sample.module.AndroidModule;
import com.cxmax.dagger_sample.module.Cmodule;
import com.cxmax.dagger_sample.module.MainModule;
import com.cxmax.dagger_sample.module.PoetryModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */
@Component(modules = {MainModule.class , PoetryModule.class , AndroidModule.class , Cmodule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);

    void inject(OtherActivity activity);

    LocationManager getLocationManager();

}
