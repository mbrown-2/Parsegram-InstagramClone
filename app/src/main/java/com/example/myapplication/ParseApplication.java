package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XDuTnLYmsVka0QP6FWrrVeGASjmMz3D78g5pWO3x")
                .clientKey("VGgAfMh2kplwHb991AOz2EYxVG0d8oWw5VklawEf")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
