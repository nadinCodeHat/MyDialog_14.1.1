package io.grpc.c.a.a;

import h.l;
import h.m;
import java.io.Closeable;
import java.util.List;

/* compiled from: FrameReader */
public interface b extends Closeable {

    /* compiled from: FrameReader */
    public interface a {
        void a(int i, a aVar);

        void a(int i, a aVar, m mVar);

        void a(boolean z, i iVar);

        void a(boolean z, boolean z2, int i, int i2, List<d> list, e eVar);

        void ackSettings();

        void data(boolean z, int i, l lVar, int i2);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<d> list);

        void windowUpdate(int i, long j);
    }

    boolean a(a aVar);
}
