package com.bridgedemo;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgedemo.HelloWorldModule;

public class HelloWorldPackage implements ReactPackage{

@Override
public List<ViewManager> createViewManagers(ReactApplicationContext ReactContext){
    return Collections.emptyList();
}

@Override 
public List <NativeModule> createNativeModules(ReactApplicationContext ReactContext){
    List<NativeModule> modules = new ArrayList<>();
    modules.add(new HelloWorldModule(ReactContext));
    return modules;  
}
}