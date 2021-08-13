package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.a;

public interface CustomEventInterstitial extends a {
    void requestInterstitialAd(Context context, d dVar, String str, a aVar, Bundle bundle);

    void showInterstitial();
}
