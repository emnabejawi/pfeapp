package com.example.smartinventor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tomtom.sdk.map.display.MapOptions;
import com.tomtom.sdk.map.display.ui.MapFragment;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_map);
        MapOptions mapOptions = new MapOptions("Ic8Ezz0I4gf4GuGTYe4tOajGzd4OXHbt");
        MapFragment mapFragment = MapFragment.Companion.newInstance(mapOptions);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.map_container, mapFragment)
                .commit();
    }
}