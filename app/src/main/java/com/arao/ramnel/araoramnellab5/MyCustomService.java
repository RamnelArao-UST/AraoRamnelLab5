package com.arao.ramnel.araoramnellab5;
import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyCustomService extends IntentService{

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyCustomService(String name) {
        super("MyCustomService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Intent","Service is Running at the background");
    }
}
