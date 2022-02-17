package com.reactnativerncyrusbusticketsdk;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.cyrusbus_sdk.activities.BusDeshboardActivity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = RnCyrusBusticketSdkModule.NAME)
public class RnCyrusBusticketSdkModule extends ReactContextBaseJavaModule {
  public static final String NAME = "RnCyrusBusticketSdk";

  ReactApplicationContext context = getReactApplicationContext();
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
  public void openCyrusBus() {
    Intent intent = new Intent(context, BusDeshboardActivity.class);
    intent.putExtra("onepayagentid", "cybharat");
    intent.putExtra("emailid", "xyz@gmail.com");
    intent.putExtra("logoimageurl", "https://demo.erechargebyte.com/Images/Company/actual/logo.png");
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }

  public static native int nativeMultiply(int a, int b);
}
