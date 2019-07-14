package com.reactlibrary;

import android.view.View;
import android.util.Log;
import android.graphics.Color;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;

public class RNNaverMapManager extends SimpleViewManager<RNMapView> {
    public static final String REACT_CLASS = "NaverMapModule";
    public static final String TAG = "NaverMapModule";
    // private RNMapView rnMapView;
    // private final ReactApplicationContext appContext;
    private MapView mapView;

    // public RNNaverMapManager (ReactApplicationContext context) {
    //     super();
    //     this.appContext = context;
    // }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNMapView createViewInstance(ThemedReactContext context) {
        return new RNMapView(context); //If your customview has more constructor parameters pass it from here.
    }

    // @Override
	// public MapView createViewInstance(ThemedReactContext context) {
    //     return mapView;
	// }


}