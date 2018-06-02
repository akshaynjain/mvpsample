package app.akshay.ta.ui.base.splash;

import android.content.Intent;
import android.os.Bundle;
import javax.inject.Inject;
import app.akshay.ta.R;
import app.akshay.ta.ui.base.base.BaseActivity;
import app.akshay.ta.ui.base.login.LoginActivity;
import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashMvpView{

    @Inject
    SplashMvpPresenter<SplashMvpView> mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mvpPresenter.onAttach(SplashActivity.this);
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void hideKeyboard() {
        super.hideKeyboard();
    }

    @Override
    protected void setUp() {

    }
}
