package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }




    //this is the code for the courtCounter


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointTeamA(View view){
     scoreTeamA += 3;
     displayForTeamA(scoreTeamA);


    }
    public void twoPointTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);


    }
    public void onePointTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }

        //Team b scores and buttons

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);


    }
    public void twoPointTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);


    }
    public void onePointTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }

    public void reset(View view){
        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
