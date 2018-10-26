package com.example.bohdan.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scorePlayerA = 0;
    private int scorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementPlayerA(View view) {
        scorePlayerA += 1;
        displayScore();
    }

    public void incrementPlayerB(View view) {
        scorePlayerB += 1;
        displayScore();
    }

    public void decrementPlayerA(View view) {
        if (scorePlayerA != 0) {
            scorePlayerA -= 1;
            displayScore();
        }
    }

    public void decrementPlayerB(View view) {
        if (scorePlayerB != 0) {
            scorePlayerB -= 1;
            displayScore();
        }
    }

    public void resetScore(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayScore();
    }

    private void displayScore() {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        String score = scorePlayerA + ":" + scorePlayerB;
        scoreTextView.setText(score);
    }

}
