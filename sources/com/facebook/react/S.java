package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

/* compiled from: ReactPackage */
public interface S {
    List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext);

    List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext);
}
