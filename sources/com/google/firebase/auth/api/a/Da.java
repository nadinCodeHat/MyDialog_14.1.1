package com.google.firebase.auth.api.a;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth.C1513Qa;
import com.google.android.gms.internal.firebase_auth.C1515Sa;
import com.google.android.gms.internal.firebase_auth.C1516Ua;
import com.google.android.gms.internal.firebase_auth.C1519Ya;
import com.google.android.gms.internal.firebase_auth.Xa;
import com.google.android.gms.internal.firebase_auth.fb;
import com.google.firebase.auth.C2390C;

/* compiled from: com.google.firebase:firebase-auth@@19.4.0 */
public interface Da extends IInterface {
    void Da();

    void a(Status status);

    void a(Status status, C2390C c2390c);

    void a(C1513Qa c1513Qa);

    void a(C1515Sa c1515Sa);

    void a(C1516Ua c1516Ua);

    void a(C1519Ya c1519Ya);

    void a(C1519Ya c1519Ya, Xa xa);

    void a(fb fbVar);

    void a(C2390C c2390c);

    void c(String str);

    void e(String str);

    void f(String str);

    void v();

    void x();
}
