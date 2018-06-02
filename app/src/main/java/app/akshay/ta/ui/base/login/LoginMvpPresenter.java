package app.akshay.ta.ui.base.login;

import app.akshay.ta.di.PerActivity;
import app.akshay.ta.ui.base.base.MvpPresenter;

@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void onServerLoginClick(String email, String password);

}
