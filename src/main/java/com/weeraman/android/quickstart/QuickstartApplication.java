package com.weeraman.android.quickstart;

import com.activeandroid.ActiveAndroid;

/**
 * Created by anuradha on 1/4/15.
 */
public class QuickstartApplication extends com.activeandroid.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ActiveAndroid.initialize(this);
    }
}
