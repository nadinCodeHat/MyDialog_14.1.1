package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t.a;
import c.g.h.G;

/* compiled from: DecorToolbar */
public interface L {
    G a(int i, long j);

    void a(int i);

    void a(Drawable drawable);

    void a(Menu menu, a aVar);

    void a(View view);

    void a(a aVar, k.a aVar2);

    void a(C0003ba c0003ba);

    void a(boolean z);

    boolean a();

    void b(int i);

    void b(Drawable drawable);

    void b(boolean z);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    void e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    int getVisibility();

    Menu h();

    int i();

    ViewGroup j();

    void k();

    void l();

    View m();

    int n();

    void o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
