package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.Q;
import com.google.android.gms.ads.internal.gmsg.C;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.ua;
import com.google.android.gms.common.util.o;
import com.google.android.gms.dynamic.b;

@C0219nb
public interface gi extends Q, C0689Gh, Ci, Di, Hi, Ki, Li, Mi, C0129cs, Nz, C0198lA {
    void A(String str);

    void Ac();

    boolean Bc();

    void Cc();

    void E(b bVar);

    void E(boolean z);

    void F(boolean z);

    void G(boolean z);

    void H(boolean z);

    void I(boolean z);

    void a(Context context);

    void a(d dVar);

    void a(Ti ti);

    void a(Yw yw);

    void a(C1475vi c1475vi);

    void a(String str, C<? super gi> c);

    void a(String str, o<C<? super gi>> oVar);

    void a(String str, String str2, String str3);

    void b(d dVar);

    void b(String str, C<? super gi> c);

    Yw cc();

    Ni dc();

    void destroy();

    C0298vw ec();

    void fc();

    String gc();

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    void hc();

    Ti ic();

    boolean isDestroyed();

    Activity jc();

    boolean kc();

    d lc();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    b mc();

    void measure(int i, int i2);

    boolean nc();

    C0269sq oc();

    void onPause();

    void onResume();

    void pc();

    WebViewClient qc();

    void r(int i);

    C1457ng rc();

    void sc();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    void tc();

    boolean uc();

    d vc();

    C1475vi wc();

    boolean xc();

    ua y();

    Context yc();

    void zc();
}
