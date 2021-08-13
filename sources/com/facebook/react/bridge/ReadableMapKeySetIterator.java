package com.facebook.react.bridge;

import com.facebook.o.a.a;

@a
public interface ReadableMapKeySetIterator {
    boolean hasNextKey();

    String nextKey();
}
