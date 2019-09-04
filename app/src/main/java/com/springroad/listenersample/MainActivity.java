package com.springroad.listenersample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public  static final String TAG = "SpringRoad";
    public Event event;
    public EventListener eventListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // call backe example
        // caller(callback)  : MainAcvity , callee : Event , listhener : Event Interface Clas
        // Service는 callback 테스트용

        // 1. create event class
        event = event.getInstance();
        // 2. create event interface class;
        eventListener = new EventListener() {
            @Override
            public void onEventCall() {

                Log.v(TAG,"MainActivity.onEventCall is called !!!!");
            }
        };

        // 3. set evnet listener class
        event.setEventListener(eventListener);

        Intent intent = new Intent(getApplicationContext(),EventService.class);
        startService(intent);

    }
}
