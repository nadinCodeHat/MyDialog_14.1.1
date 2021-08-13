package io.grpc.b;

import io.grpc.Compressor;
import java.io.InputStream;

/* compiled from: Stream */
public interface fd {
    void a(int i);

    void a(Compressor compressor);

    void a(InputStream inputStream);

    void flush();
}
