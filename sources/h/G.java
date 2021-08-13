package h;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: Sink.kt */
public interface G extends Closeable, Flushable {
    void close();

    void flush();

    K timeout();

    void write(C2367h c2367h, long j);
}
