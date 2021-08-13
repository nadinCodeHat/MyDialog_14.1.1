package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface Lg extends ExecutorService {
    Hg<?> a(Runnable runnable);

    <T> Hg<T> a(Callable<T> callable);
}
