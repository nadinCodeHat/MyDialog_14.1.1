package com.bumptech.glide.e;

import com.bumptech.glide.e.a.l;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.GlideException;

/* compiled from: RequestListener */
public interface g<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, l<R> lVar, boolean z);

    boolean onResourceReady(R r, Object obj, l<R> lVar, a aVar, boolean z);
}
