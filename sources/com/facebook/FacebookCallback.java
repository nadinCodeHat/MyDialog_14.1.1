package com.facebook;

/* renamed from: com.facebook.q */
public interface FacebookCallback<RESULT> {
    void a(FacebookException facebookException);

    void onCancel();

    void onSuccess(RESULT result);
}
