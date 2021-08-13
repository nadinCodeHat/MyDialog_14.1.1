package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.references.c;
import com.facebook.l.i.e;

/* compiled from: PlatformDecoder */
public interface f {
    c<Bitmap> a(e eVar, Config config, Rect rect, int i);

    c<Bitmap> a(e eVar, Config config, Rect rect, int i, ColorSpace colorSpace);

    c<Bitmap> a(e eVar, Config config, Rect rect, ColorSpace colorSpace);
}
