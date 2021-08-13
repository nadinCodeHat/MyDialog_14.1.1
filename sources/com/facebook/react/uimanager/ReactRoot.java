package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: com.facebook.react.uimanager.x */
public interface ReactRoot {
    void a();

    void a(int i);

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getInitialUITemplate();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i);

    void setShouldLogContentAppeared(boolean z);
}
