package com.cxmax.dagger_sample.component;

import com.cxmax.dagger_sample.anotation.PerActivity;
import com.cxmax.dagger_sample.module.Cmodule;

import dagger.Component;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */
@Component(dependencies = MainComponent.class , modules = Cmodule.class)
public interface MainActivityComponent {
}
