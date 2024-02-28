import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(DetectMobileServicesPlugin)
public class DetectMobileServicesPlugin: CAPPlugin {
    
    @objc func GetMediaService(_ call: CAPPluginCall) {
        call.resolve([
            "value": "ios"
        ])
    }
    @objc func HasHMS(_ call: CAPPluginCall) {
        call.resolve([
            "value": false
        ])
    }
    @objc func HasGMS(_ call: CAPPluginCall) {
        call.resolve([
            "value": false
        ])
    }
}
