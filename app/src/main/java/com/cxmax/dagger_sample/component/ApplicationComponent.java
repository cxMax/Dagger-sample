package com.cxmax.dagger_sample.component;

import com.cxmax.dagger_sample.DemoApplication;
import com.cxmax.dagger_sample.MainActivity;
import com.cxmax.dagger_sample.module.AndroidModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */
@Singleton
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication application);
}
