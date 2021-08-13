package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;
import java.util.Map;

public interface _w {
    void Dc();

    void Ec();

    void Fc();

    View Gc();

    boolean Hc();

    void Ic();

    boolean Jc();

    boolean Kc();

    void Lc();

    void Q();

    void X();

    void Z();

    View a(OnClickListener onClickListener, boolean z);

    void a(MotionEvent motionEvent);

    void a(View view);

    void a(View view, Yw yw);

    void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2, boolean z);

    void a(View view, Map<String, WeakReference<View>> map);

    void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2);

    void a(C0238oy c0238oy);

    void b(View view);

    void b(View view, Map<String, WeakReference<View>> map);

    void c(View view);

    void c(View view, Map<String, WeakReference<View>> map);

    boolean d(Bundle bundle);

    void e(Bundle bundle);

    void f(Bundle bundle);

    Context getContext();
}
