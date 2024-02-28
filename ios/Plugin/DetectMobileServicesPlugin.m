#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

// Define the plugin using the CAP_PLUGIN Macro, and
// each method the plugin supports using the CAP_PLUGIN_METHOD macro.
CAP_PLUGIN(DetectMobileServicesPlugin, "DetectMobileServices",
           CAP_PLUGIN_METHOD(GetMediaService, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(HasHMS, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(HasGMS, CAPPluginReturnPromise);
)
