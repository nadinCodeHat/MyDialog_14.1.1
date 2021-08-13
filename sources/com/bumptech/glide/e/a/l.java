package com.bumptech.glide.e.a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.e.b.b;
import com.bumptech.glide.e.d;
import com.bumptech.glide.manager.j;

/* compiled from: Target */
public interface l<R> extends j {
    d getRequest();

    void getSize(k kVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, b<? super R> bVar);

    void removeCallback(k kVar);

    void setRequest(d dVar);
}
