/**
 * Component for Twilio Video local views.
 *
 * Authors:
 *   Jonathan Chang <slycoder@gmail.com>
 */

package com.twiliorn.library;

import android.content.Context;
import android.util.Log;

import com.facebook.react.uimanager.ThemedReactContext;

import org.webrtc.RendererCommon;


public class TwilioVideoPreview extends RNVideoViewGroup {

    private static final String TAG = "TwilioVideoPreview";

    private static TwilioVideoPreview instance;

    public static TwilioVideoPreview getInstance(ThemedReactContext context) {
        Log.d(TAG, "getInstance");

        if(instance == null) {
            instance = new TwilioVideoPreview(context);
        }

        return instance;
    }

    public TwilioVideoPreview(Context context) {
        super(context);
        CustomTwilioVideoView.registerThumbnailVideoView(this.getSurfaceViewRenderer());
        this.getSurfaceViewRenderer().setMirror(false);
        this.getSurfaceViewRenderer().applyZOrder(true);
    }
}
