package com.facebook.j.a.b;

import android.graphics.Bitmap;
import com.facebook.common.references.c;

/* compiled from: BitmapFrameCache */
public interface b {

    /* compiled from: BitmapFrameCache */
    public interface a {
        void a(b bVar, int i);

        void b(b bVar, int i);
    }

    c<Bitmap> a(int i);

    c<Bitmap> a(int i, int i2, int i3);

    void a(int i, c<Bitmap> cVar, int i2);

    void b(int i, c<Bitmap> cVar, int i2);

    boolean b(int i);

    c<Bitmap> c(int i);

    void clear();
}
