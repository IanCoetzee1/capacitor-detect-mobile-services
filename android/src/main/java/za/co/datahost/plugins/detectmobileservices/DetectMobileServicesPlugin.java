package za.co.datahost.plugins.detectmobileservices;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.api.HuaweiApiAvailability;
import android.content.Context;
@CapacitorPlugin(name = "DetectMobileServices")
public class DetectMobileServicesPlugin extends Plugin {

    @PluginMethod
    public void GetMediaService(PluginCall call) {
        JSObject ret = new JSObject();
        Context context = getContext();
        String mobileService = checkGMS(context) ? "GMS" : (checkHMS(context) ? "HMS" : "unknown");
        ret.put("value", mobileService);
        call.resolve(ret);
    }

    @PluginMethod
    public void HasHMS(PluginCall call) {
        Context context = getContext();
        JSObject ret = new JSObject();
        ret.put("value", checkHMS(context));
        call.resolve(ret);
    }

    @PluginMethod
    public void HasGMS(PluginCall call) {
        Context context = getContext();
        JSObject ret = new JSObject();
        ret.put("value", checkGMS(context));
        call.resolve(ret);
    }

    public static boolean checkGMS(Context context) {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(context);
        return resultCode == com.google.android.gms.common.ConnectionResult.SUCCESS;
    }

    public static boolean checkHMS(Context context) {
        HuaweiApiAvailability apiAvailability = HuaweiApiAvailability.getInstance();
        int resultCode = apiAvailability.isHuaweiMobileServicesAvailable(context);
        return resultCode == com.huawei.hms.api.ConnectionResult.SUCCESS;
    }
}
