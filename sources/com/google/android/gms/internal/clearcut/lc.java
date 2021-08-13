package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import d.e.b.e.c.d;
import d.e.b.e.c.f;

public interface lc extends IInterface {
    void a(Status status);

    void a(Status status, long j);

    void a(Status status, d dVar);

    void a(Status status, f[] fVarArr);

    void a(DataHolder dataHolder);

    void b(Status status, long j);

    void b(Status status, d dVar);

    void c(Status status);

    void d(Status status);
}
