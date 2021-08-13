package com.google.firebase.f;

import java.util.concurrent.Executor;

/* compiled from: Subscriber */
public interface d {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void a(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void b(Class<T> cls, b<? super T> bVar);
}
