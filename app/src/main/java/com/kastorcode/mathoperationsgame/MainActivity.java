package com.kastorcode.mathoperationsgame;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.kastorcode.mathoperationsgame.helpers.Navigate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLastScore();
        setClickListeners();
    }

    private void getLastScore () {
        View scoreWrapper = findViewById(R.id.scoreWrapper);
        int userScore = getIntent().getIntExtra("userScore", -1);
        if (userScore == -1) {
            scoreWrapper.setVisibility(View.GONE);
        }
        else {
            Toast.makeText(this, R.string.gameOver, Toast.LENGTH_LONG).show();
            TextView score = findViewById(R.id.score);
            score.setText(String.valueOf(userScore));
            scoreWrapper.setVisibility(View.VISIBLE);
        }
    }

    private void setClickListeners () {
        findViewById(R.id.addition).setOnClickListener(view -> Navigate.gameActivity(this, "+"));
        findViewById(R.id.division).setOnClickListener(view -> Navigate.gameActivity(this, "/"));
        findViewById(R.id.multiplication).setOnClickListener(view -> Navigate.gameActivity(this, "*"));
        findViewById(R.id.subtraction).setOnClickListener(view -> Navigate.gameActivity(this, "-"));
        findViewById(R.id.kastorcode).setOnClickListener(view ->
                Toast.makeText(
                        this,
                        getString(R.string.poweredBy) + "\n\ngithub.com/kastorcode",
                        Toast.LENGTH_LONG
                ).show());
    }

}