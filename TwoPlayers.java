package com.example.akh1l.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TwoPlayers extends AppCompatActivity implements View.OnClickListener {

    int win = 0;
    int block = 0;
    int playerOScore = 0;
    int playerXScore = 0;
    int playerIdentification = 1; //0 for player x and 1 for player 0
    int playerXOccupied[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int playerOOccupied[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    //using array to store all the id's
    int idArray[] = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_players);
        TextView scoreXText = (TextView)findViewById(R.id.playerXScoreText);
        scoreXText.setTextColor(Color.parseColor("#C68E17"));
        //Initialisation of all the nine buttons using there id from the xml file and waiting for the button to be clicked
        ImageButton button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        ImageButton button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        ImageButton button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        ImageButton button4 = (ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        ImageButton button5 = (ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        ImageButton button6 = (ImageButton) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        ImageButton button7 = (ImageButton) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        ImageButton button8 = (ImageButton) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        ImageButton button9 = (ImageButton) findViewById(R.id.button9);
        button9.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.twoPlayers) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button1);
                }else {
                     playerTwosTurn(R.id.button1);
                    }
                break;
            case R.id.button2:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button2);
                }else {
                    playerTwosTurn(R.id.button2);
                }
                break;
            case R.id.button3:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button3);
                }else {
                    playerTwosTurn(R.id.button3);
                }
                break;
            case R.id.button4:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button4);
                }else {
                    playerTwosTurn(R.id.button4);
                }
                break;
            case R.id.button5:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button5);
                }else {
                    playerTwosTurn(R.id.button5);
                }
                break;
            case R.id.button6:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button6);
                }else {
                    playerTwosTurn(R.id.button6);
                }
                break;
            case R.id.button7:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button7);
                }else {
                    playerTwosTurn(R.id.button7);
                }
                break;
            case R.id.button8:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button8);
                }else {
                    playerTwosTurn(R.id.button8);
                }
                break;
            case R.id.button9:
                if (playerIdentification == 1) {
                    playerOnesTurn(R.id.button9);
                }else {
                    playerTwosTurn(R.id.button9);
                }
                break;
        }

    }

    //resets the board and variables when the restart button is pressed
    public void restart(View v) {
        TextView scoreXText = (TextView)findViewById(R.id.playerXScoreText);
        TextView scoreOText = (TextView)findViewById(R.id.playerOScoreText);
        scoreXText.setTextColor(Color.parseColor("#C68E17"));
        scoreOText.setTextColor(Color.parseColor("#FFFFFF"));
        win = 0;
        block = 0;
        playerIdentification = 1; //0 for playerO and 1 for playerX
        for (int i = 0; i < 9; i++) {
            playerXOccupied[i] = 0;
            playerOOccupied[i] = 0;
            ImageButton button = (ImageButton) findViewById(idArray[i]);
            button.setImageResource(R.drawable.blanktile);
            //color was set back to black
        }
    }

    public void playerOnesTurn(int id) {
        TextView scoreXText = (TextView)findViewById(R.id.playerXScoreText);
        TextView scoreOText = (TextView)findViewById(R.id.playerOScoreText);
        scoreXText.setTextColor(Color.parseColor("#FFFFFF"));
        scoreOText.setTextColor(Color.parseColor("#C68E17"));
        int idLocation = -1;                //an error will occur if the id is invalid
        for (int i = 0; i < 9; i++) {
            if (id == idArray[i]) {
                idLocation = i;         //to get the id of the button pressed
            }
        }
        if (playerXOccupied[idLocation] != 1 && playerOOccupied[idLocation] != 1) {  //to check if the pressed button is occupied
            ImageButton button = (ImageButton) findViewById(id);
            button.setImageResource(R.drawable.xblack);
            playerXOccupied[idLocation] = 1;  //setting that tile as players tile
            playerIdentification = 0;
            if (playerCheck(playerXOccupied))
            {
                playerXScore++;
                displayXPlayerScore(playerXScore);
                for (int i = 0; i < 9; i++) {
                    if (playerXOccupied[i] == 0) {
                        playerXOccupied[i] = 1;
                    }
                }
            }
        }
    }
    public void playerTwosTurn(int id)
    {
        TextView scoreXText = (TextView)findViewById(R.id.playerXScoreText);
        TextView scoreOText = (TextView)findViewById(R.id.playerOScoreText);
        scoreOText.setTextColor(Color.parseColor("#FFFFFF"));
        scoreXText.setTextColor(Color.parseColor("#C68E17"));
        int idLocation = -1;                //an error will occur if the id is invalid
        for (int i = 0; i < 9; i++) {
            if (id == idArray[i]) {
                idLocation = i;         //to get the id of the button pressed
            }
        }
        if (playerXOccupied[idLocation] != 1 && playerOOccupied[idLocation] != 1) {  //to check if the pressed button is occupied
            ImageButton button = (ImageButton) findViewById(id);
            button.setImageResource(R.drawable.oblack);
            playerOOccupied[idLocation] = 1;  //setting that tile as players tile
            playerIdentification = 1;
            if (playerCheck(playerOOccupied))
            {
                playerOScore++;
                displayOPlayerScore(playerOScore);
                for (int i = 0; i < 9; i++) {
                    if (playerXOccupied[i] == 0) {
                        playerXOccupied[i] = 1;
                    }
                }

            }
        }
    }

    public boolean playerCheck(int playerOccupied[]) {
        int id ;
        int addToInc;
        int rowsToBeChecked = 3;
        //checking to win
        if(playerIdentification == 0)
        {
            id = R.drawable.xwhite;
        }
        else
        {
            id = R.drawable.owhite;
        }
        for (int j = 0; j < 3; j++) {
            if (j == 0) {
                addToInc = 3; // for rows
            } else if (j == 1) {
                addToInc = 1; // for columns
            } else {
                addToInc = 4;
            }
            for (int i = 0, rowCount = 0; rowCount < rowsToBeChecked; ) {
                if (playerOccupied[i] == 1 && playerOccupied[i + addToInc] == 1 && playerOccupied[i + 2 * addToInc] == 1) {
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(id);
                    }
                    return true; //if not returned the control back, it continues to check for other rows or coloumns and results in a bug
                } else if (playerOccupied[i + 2 * addToInc] == 1 && playerOccupied[i + addToInc] == 1 && playerOccupied[i] == 1) {
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(id);
                    }
                    return true;
                } else if (playerOccupied[i] == 1 && playerOccupied[i + 2 * addToInc] == 1 && playerOccupied[i + addToInc] == 1) {
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(id);
                    }
                    return true;
                }
                if (j == 0) {
                    i++;    //for column
                } else if (j == 1) {
                    i += 3;    //for row
                } else {
                    i = 2;                  // for checking diagonal from top right to bottom left
                    rowsToBeChecked = 2;
                    addToInc = 2;
                }
                rowCount++;
            }
        }
        return false;
    }

    public void displayOPlayerScore(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.playerOScoreText);
        //gets the string from the TextView and then gets rid of the last character, which is replaced with the new score in the next line
        String scoreModified = quantityTextView.getText().toString().substring(0,quantityTextView.getText().toString().length()- 1 );
        quantityTextView.setText(scoreModified + score);
    }

    public void displayXPlayerScore(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.playerXScoreText);
        //gets the string from the TextView and then gets rid of the last character, which is replaced with the new score in the next line
        String scoreModified = quantityTextView.getText().toString().substring(0,quantityTextView.getText().toString().length()- 1 );
        quantityTextView.setText(scoreModified + score);
    }
}

