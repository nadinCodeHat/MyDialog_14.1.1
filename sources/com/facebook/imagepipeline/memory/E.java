package com.facebook.imagepipeline.memory;

/* compiled from: PoolBackend */
interface E<T> {
    int a(T t);

    T get(int i);

    T pop();

    void put(T t);
}
