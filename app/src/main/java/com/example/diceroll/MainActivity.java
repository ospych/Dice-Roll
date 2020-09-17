package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int dice1;
    int dice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void roll(View view){
        dice1=(int)(Math.random()*6+1);
        dice2=(int)(Math.random()*6+1);
        int sum = dice1 + dice2;
        if (dice1 == 1){
            ImageView imageView = (ImageView) findViewById(R.id.dice1);
            imageView.setImageResource(R.drawable.one);
        } else if (dice2 == 1){
            ImageView imageView = (ImageView) findViewById(R.id.dice2);
            imageView.setImageResource(R.drawable.one);
        }

        if (dice1 == 2){
            ImageView imageView = (ImageView) findViewById(R.id.dice1);
            imageView.setImageResource(R.drawable.two);
        } else if (dice2 == 2){
            ImageView imageView = (ImageView) findViewById(R.id.dice2);
            imageView.setImageResource(R.drawable.two);
        }
        if (dice1 == 3){
            ImageView imageView = (ImageView) findViewById(R.id.dice1);
            imageView.setImageResource(R.drawable.three);
        } else if (dice2 == 3){
            ImageView imageView = (ImageView) findViewById(R.id.dice2);
            imageView.setImageResource(R.drawable.three);
        }
        if (dice1 == 4){
            ImageView imageView = (ImageView) findViewById(R.id.dice1);
            imageView.setImageResource(R.drawable.four);
        } else if (dice2 == 4){
            ImageView imageView = (ImageView) findViewById(R.id.dice2);
            imageView.setImageResource(R.drawable.four);
        }
        if (dice1 == 5){
            ImageView imageView = (ImageView) findViewById(R.id.dice1);
            imageView.setImageResource(R.drawable.five);
        } else if (dice2 == 5){
            ImageView imageView = (ImageView) findViewById(R.id.dice2);
            imageView.setImageResource(R.drawable.five);
        }
        if (dice1 == 6){
            ImageView imageView = (ImageView) findViewById(R.id.dice1);
            imageView.setImageResource(R.drawable.six);
        } else if (dice2 == 6){
            ImageView imageView = (ImageView) findViewById(R.id.dice2);
            imageView.setImageResource(R.drawable.six);
        }
        displayTotal(sum);
    }

    private void displayTotal(int total){
        TextView textView = (TextView) findViewById(R.id.total);
        textView.setText("" + total);
    }
}