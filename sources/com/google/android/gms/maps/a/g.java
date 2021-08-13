package com.google.android.gms.maps.a;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface g extends IInterface {
    b a(b bVar, b bVar2, Bundle bundle);

    void a(Bundle bundle);

    void a(b bVar, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    void a(J j);

    void b(Bundle bundle);

    void d();

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
