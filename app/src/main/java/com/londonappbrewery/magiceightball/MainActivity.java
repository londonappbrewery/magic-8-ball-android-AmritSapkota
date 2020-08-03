package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.util.Log;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = (Button)findViewById(R.id.ask_button);

        final ImageView resultImage;
        resultImage = (ImageView) findViewById(R.id.imageView_result);

        final int[] arr = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Log.d("Magic Eight Balls", "button has been clicked");

                        Random randomNumberGenerator = new Random();
                        int number = randomNumberGenerator.nextInt(5);
                        Log.d("Magic Eight Balls","the random number is: " + number);

                        resultImage.setImageResource(arr[number]);


                    }
        });
    }
}
