package com.priscila.rabbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by tiagoalmeida on 25/05/15.
 */
public class RabbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "9VZ2EBKX0KNIIrSUPzZywbIR0tiTImWAjSM0vabb", "6hi0318fFph2Rb4LJhCAc9cw6XgGjxx8g8ZcMwtW");
    }


}
