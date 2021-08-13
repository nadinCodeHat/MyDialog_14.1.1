package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;

public interface W extends IInterface {
    void a(Bundle bundle);

    void b(Bundle bundle);

    boolean ib();

    void k(b bVar);

    void lb();

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void qb();

    void z();
}
