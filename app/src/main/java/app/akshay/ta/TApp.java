package app.akshay.ta;

import android.app.Application;

import app.akshay.ta.di.component.ApplicationComponent;
import app.akshay.ta.di.component.DaggerApplicationComponent;
import app.akshay.ta.di.module.ApplicationModule;

public class TApp extends Application{

    public ApplicationComponent getmApplicationComponent() {
        return mApplicationComponent;
    }

    public void setmApplicationComponent(ApplicationComponent mApplicationComponent) {
        this.mApplicationComponent = mApplicationComponent;
    }

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);
    }
}
