package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.b;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.6.0 */
public interface ih extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(jh jhVar);

    void getAppInstanceId(jh jhVar);

    void getCachedAppInstanceId(jh jhVar);

    void getConditionalUserProperties(String str, String str2, jh jhVar);

    void getCurrentScreenClass(jh jhVar);

    void getCurrentScreenName(jh jhVar);

    void getGmpAppId(jh jhVar);

    void getMaxUserProperties(String str, jh jhVar);

    void getTestFlag(jh jhVar, int i);

    void getUserProperties(String str, String str2, boolean z, jh jhVar);

    void initForTests(Map map);

    void initialize(b bVar, C1622f c1622f, long j);

    void isDataCollectionEnabled(jh jhVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, jh jhVar, long j);

    void logHealthData(int i, String str, b bVar, b bVar2, b bVar3);

    void onActivityCreated(b bVar, Bundle bundle, long j);

    void onActivityDestroyed(b bVar, long j);

    void onActivityPaused(b bVar, long j);

    void onActivityResumed(b bVar, long j);

    void onActivitySaveInstanceState(b bVar, jh jhVar, long j);

    void onActivityStarted(b bVar, long j);

    void onActivityStopped(b bVar, long j);

    void performAction(Bundle bundle, jh jhVar, long j);

    void registerOnMeasurementEventListener(c cVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(b bVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(c cVar);

    void setInstanceIdProvider(d dVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, b bVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(c cVar);
}
