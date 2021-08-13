package com.appsflyer.attribution;

public interface AppsFlyerRequestListener {
    void onError(int i, String str);

    void onSuccess();
}
