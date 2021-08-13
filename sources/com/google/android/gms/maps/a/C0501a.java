package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.a.a */
public interface C0501a extends IInterface {
    b a(CameraPosition cameraPosition);

    b a(LatLng latLng, float f);

    b a(LatLngBounds latLngBounds, int i);

    b a(LatLngBounds latLngBounds, int i, int i2, int i3);

    b e(LatLng latLng);
}
