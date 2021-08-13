package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.4.0 */
public interface c {
    @RecentlyNonNull
    View a(@RecentlyNonNull LayoutInflater layoutInflater, @RecentlyNonNull ViewGroup viewGroup, @RecentlyNonNull Bundle bundle);

    void a(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    void a(@RecentlyNonNull Bundle bundle);

    void b(@RecentlyNonNull Bundle bundle);

    void d();

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
