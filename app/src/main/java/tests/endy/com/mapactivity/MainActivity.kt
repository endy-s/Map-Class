package tests.endy.com.mapactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(), OnMapReadyCallback {

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
        // 3.2. Initialize MapView at onCreate method
        // 3.3. Add OnMapReadyCallback interface at Activity and create onMapReady method
        // 3.4. Update global GoogleMap variable with the received at onMapReady
        // 3.5. Add lifecycle methods

    // 4. Move Map
        // 4.1. Get the coordinates for your city, in my case Florianópolis (or a location you like)
        // 4.2. Set the Map's Zoom Preference
        // 4.3. Move Map's camera

    // -- Extras --

    // 5. Markers
        // 5.1. Add Marker at Florianópolis position (or a location you like)

    var map: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        map = googleMap

        val florianopolis = LatLng(-27.5969, -48.5495)
        map?.setMinZoomPreference(12f)
        map?.moveCamera(CameraUpdateFactory.newLatLng(florianopolis))

        val markerOptions = MarkerOptions()
        markerOptions.position(florianopolis)
        map?.addMarker(markerOptions)
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

}
