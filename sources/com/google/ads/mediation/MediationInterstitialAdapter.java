package com.google.ads.mediation;

import android.app.Activity;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends e, SERVER_PARAMETERS extends MediationServerParameters> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(d dVar, Activity activity, SERVER_PARAMETERS server_parameters, a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
