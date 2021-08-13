package com.facebook.react.fabric;

import com.facebook.o.a.a;

@a
public interface ReactNativeConfig {
    @a
    boolean getBool(String str);

    @a
    double getDouble(String str);

    @a
    int getInt64(String str);

    @a
    String getString(String str);
}
