// import { NativeModules } from 'react-native';

// const { RNNaverMap } = NativeModules;

// export default RNNaverMap;

import React, { Component } from "react";
import { requireNativeComponent, findNodeHandle, NativeModules, Platform, PermissionsAndroid, View } from "react-native";

const NaverMap = requireNativeComponent("NaverMap", NaverMapView);

export default class NaverMapView extends Component {
  constructor(props) {
    super(props);

    this.state = {
      permissionGranted: false
    };
  }

  async componentDidMount() {
    if (Platform.OS === "android") {
      try {
        const granted = await PermissionsAndroid.request(PermissionsAndroid.PERMISSIONS.ACCESS_FINE_LOCATION, {
          title: this.props.PermissionsAndroidTitle,
          message: this.props.PermissionsAndroidMessage
        });
        if (granted === PermissionsAndroid.RESULTS.GRANTED) {
          this.setState({ permissionGranted: true });
        } else {
          this.setState({ permissionGranted: false });
        }
      } catch (err) {
        console.warn(err);
      }
    } else {
      this.setState({ permissionGranted: true });
    }
  }

  render() {
    if (this.state.permissionGranted) {
      return (
        <NaverMap
          {...this.props}
          style={[{ width: "100%", height: "100%" }, this.props.style]}
          ref={ref => {
            this.map = ref;
          }}
        />
      );
    } else {
      return <View style={{ flex: 1 }}>{`권한 에러`}</View>;
    }
  }
}
