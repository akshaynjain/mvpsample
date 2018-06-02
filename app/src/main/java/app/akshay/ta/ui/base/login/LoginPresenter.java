package app.akshay.ta.ui.base.login;

import javax.inject.Inject;

import app.akshay.ta.R;
import app.akshay.ta.ui.base.base.BasePresenter;
import app.akshay.ta.util.CommonUtils;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    @Inject
    public LoginPresenter(){
        super();
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
    }

    @Override
    public void onServerLoginClick(String mobile, String password) {
        //validate email and password
        if (mobile == null || mobile.isEmpty()) {
            getMvpView().onError(R.string.empty_email);
            return;
        }
        if (!CommonUtils.isMobileValid(mobile)) {
            getMvpView().onError(R.string.invalid_email);
            return;
        }
        if (password == null || password.isEmpty()) {
            getMvpView().onError(R.string.empty_password);
            return;
        }
    }
}
