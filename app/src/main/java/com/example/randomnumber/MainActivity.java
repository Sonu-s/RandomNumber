package com.example.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int guessNumber;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }


    public void guessOnClick(View view) {



        EditText editText = findViewById(R.id.editTextId);
        Log.i("Info", editText.getText().toString());

        if (Integer.parseInt(editText.getText().toString()) == guessNumber) {
            makeToast("You Have OWN the game! Try Again!");
            Random random=new Random();
            guessNumber=random.nextInt(20)+1;
        }else if (Integer.parseInt(editText.getText().toString()) > guessNumber){
           makeToast("Lower!");

        }else{
          makeToast("Higher!");

        }    Log.i("RandomNumber", Integer.toString(guessNumber));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double randomNumber = Math.random();
        randomNumber = randomNumber * 20;
        randomNumber = randomNumber + 1;
         guessNumber = (int) randomNumber;
    }
}
