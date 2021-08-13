package com.bumptech.glide.load.a;

import com.bumptech.glide.i;

/* compiled from: DataFetcher */
public interface d<T> {

    /* compiled from: DataFetcher */
    public interface a<T> {
        void a(Exception exception);

        void a(T t);
    }

    Class<T> a();

    void a(i iVar, a<? super T> aVar);

    void b();

    com.bumptech.glide.load.a c();

    void cancel();
}
