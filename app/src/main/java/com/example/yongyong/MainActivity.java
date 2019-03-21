package com.example.yongyong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.app.

import net.daum.android.map.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    MapView mapView = new MapView(this);

    ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
    mapViewContainer.addView(mapView);
    }
