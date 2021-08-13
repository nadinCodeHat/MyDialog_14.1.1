package com.facebook.react.uimanager;

import android.graphics.Rect;

/* renamed from: com.facebook.react.uimanager.s */
public interface ReactClippingViewGroup {
    void getClippingRect(Rect rect);

    boolean getRemoveClippedSubviews();

    void updateClippingRect();
}
