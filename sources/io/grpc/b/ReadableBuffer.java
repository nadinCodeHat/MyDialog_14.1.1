package io.grpc.b;

import java.io.Closeable;

/* renamed from: io.grpc.b.sc */
public interface ReadableBuffer extends Closeable {
    void a(byte[] bArr, int i, int i2);

    ReadableBuffer b(int i);

    void close();

    int readUnsignedByte();

    int z();
}
