package app.akshay.ta.ui.base.splash;

import javax.inject.Inject;

import app.akshay.ta.ui.base.base.BasePresenter;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    @Inject
    public SplashPresenter(){
        super();
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
        getMvpView().showLoading();
        decideNextActivity();
    }

    private void decideNextActivity() {
            getMvpView().openLoginActivity();
    }

}
