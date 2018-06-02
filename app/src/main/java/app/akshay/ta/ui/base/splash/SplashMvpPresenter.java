package app.akshay.ta.ui.base.splash;

import app.akshay.ta.di.PerActivity;
import app.akshay.ta.ui.base.base.MvpPresenter;

@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
}
