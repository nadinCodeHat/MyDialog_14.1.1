package com.madme.mobile.sdk.fragments;

import android.os.Bundle;

public interface FullScreenFragmentListener {
    void onCloseMeRequest();

    void showFragment(String str);

    void showFragment(String str, Bundle bundle);
}
