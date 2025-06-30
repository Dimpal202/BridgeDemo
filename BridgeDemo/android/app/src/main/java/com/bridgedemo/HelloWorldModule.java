package com.bridgedemo;

import android.widget.Toast;
import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class HelloWorldModule extends ReactContextBaseJavaModule {
private static ReactApplicationContext ReactContext;

HelloWorldModule(ReactApplicationContext context){
    super(context);
    ReactContext = context;
}
@Override
public String getName(){
    return "HelloWorldModule";
}

@ReactMethod
public void ShowMessage(String message , int duration){
    Log.d("Hello_world",message);
    Toast.makeText(getReactApplicationContext(), message, duration).show();
}
}
