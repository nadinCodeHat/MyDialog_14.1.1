package com.google.android.gms.internal.gtm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.gtm.wa */
public interface C0414wa {
    ExecutorService a(int i);

    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);

    ScheduledExecutorService b(int i, int i2);
}
