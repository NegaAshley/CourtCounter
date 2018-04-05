package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public final int threePointValue = 3;
    public final int twoPointValue = 2;
    public final int freeThrowValue = 1;
    private int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    /*
    This method displays the score
     */
    public void displayTeamAScore(){
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + teamAScore);
    }

    /*
    This method is called when the three point button is clicked.
     */
    public void scoreThreePointsTeamA(View view){
        teamAScore += threePointValue;
        displayTeamAScore();
    }

    /*
    This method is called when the two point button is clicked.
     */
    public void scoreTwoPointsTeamA(View view){
        teamAScore += twoPointValue;
        displayTeamAScore();
    }

    /*
    This method is called when the two point button is clicked.
     */
    public void scoreFreeThrowTeamA(View view){
        teamAScore += freeThrowValue;
        displayTeamAScore();
    }

    /*
    This method is called when the reset button is clicked.
     */
    public void resetTeamA(View view){
        teamAScore = 0;
        displayTeamAScore();
    }
}
