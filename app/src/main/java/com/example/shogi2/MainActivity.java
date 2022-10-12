package com.example.shogi2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

/**
 *
 * @author Kathryn Weidman
 * @author Emma Kelly
 * @author Brent Torres
 * @author Matthew Tran
 *
 * @version 10/11/2022
 *
 * */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text;
    private GameState firstInstance, secondInstance, thirdInstance;
    private String gameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = findViewById(R.id.stateText); //Make this a reference to the @string?

        firstInstance = new GameState();
        secondInstance = new GameState(0, firstInstance);
        //TODO: Fix gamestate copy cntr to make it from a specific player perspective
        thirdInstance = new GameState();

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.runButton) {

            text.setText(""); //Clear the string

            gameString = firstInstance.toString(); //Default board

            //TODO: Call a method here to make a change in firstInstance

            gameString = gameString + "\n" + firstInstance.toString() + "\n"; //Append after a change

            //TODO: Call a method here to make a change in firstInstance

            gameString = gameString + "\n" + firstInstance.toString() + "\n"; //Append after a change

            //TODO: Call a method here to make a change in firstInstance

            gameString = gameString + "\n" + firstInstance.toString() + "\n"; //Append after a change

            gameString = gameString + "\n" + secondInstance.toString() + "\n"
                    + thirdInstance.toString() + "\n" + "\n"; //Append the other two instances (should be the same)

            text.setText(gameString); //Print the string ver
        }
    }
}
