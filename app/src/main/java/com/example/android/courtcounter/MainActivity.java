package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalA = 0;
    int totalB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void threeA(View view) {

        totalA = totalA + 3;
        displayForTeamA(totalA);
    }

    public void twoA(View view) {

        totalA = totalA + 2;
        displayForTeamA(totalA);
    }

    public void oneA(View view) {

        totalA = totalA + 1;
        displayForTeamA(totalA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threeB(View view) {

        totalB = totalB + 3;
        displayForTeamB(totalB);
    }

    public void twoB(View view) {

        totalB = totalB + 2;
        displayForTeamB(totalB);
    }

    public void oneB(View view) {

        totalB = totalB + 1;
        displayForTeamB(totalB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {

        totalA = 0;
        displayForTeamA(totalA);
        totalB = 0;
        displayForTeamB(totalB);

    }
}
