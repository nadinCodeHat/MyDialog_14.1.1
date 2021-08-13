package com.facebook.e;

import java.util.concurrent.Executor;

/* compiled from: DataSource */
public interface e<T> {
    void a(h<T> hVar, Executor executor);

    boolean a();

    Throwable b();

    float c();

    boolean close();

    boolean d();

    T getResult();

    boolean isFinished();
}
