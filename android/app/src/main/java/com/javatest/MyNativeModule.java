package com.javatest;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class MyNativeModule extends ReactContextBaseJavaModule {

    public MyNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void addTwoNumbers(String x, String y, Promise promise) {
        int a=Integer.parseInt(x),b=Integer.parseInt(y);
        int result = a + b;
        promise.resolve(Integer.toString(result));
    }

    @Override
    public String getName() {
        return "MyNativeModule";
    }
}
