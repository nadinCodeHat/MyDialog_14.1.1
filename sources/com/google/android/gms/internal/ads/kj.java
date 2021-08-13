package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import java.util.List;
import java.util.Map;

public interface kj extends IInterface {
    long Fb();

    String Jb();

    String Ob();

    String Ra();

    String Va();

    Map a(String str, String str2, boolean z);

    void a(String str, String str2, Bundle bundle);

    void a(String str, String str2, b bVar);

    List b(String str, String str2);

    void b(b bVar, String str, String str2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    String db();

    int g(String str);

    void m(Bundle bundle);

    void o(Bundle bundle);

    Bundle p(Bundle bundle);

    void q(String str);

    void t(String str);
}
