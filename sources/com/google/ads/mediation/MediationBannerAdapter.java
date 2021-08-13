package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import d.e.a.c;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends e, SERVER_PARAMETERS extends MediationServerParameters> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(c cVar, Activity activity, SERVER_PARAMETERS server_parameters, c cVar2, a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
