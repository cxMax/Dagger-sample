package com.cxmax.dagger_sample.module;

import android.location.LocationManager;

import com.cxmax.dagger_sample.anotation.PerActivity;
import com.cxmax.dagger_sample.anotation.Type;
import com.cxmax.dagger_sample.bean.Test2;
import com.cxmax.dagger_sample.bean.Test3;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

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
public class Cmodule {

    @PerActivity
    @Provides
    Test3 provideBoy(LocationManager manager) {
        return new Test3(manager);
    }

    @Named("man")
    @PerActivity
    @Provides
    Test2 provideMan(int a) {
        return new Test2(a);
    }

    @Named("woman")
    @PerActivity
    @Provides
    Test2 provideWoman(int b) {
        return new Test2(b);
    }

    @Type("employee")
    @PerActivity
    @Provides
    Test2 provideEmployee(int a) {
        return new Test2(a);
    }

    @Type("boss")
    @PerActivity
    @Provides
    Test2 provideBoss(int a) {
        return new Test2(a);
    }
}
