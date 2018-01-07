package com.example.admin.secondpracticeset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int THREE_POINTS = 3;
    private static final int TWO_POINTS = 2;
    private static final int FREE_THROW = 1;
    private static int scoreTeamA = 0;
    private static int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the score for the Team A
     *
     * @param score
     */
    private void displayForTeamA(int score) {
        TextView scoreTextView = findViewById(R.id.team_a_score);
        scoreTextView.setText(String.valueOf(score));
    }

    /**
     * This method displays the score for the Team B
     *
     * @param score
     */
    private void displayForTeamB(int score) {
        TextView scoreTextView = findViewById(R.id.team_b_score);
        scoreTextView.setText(String.valueOf(score));
    }

    /**
     * Add three points for the Team A
     *
     * @param view
     */

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add two points for the Team A
     *
     * @param view
     */
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add one point for the Team A
     *
     * @param view
     */
    public void addFreeThrowForTeamA(View view) {
        scoreTeamA = scoreTeamA + FREE_THROW;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add three points for the Team B
     *
     * @param view
     */

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add two points for the Team B
     *
     * @param view
     */
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add one point for the Team A
     *
     * @param view
     */
    public void addFreeThrowForTeamB(View view) {
        scoreTeamB = scoreTeamB + FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method reset scores for TeamA and TeamB
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
