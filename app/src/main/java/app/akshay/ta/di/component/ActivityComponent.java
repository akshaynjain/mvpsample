package app.akshay.ta.di.component;

import app.akshay.ta.di.PerActivity;
import app.akshay.ta.di.module.ActivityModule;
import app.akshay.ta.ui.base.login.LoginActivity;
import app.akshay.ta.ui.base.splash.SplashActivity;
import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);

    void inject(LoginActivity activity);
}
