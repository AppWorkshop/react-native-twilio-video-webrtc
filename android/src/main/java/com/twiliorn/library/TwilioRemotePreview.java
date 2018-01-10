/**
 * Component for Twilio Video participant views.
 *
 * Authors:
 *   Jonathan Chang <slycoder@gmail.com>
 */

package com.twiliorn.library;

import android.content.Context;
import android.util.Log;

import com.facebook.react.uimanager.ThemedReactContext;

import org.webrtc.RendererCommon;

public class TwilioRemotePreview extends RNVideoViewGroup {

    private static final String TAG = "TwilioRemotePreview";

    private static TwilioRemotePreview instance;

    public static TwilioRemotePreview getInstance(ThemedReactContext context) {
        Log.d(TAG, "getInstance");

        if(instance == null) {
            instance = new TwilioRemotePreview(context);
        }

        return instance;
    }

    public TwilioRemotePreview(Context context) {
        super(context);
        CustomTwilioVideoView.registerPrimaryVideoView(this.getSurfaceViewRenderer());
    }
}
