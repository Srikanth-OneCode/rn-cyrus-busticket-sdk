package com.reactnativerncyrusbusticketsdk;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.cyrusbus_sdk.activities.BusDeshboardActivity;
import com.facebook.react.ReactActivity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

public class MainActivity extends ReactActivity {
  public static final String NAME = "RnCyrusBusticketSdk";

  public void invokeCyrusBus() {

    Intent intent = new Intent(MainActivity.this, BusDeshboardActivity.class);
    intent.putExtra("onepayagentid", "cybharat");
    intent.putExtra("emailid", "xyz@gmail.com");
    intent.putExtra("logoimageurl", "https://demo.erechargebyte.com/Images/Company/actual/logo.png");
    startActivity(intent);

//    if (resultCode == RESULT_OK) {
//      String m = data.getStringExtra("MESSAGE");
//      Toast.makeText(MainActivity.this, "" + m, Toast.LENGTH_LONG).show();
//    }

  }
}
