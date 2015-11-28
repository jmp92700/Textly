package com.jordanpeterson.textly.application;


import android.app.Application;

import com.jordanpeterson.textly.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;


public class TextlyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Parse.initialize(this, "Q8LcfuyEpSWhOcGmqmnYFxmLKlGgP0EkvJ0YsQqi", "4XgwBwECUnCHkv7tMMRhrYILV5qQgawMLYcyS2mp");

        ParseInstallation.getCurrentInstallation().saveInBackground();


    }
    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }


}

