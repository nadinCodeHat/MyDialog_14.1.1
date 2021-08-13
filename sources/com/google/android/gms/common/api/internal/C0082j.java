package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.4.0 */
/* renamed from: com.google.android.gms.common.api.internal.j */
public interface C0082j {
    @RecentlyNullable
    <T extends LifecycleCallback> T a(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    void a(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNonNull
    Activity m();

    void startActivityForResult(@RecentlyNonNull Intent intent, @RecentlyNonNull int i);
}
