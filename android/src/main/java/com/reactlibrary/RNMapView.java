package com.reactlibrary;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.content.Context;
import android.widget.LinearLayout;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.bridge.ReactApplicationContext;

import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;

import com.reactlibrary.R;

public class RNMapView extends MapView {
	// private ThemedReactContext mContext;
	// private MapView mMapView;
	// private static final String TAG = "NaverMapModule";
    private Context context;

    public RNMapView(ThemedReactContext context) {
        super(context);
        this.context = context;
        init();
    }

    // public RNMapView()

    public void init() {
       inflate(this.context, R.layout.activity_map_view, this);
    }

}