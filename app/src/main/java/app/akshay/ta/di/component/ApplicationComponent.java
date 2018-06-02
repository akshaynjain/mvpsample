package app.akshay.ta.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import app.akshay.ta.TApp;
import app.akshay.ta.di.ApplicationContext;
import app.akshay.ta.di.module.ApplicationModule;
import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(TApp tApp);

    @ApplicationContext
    Context context();

    Application application();
}
