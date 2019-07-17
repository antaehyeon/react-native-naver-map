package com.reactlibrary;

import android.view.View;
import android.util.Log;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import com.naver.maps.map.MapView;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMapSdk;

//import com.reactlibrary.R;

public class RNMapView extends MapView  {
    private ThemedReactContext mContext;
    private MapView mMapView;
    private NaverMapSdk naverMapSdk;
    private static final String LOG_TAG = "NaverMap";

    public RNMapView(ThemedReactContext themedReactContext) {
        super(themedReactContext.getCurrentActivity());
        mContext = themedReactContext;
        mMapView = this;
        
        // NaverMapSdk.getInstance(this).setClient(new NaverMapSdk.NaverCloudPlatformClient("rrpzhwdlo5"));
        
        // this.setOnAuthFailedListener(new OnAuthFailedListener() {
        //     public void onAuthFailed(new ) {
                
        //     }
        // })

    }
}