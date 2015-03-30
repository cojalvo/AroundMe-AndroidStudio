package com.aroundme;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;

import com.appspot.enhanced_cable_88320.aroundmeapi.Aroundmeapi;

/**
 * The Main Activity.
 * 
 * This activity starts up the RegisterActivity immediately, which communicates
 * with your App Engine backend using Cloud Endpoints. It also receives push
 * notifications from backend via Google Cloud Messaging (GCM).
 * 
 * Check out RegisterActivity.java for more details.
 */
public class MainActivity extends Activity {

	/**
	 * Substitute you own sender ID here. This is the project number you got
	 * from the API Console, as described in "Getting Started."
	 */
	String SENDER_ID = "1047488186224";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		EndpointApiCreator.initialize(null);
        try {
            Aroundmeapi api = EndpointApiCreator.getApi(Aroundmeapi.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
