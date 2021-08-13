package com.google.android.gms.internal.ads;

import android.os.IInterface;
import com.google.android.gms.dynamic.b;

/* renamed from: com.google.android.gms.internal.ads.bv */
public interface C0121bv extends IInterface {
    Lu createAdLoaderBuilder(b bVar, String str, C0310xB c0310xB, int i);

    W createAdOverlay(b bVar);

    Qu createBannerAdManager(b bVar, C1458nu c1458nu, String str, C0310xB c0310xB, int i);

    C0150ga createInAppPurchaseManager(b bVar);

    Qu createInterstitialAdManager(b bVar, C1458nu c1458nu, String str, C0310xB c0310xB, int i);

    Bx createNativeAdViewDelegate(b bVar, b bVar2);

    Fx createNativeAdViewHolderDelegate(b bVar, b bVar2, b bVar3);

    C0115bd createRewardedVideoAd(b bVar, C0310xB c0310xB, int i);

    C0115bd createRewardedVideoAdSku(b bVar, int i);

    Qu createSearchAdManager(b bVar, C1458nu c1458nu, String str, int i);

    hv getMobileAdsSettingsManager(b bVar);

    hv getMobileAdsSettingsManagerWithClientJarVersion(b bVar, int i);
}
