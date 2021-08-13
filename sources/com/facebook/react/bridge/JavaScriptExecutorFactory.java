package com.facebook.react.bridge;

public interface JavaScriptExecutorFactory {
    JavaScriptExecutor create();

    void startSamplingProfiler();

    void stopSamplingProfiler(String str);
}
