package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;

/* compiled from: MemoryChunk */
public interface w {
    ByteBuffer C();

    long E();

    int a();

    int a(int i, byte[] bArr, int i2, int i3);

    void a(int i, w wVar, int i2, int i3);

    int b(int i, byte[] bArr, int i2, int i3);

    long b();

    byte c(int i);

    void close();

    boolean isClosed();
}
