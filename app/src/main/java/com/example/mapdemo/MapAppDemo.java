package com.example.mapdemo;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

public class MapAppDemo extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
        SDKInitializer.setCoordType(CoordType.BD09LL); //坐标类型
    }


}
