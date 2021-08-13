package h;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: h.k */
public interface BufferedSink extends G, WritableByteChannel {
    long a(I i);

    BufferedSink a(m mVar);

    BufferedSink a(String str);

    void flush();

    BufferedSink g(long j);

    C2367h getBuffer();

    BufferedSink h(long j);

    BufferedSink t();

    BufferedSink u();

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i, int i2);

    BufferedSink writeByte(int i);

    BufferedSink writeInt(int i);

    BufferedSink writeShort(int i);

    OutputStream x();
}
