package com.google.android.gms.maps.a;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.GoogleMapOptions;

public interface c extends IInterface {
    b a(b bVar, b bVar2, Bundle bundle);

    void a(Bundle bundle);

    void a(b bVar, GoogleMapOptions googleMapOptions, Bundle bundle);

    void a(C0507u c0507u);

    void b(Bundle bundle);

    void d();

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
