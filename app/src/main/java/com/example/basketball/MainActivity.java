package com.example.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      TextView scoreAtxt;
      TextView scoreBtxt;
      int score=0;
      int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreAtxt=findViewById(R.id.teamAscore);
        scoreBtxt=findViewById(R.id.teamBscore);
        displayScoreA();
        displayScoreB();
    }

    private void displayScoreA() {
        scoreAtxt.setText(String.valueOf(score));
    }



    public void addThreePointsTeamA(View view) {
        score+=3;
        displayScoreA();
    }

    public void addTwoPointsTeamA(View view) {
        score+=2;
        displayScoreA();
    }

    public void addOnePointTeamA(View view) {
        score+=1;
        displayScoreA();
    }

    public void displayScoreB(){
        scoreBtxt.setText(String.valueOf(scoreB));
    }
    public void addThreePointsTeamB(View view) {
        scoreB+=3;
        displayScoreB();
    }

    public void addTwoPointsTeamB(View view) {
        scoreB+=2;
        displayScoreB();
    }

    public void addOnePointTeamB(View view) {
        scoreB+=1;
        displayScoreB();
    }

    public void Reset(View view) {
        score=0;
        scoreB=0;
        displayScoreA();
        displayScoreB();
    }
}
