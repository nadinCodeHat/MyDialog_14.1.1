package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
public interface t extends IInterface {
    void a(GoogleSignInAccount googleSignInAccount, Status status);

    void e(Status status);

    void f(Status status);
}
