package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for TeamA
    int scoreTeamA = 0;
    //Tracks the score for TeamB
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method displays the given score of TeamA
     */
    private void displayForTeamA(int scoreTeamA) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText(String.valueOf(scoreTeamA) );
    }

    public void addThreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void  addTwoForTeamA (View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA (View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * This method displays the given score of TeamB
     */
    private void displayForTeamB(int scoreTeamB) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_b_score);
        quantityTextView.setText(String.valueOf(scoreTeamB) );
    }

    public void addThreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void  addTwoForTeamB (View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB (View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    //This method resets the score for both teams to zero

    public void resetScore (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
