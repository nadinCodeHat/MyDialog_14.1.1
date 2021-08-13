package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.mediation.a;

@Deprecated
public interface CustomEventInterstitial extends a {
    void requestInterstitialAd(c cVar, Activity activity, String str, String str2, a aVar, Object obj);

    void showInterstitial();
}
