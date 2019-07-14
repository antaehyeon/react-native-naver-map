// RNNaverMap.m
#import <React/RCTLog.h>
#import <MapKit/MapKit.h>
#import <React/RCTViewManager.h>
@import NMapsMap;

@interface RNNaverMap : RCTViewManager
@end

@implementation RNNaverMap

// To export a module named RNNaverMap
RCT_EXPORT_MODULE(RNNaver);

- (UIView *)view
{
//   return [[MKMapView alloc] init];
    // NMFMapView *mapView = [[NMFMapView alloc] initWithFrame:self.view.frame];
    // [self.view addSubview:mapView];
    // return mapView;

    return [[NMFMapView alloc] init];
}

RCT_EXPORT_METHOD(addEvent:(NSString *)name location:(NSString *)location)
{
  RCTLogInfo(@"Pretending to create an event %@ at %@", name, location);
}

// This would name the module AwesomeCalendarManager instead
// RCT_EXPORT_MODULE(AwesomeCalendarManager);

@end