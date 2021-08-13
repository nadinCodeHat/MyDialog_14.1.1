package h;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
public interface l extends I, ReadableByteChannel {
    int a(w wVar);

    long a(G g);

    String a(Charset charset);

    void a(C2367h c2367h, long j);

    String c(long j);

    byte[] d(long j);

    void e(long j);

    m f(long j);

    C2367h getBuffer();

    C2367h l();

    String m();

    byte[] n();

    boolean o();

    long p();

    l peek();

    m q();

    long r();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    InputStream s();

    void skip(long j);
}
