package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.d;
import java.util.Collection;

/* compiled from: DateSelector */
public interface e<S> extends Parcelable {
    int a(Context context);

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C1881b c1881b, F<S> f);

    String b(Context context);

    void b(long j);

    Collection<d<Long, Long>> f();

    boolean g();

    Collection<Long> h();

    S i();
}
