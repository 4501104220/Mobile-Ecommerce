package com.dev.mobile_ecommerce.mvp;

/**
 * Created by day on 11/8/17.
 */

public interface MainView<T> {

    void showError(String response);

    /**
     * Shows loading layout on the view.
     */
    void showLoadingLayout();

    /**
     * Hides loading layout.
     */
    void hideLoadingLayout();
}
