package com.google.firebase.components;

import com.google.firebase.h.b;
import java.util.Set;

/* compiled from: ComponentContainer */
public interface f {
    <T> T a(Class<T> cls);

    <T> b<Set<T>> b(Class<T> cls);

    <T> Set<T> c(Class<T> cls);

    <T> b<T> d(Class<T> cls);
}
