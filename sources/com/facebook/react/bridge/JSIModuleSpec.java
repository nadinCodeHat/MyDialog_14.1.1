package com.facebook.react.bridge;

public interface JSIModuleSpec<T extends JSIModule> {
    JSIModuleProvider<T> getJSIModuleProvider();

    JSIModuleType getJSIModuleType();
}
