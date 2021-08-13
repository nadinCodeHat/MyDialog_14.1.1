package com.drew.imaging.tiff;

import com.drew.lang.i;
import com.drew.lang.k;
import com.drew.metadata.g;
import java.util.Set;

/* compiled from: TiffHandler */
public interface b {
    Long a(int i, int i2, long j);

    void a(int i, byte b);

    void a(int i, int i2);

    void a(int i, long j);

    void a(int i, k kVar);

    void a(int i, g gVar);

    void a(int i, short s);

    void a(int i, byte[] bArr);

    void a(int i, double[] dArr);

    void a(int i, float[] fArr);

    void a(int i, int[] iArr);

    void a(int i, long[] jArr);

    void a(int i, k[] kVarArr);

    void a(int i, short[] sArr);

    void a(String str);

    boolean a();

    boolean a(int i);

    boolean a(int i, Set<Integer> set, int i2, i iVar, int i3, int i4);

    void b();

    void b(int i);

    void b(int i, int i2);

    void b(int i, byte[] bArr);

    void b(int i, int[] iArr);

    void b(int i, short[] sArr);

    void b(String str);

    void c(int i, int i2);

    void setDouble(int i, double d);

    void setFloat(int i, float f);
}
