package com.romano.antonio;

import android.util.Log;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class _Lll  extends CordovaPlugin{

    public _Lll(){
    }

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }


    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("noAction")) {
            Log.d("LogTest", "logging testing");
            try{
                JSONObject r = new JSONObject();
                r.put("result(from jar) ", "risultato (from jar)!!!");
                callbackContext.success(r);
            }catch(Exception e){
                callbackContext.error("Errore try-catch from jar");
                return false;
            }
        }
        else {
            callbackContext.error("Errore if-else from jar");
            return false;
        }
        return true;
    }
}