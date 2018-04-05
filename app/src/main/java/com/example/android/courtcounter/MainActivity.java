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
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    This method displays the team A score
     */
    public void displayTeamAScore(){
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + teamAScore);
    }

    /*
    This method displays the team Bscore
     */
    public void displayTeamBScore(){
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText("" + teamBScore);
    }

    /*
    This method is called when the team A three point button is clicked.
     */
    public void scoreThreePointsTeamA(View view){
        teamAScore += threePointValue;
        displayTeamAScore();
    }

    /*
    This method is called when the team B three point button is clicked.
     */
    public void scoreThreePointsTeamB(View view){
        teamBScore += threePointValue;
        displayTeamBScore();
    }

    /*
    This method is called when the team A two point button is clicked.
     */
    public void scoreTwoPointsTeamA(View view){
        teamAScore += twoPointValue;
        displayTeamAScore();
    }

    /*
    This method is called when the team B two point button is clicked.
     */
    public void scoreTwoPointsTeamB(View view){
        teamBScore += twoPointValue;
        displayTeamBScore();
    }

    /*
    This method is called when the team A free throw is clicked.
     */
    public void scoreFreeThrowTeamA(View view){
        teamAScore += freeThrowValue;
        displayTeamAScore();
    }

    /*
    This method is called when the team B free throw is clicked.
     */
    public void scoreFreeThrowTeamB(View view){
        teamBScore += freeThrowValue;
        displayTeamBScore();
    }

    /*
    This method is called when the reset button is clicked.
     */
    public void reset(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore();
        displayTeamBScore();
    }
}
