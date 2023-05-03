package com.kastorcode.mathoperationsgame.helpers;

import android.app.Activity;
import android.content.Intent;

import com.kastorcode.mathoperationsgame.MainActivity;
import com.kastorcode.mathoperationsgame.activities.GameActivity;

public class Navigate {

    public static void gameActivity (Activity activity, String operation) {
        Intent intent = new Intent(activity, GameActivity.class);
        intent.putExtra("operation", operation);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void mainActivity (Activity activity, int userScore) {
        Intent intent = new Intent(activity, MainActivity.class);
        intent.putExtra("userScore", userScore);
        activity.startActivity(intent);
        activity.finish();
    }

}