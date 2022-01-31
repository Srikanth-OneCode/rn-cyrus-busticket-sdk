package com.reactnativerncyrusbusticketsdk;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = RnCyrusBusticketSdkModule.NAME)
public class RnCyrusBusticketSdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RnCyrusBusticketSdk";

    public RnCyrusBusticketSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @ReactMethod
    public void callCyrusBus(int a, int b, Promise promise) {
        MainActivity mainActivity = new MainActivity();
        mainActivity.invokeCyrusBus();
    }

    public static native int nativeMultiply(int a, int b);
}
