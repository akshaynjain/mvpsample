package app.akshay.ta.ui.base.base;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private static final String TAG = "BasePresenter";
//    private final CompositeDisposable mCompositeDisposable;
//
    private V mMvpView;
//
//    public BasePresenter(CompositeDisposable mCompositeDisposable) {
//        this.mCompositeDisposable = mCompositeDisposable;
//    }

    public BasePresenter() {

    }


    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
//        mCompositeDisposable.dispose();
        mMvpView = null;
    }

//    public CompositeDisposable getCompositeDisposable() {
//        return mCompositeDisposable;
//    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.onAttach(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
