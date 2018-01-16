package com.e1sol.shogoleeedee;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by User on 1/16/2018.
 */

public class shogoledee extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Helvatica.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
