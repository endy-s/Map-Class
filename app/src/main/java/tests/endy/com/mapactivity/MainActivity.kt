package tests.endy.com.mapactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    // -- Map --

    // 1. API Key
        // 1.1. Create an Map API key at https://developers.google.com/maps/documentation/android/signup
        // 1.2. Create and add it to the google_maps_api.xml at values folder
        // 1.3. Add to the Manifest the map key info using the meta-data tag

    // 2. UI
        // 2.1. Add Gradle dependencies
            // compile 'com.google.android.gms:play-services-maps:15.0.1'
            // compile 'com.google.android.gms:play-services-location:15.0.1'
        // 2.2. Add the MapView to your layout

    // 3. Logic
        // 3.1. Create GoogleMap global variable

    var map: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
    }

}
