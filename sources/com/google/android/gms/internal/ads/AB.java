package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import java.util.List;

public interface AB extends IInterface {
    void D(b bVar);

    NB Pb();

    JB Wb();

    b Zb();

    void a(b bVar, Dd dd, List<String> list);

    void a(b bVar, C1447ju c1447ju, String str, DB db);

    void a(b bVar, C1447ju c1447ju, String str, Dd dd, String str2);

    void a(b bVar, C1447ju c1447ju, String str, String str2, DB db);

    void a(b bVar, C1447ju c1447ju, String str, String str2, DB db, C1452lx c1452lx, List<String> list);

    void a(b bVar, C1458nu c1458nu, C1447ju c1447ju, String str, DB db);

    void a(b bVar, C1458nu c1458nu, C1447ju c1447ju, String str, String str2, DB db);

    void a(C1447ju c1447ju, String str);

    void a(C1447ju c1447ju, String str, String str2);

    void b(boolean z);

    QB cb();

    void destroy();

    Bundle getInterstitialAdapterInfo();

    sv getVideoController();

    void ia();

    boolean isInitialized();

    Sx jb();

    void pause();

    boolean pb();

    Bundle rb();

    void showInterstitial();

    void showVideo();

    Bundle zzoa();
}
