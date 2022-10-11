package com.example.shogi2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text;
    private Button runButton;
    private GameState firstInstance, secondInstance, thirdInstance;
    private String gameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runButton = findViewById(R.id.runButton);
        text = findViewById(R.id.stateText);

        firstInstance = new GameState();
        secondInstance = new GameState(firstInstance);
        thirdInstance = new GameState();

    }

    @Override
    public void onClick(View v) {
        text.setText(""); //Clear the string

        gameString = firstInstance.toString(); //Default board

        //Call a method here to make a change in firstInstance

        gameString = gameString + "\n" + firstInstance.toString()  + "\n"; //Append after a change

        //Call a method here to make a change in firstInstance

        gameString = gameString + "\n" + firstInstance.toString()  + "\n"; //Append after a change

        //Call a method here to make a change in firstInstance

        gameString = gameString + "\n" + firstInstance.toString()  + "\n"; //Append after a change

        gameString = gameString + "\n" + secondInstance.toString()  + "\n"
                + thirdInstance.toString()  + "\n"  + "\n"; //Append the other two instances (should be the same)

        text.setText(gameString); //Print the string ver
    }
}
