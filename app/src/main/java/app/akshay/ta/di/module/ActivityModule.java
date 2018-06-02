package app.akshay.ta.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import app.akshay.ta.di.ActivityContext;
import app.akshay.ta.di.ApplicationContext;
import app.akshay.ta.di.PerActivity;
import app.akshay.ta.ui.base.login.LoginMvpPresenter;
import app.akshay.ta.ui.base.login.LoginMvpView;
import app.akshay.ta.ui.base.login.LoginPresenter;
import app.akshay.ta.ui.base.splash.SplashMvpPresenter;
import app.akshay.ta.ui.base.splash.SplashMvpView;
import app.akshay.ta.ui.base.splash.SplashPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){return  mActivity;}

    @Provides
    AppCompatActivity provideActivity(){return mActivity;}

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter){
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(LoginPresenter<LoginMvpView> presenter){
        return presenter;
    }

}
