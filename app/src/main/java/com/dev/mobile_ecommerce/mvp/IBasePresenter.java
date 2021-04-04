package com.dev.mobile_ecommerce.mvp;

/**
 * Created by day on 14/8/17.
 */

public interface IBasePresenter<ViewT> {

    void onViewActive(ViewT view);

    void onViewInactive();
}
