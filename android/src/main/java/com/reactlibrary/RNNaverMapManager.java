package com.reactlibrary;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import android.util.Log;

import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.OnMapReadyCallback;

public class RNNaverMapManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "NaverMap";
    public static final String TAG = "NaverMap";

    @Override
	public String getName() {
		// Tell React the name of the module
		// https://facebook.github.io/react-native/docs/native-components-android.html#1-create-the-viewmanager-subclass
		return REACT_CLASS;
	}

	@Override
	public RNMapView createViewInstance(ThemedReactContext context) {
		return new RNMapView(context);
	}


}