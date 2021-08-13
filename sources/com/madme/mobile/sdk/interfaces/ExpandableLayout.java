package com.madme.mobile.sdk.interfaces;

import android.animation.TimeInterpolator;
import com.madme.mobile.sdk.listener.ExpandableLayoutListener;

public interface ExpandableLayout {
    public static final int DEFAULT_DURATION = 300;
    public static final boolean DEFAULT_EXPANDED = false;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    void collapse();

    void collapse(long j, TimeInterpolator timeInterpolator);

    void expand();

    void expand(long j, TimeInterpolator timeInterpolator);

    @Deprecated
    void initLayout(boolean z);

    boolean isExpanded();

    void setDuration(int i);

    void setExpanded(boolean z);

    void setInterpolator(TimeInterpolator timeInterpolator);

    void setListener(ExpandableLayoutListener expandableLayoutListener);

    void toggle();

    void toggle(long j, TimeInterpolator timeInterpolator);
}
