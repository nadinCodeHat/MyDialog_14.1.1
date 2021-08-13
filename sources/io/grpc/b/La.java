package io.grpc.b;

import io.grpc.Compressor;
import java.io.InputStream;

/* compiled from: Framer */
public interface La {
    La a(Compressor compressor);

    void a(InputStream inputStream);

    void close();

    void e(int i);

    void flush();

    boolean isClosed();
}
