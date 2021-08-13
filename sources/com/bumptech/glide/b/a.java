package com.bumptech.glide.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder */
public interface a {

    /* compiled from: GifDecoder */
    public interface a {
        Bitmap a(int i, int i2, Config config);

        void a(Bitmap bitmap);

        void a(byte[] bArr);

        void a(int[] iArr);

        byte[] a(int i);

        int[] b(int i);
    }

    int a();

    void a(Config config);

    void advance();

    int b();

    Bitmap c();

    void clear();

    int d();

    void e();

    int f();

    ByteBuffer getData();
}
