package com.facebook.react.bridge;

import com.facebook.o.a.a;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.turbomodule.core.interfaces.JSCallInvokerHolder;
import java.util.Collection;
import java.util.List;

@a
public interface CatalystInstance extends MemoryPressureListener, JSInstance, JSBundleLoaderDelegate {
    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void addJSIModules(List<JSIModuleSpec> list);

    @a
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    void extendNativeModules(NativeModuleRegistry nativeModuleRegistry);

    JSCallInvokerHolder getJSCallInvokerHolder();

    JSIModule getJSIModule(JSIModuleType jSIModuleType);

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    JavaScriptContextHolder getJavaScriptContextHolder();

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    NativeModule getNativeModule(String str);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    String getSourceURL();

    <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    boolean hasRunJSBundle();

    void initialize();

    @a
    void invokeCallback(int i, NativeArrayInterface nativeArrayInterface);

    boolean isDestroyed();

    void registerSegment(int i, String str);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle();

    void setGlobalVariable(String str, String str2);

    void setTurboModuleManager(JSIModule jSIModule);
}
