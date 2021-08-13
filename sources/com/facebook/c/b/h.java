package com.facebook.c.b;

import com.facebook.c.a.j;
import java.util.Collection;

/* compiled from: DiskStorage */
public interface h {

    /* compiled from: DiskStorage */
    public interface a {
        long a();

        String getId();

        long getTimestamp();
    }

    /* compiled from: DiskStorage */
    public interface b {
        boolean B();

        com.facebook.b.a a(Object obj);

        void a(j jVar, Object obj);
    }

    long a(a aVar);

    b a(String str, Object obj);

    void a();

    void b();

    boolean b(String str, Object obj);

    com.facebook.b.a c(String str, Object obj);

    boolean c();

    Collection<a> d();

    long remove(String str);
}
