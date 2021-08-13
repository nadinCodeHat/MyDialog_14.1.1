package com.madme.mobile.sdk.listener;

public interface ExpandableLayoutListener {
    void onAnimationEnd();

    void onAnimationStart();

    void onClosed();

    void onOpened();

    void onPreClose();

    void onPreOpen();
}
