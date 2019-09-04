package com.springroad.listenersample;

import android.util.Log;

public class Event {

    public  static final String TAG ="SpringRoad";
    public  static Event gInstance = null;
    public EventListener eventListener = null ;

    public static Event getInstance(){
        if(gInstance == null)
            gInstance = new Event();

        return  gInstance;
    }

    public void Event(){

    }

    public  void setEventListener(EventListener eventListener) {
        Log.v(TAG,"setEventListener !!!");
        this.eventListener = eventListener;
    }

    public void callEvent()
    {
        Log.v(TAG,"Calling Event !!!");
        eventListener.onEventCall();
    }

}
