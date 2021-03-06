package com.example.akh1l.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int cpuOccupiedCount = 0;
    int win = 0;
    int block = 0;
    int cpuScore = 0;
    int playerScore = 0;
    int playerIdentification = 1; //0 for cpu and 1 for player
    int playerOccupied[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int cpuOccupied[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    //using array to store all the id's
    int idArray[] = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            Intent twoPlayersIntent = new Intent (this, TwoPlayers.class);
            startActivity(twoPlayersIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if (playerIdentification == 1)
                    playersTurn(R.id.button1);
                else {
                    ImageButton button1 = (ImageButton) findViewById(R.id.button1);
                    if(win == 1)
                    {
                        button1.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button1.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button2:
                if (playerIdentification == 1)
                    playersTurn(R.id.button2);
                else{
                    ImageButton button2 = (ImageButton) findViewById(R.id.button2);
                    if(win == 1)
                    {
                        button2.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button2.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button3:
                if (playerIdentification == 1)
                    playersTurn(R.id.button3);
                else{
                    ImageButton button3 = (ImageButton) findViewById(R.id.button3);
                    if(win == 1)
                    {
                        button3.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button3.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button4:
                if (playerIdentification == 1)
                    playersTurn(R.id.button4);
                else{
                    ImageButton button4 = (ImageButton) findViewById(R.id.button4);
                    if(win == 1)
                    {
                        button4.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button4.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button5:
                if (playerIdentification == 1)
                    playersTurn(R.id.button5);
                else{
                    ImageButton button5 = (ImageButton) findViewById(R.id.button5);
                    if(win == 1)
                    {
                        button5.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button5.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button6:
                if (playerIdentification == 1)
                    playersTurn(R.id.button6);
                else{
                    ImageButton button6 = (ImageButton) findViewById(R.id.button6);
                    if(win == 1)
                    {
                        button6.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button6.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button7:
                if (playerIdentification == 1)
                    playersTurn(R.id.button7);
                else{
                    ImageButton button7 = (ImageButton) findViewById(R.id.button7);
                    if(win == 1)
                    {
                        button7.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button7.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button8:
                if (playerIdentification == 1)
                    playersTurn(R.id.button8);
                else{
                    ImageButton button8 = (ImageButton) findViewById(R.id.button8);
                    if(win == 1)
                    {
                        button8.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button8.setImageResource(R.drawable.oblack);
                    }
                }
                break;
            case R.id.button9:
                if (playerIdentification == 1)
                    playersTurn(R.id.button9);
                else{
                    ImageButton button9 = (ImageButton) findViewById(R.id.button9);
                    if(win == 1)
                    {
                        button9.setImageResource(R.drawable.owhite);
                    }
                    else
                    {
                        button9.setImageResource(R.drawable.oblack);
                    }
                }
                break;
        }

    }

    //resets the board and variables when the restart button is pressed
    public void restart(View v) {
        cpuOccupiedCount = 0;
        win = 0;
        block = 0;
        playerIdentification = 1; //0 for cpu and 1 for player
        for (int i = 0; i < 9; i++) {
            playerOccupied[i] = 0;
            cpuOccupied[i] = 0;
            ImageButton button = (ImageButton) findViewById(idArray[i]);
            button.setImageResource(R.drawable.blanktile);
            //color was set back to black
        }
    }

    public void playersTurn(int id) {
        //write code to ensure that "id" tile is already not occupied
        int idLocation = -1;                //an error will occur if the id is invalid
        for (int i = 0; i < 9; i++) {
            if (id == idArray[i]) {
                idLocation = i;         //to get the id of the button pressed
            }
        }
        if (playerOccupied[idLocation] != 1 && cpuOccupied[idLocation] != 1) {  //to check if the pressed button is occupied
            ImageButton button = (ImageButton) findViewById(id);
            button.setImageResource(R.drawable.xblack);
            playerOccupied[idLocation] = 1;  //setting that tile as players tile
            if (!playerCheck()) {
                if (cpuOccupiedCount < 4 && (win == 0))   //maximum tiles that can be occupied by the cpu && cpu has not won yet
                {
                    androidsTurn();
                }
            } else {
                playerScore++;
                //displayPlayerScore(playerScore);
                for (int i = 0; i < 9; i++) {
                    if (playerOccupied[i] == 0) {
                        playerOccupied[i] = 1;
                    }
                }
            }
        }
    }

    public void androidsTurn() {
        Random randomGenerator = new Random();
        int id = -1;
        boolean specialBlock = false;
        int cpuPressed = 0;

        if (cpuOccupiedCount == 1) {
            id = specialBlock1();
            if (id != -1) {
                cpuPressed = 1;
            }
        }
        if (playerOccupied[4] == 0 && cpuOccupied[4] == 0 && cpuOccupiedCount == 0) {
            id = idArray[4];
            cpuOccupied[4] = 1;
            cpuOccupiedCount++;
            cpuPressed = 1;
        }

        //if the cpu wins then all the remaining blocks are set as occupied by cpu so that user inputs are ignored
        if (id == -1 && cpuPressed == 0) {
            id = cpuWin();
        }
        if (win == 1 && cpuPressed == 0) {
            for (int k = 0; k < 9; k++) {
                if (cpuOccupied[k] == 0) {
                    cpuOccupied[k] = 1;
                }
            }
        } else if (cpuPressed == 0 && win == 0) {
            id = cpuBlock();
        }
        if (block == 0 && cpuPressed == 0) {
            specialBlock = superBlock();
        }
        if (specialBlock) {
            for (; ; ) {
                int specialNumber = randomGenerator.nextInt(9);
                if (playerOccupied[specialNumber] != 1 && cpuOccupied[specialNumber] != 1 && specialNumber % 2 == 1) {
                    id = idArray[specialNumber];
                    cpuOccupied[specialNumber] = 1;
                    cpuOccupiedCount++;
                    break;
                }
            }
        }
        //only if the corners are not occupied and the block == 0 && win == 0,  choose even numbers
        else if (block == 0 && win == 0 && cpuPressed == 0) {
            for (; ; ) {
                int number = randomGenerator.nextInt(9);
                //mod 2 is found so that the cpu always occupies corner tiles that is 0,2,4,6,8
                //only if the coreners are free then even number is chosen else odd number is chosen
                if ((cpuOccupied[0] == 0 && playerOccupied[0] == 0) ||
                        (cpuOccupied[2] == 0 && playerOccupied[2] == 0) ||
                        (cpuOccupied[4] == 0 && playerOccupied[4] == 0) ||
                        (cpuOccupied[6] == 0 && playerOccupied[6] == 0) ||
                        (cpuOccupied[8] == 0 && playerOccupied[8] == 0)) {
                    if (playerOccupied[number] != 1 && cpuOccupied[number] != 1 && number % 2 == 0) {
                        id = idArray[number];
                        cpuOccupied[number] = 1;
                        cpuOccupiedCount++;
                        break;
                    }
                } else if (playerOccupied[number] != 1 && cpuOccupied[number] != 1) {
                    id = idArray[number];
                    cpuOccupied[number] = 1;
                    cpuOccupiedCount++;
                    break;
                }
            }
        }

        if (id != -1) {
            ImageButton button = (ImageButton) findViewById(id);
            playerIdentification = 0;
            button.performClick();
            playerIdentification = 1;
        }

    }

    public int cpuWin() {
        int id = -1;
        int addToInc;
        int rowsToBeChecked = 3;
        //checking to win
        for (int j = 0; j < 3; j++) {
            if (j == 0) {
                addToInc = 3; // for rows
            } else if (j == 1) {
                addToInc = 1; // for columns
            } else {
                addToInc = 4;
            }

            for (int i = 0, rowCount = 0; rowCount < rowsToBeChecked; ) {
                if (cpuOccupied[i] == 1 && cpuOccupied[i + addToInc] == 1 && (cpuOccupied[i + 2 * addToInc] != 1 && playerOccupied[i + 2 * addToInc] != 1)) {
                    cpuOccupied[i + 2 * addToInc] = 1;
                    id = idArray[i + 2 * addToInc];
                    cpuOccupiedCount++;
                    win = 1;
                    cpuScore++;
                    displayCpuScore(cpuScore);
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(R.drawable.owhite);
                    }
                    return id; //if not returned the control back, it continues to check for other rows or coloumns and results in a bug
                } else if (cpuOccupied[i + 2 * addToInc] == 1 && cpuOccupied[i + addToInc] == 1 && (cpuOccupied[i] != 1 && playerOccupied[i] != 1)) {
                    cpuOccupied[i] = 1;
                    id = idArray[i];
                    cpuOccupiedCount++;
                    cpuScore++;
                    displayCpuScore(cpuScore);
                    win = 1;
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(R.drawable.owhite);
                    }
                    return id;
                } else if (cpuOccupied[i] == 1 && cpuOccupied[i + 2 * addToInc] == 1 && (cpuOccupied[i + addToInc] != 1 && playerOccupied[i + addToInc] != 1)) {
                    cpuOccupied[i + addToInc] = 1;
                    id = idArray[i + addToInc];
                    cpuOccupiedCount++;
                    cpuScore++;
                    displayCpuScore(cpuScore);
                    win = 1;
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(R.drawable.owhite);
                    }
                    return id;
                }
                if (j == 0) {
                    i++;    //for coloumn
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
        return id;
    }

    public int cpuBlock() {
        int id = -1;
        int addToInc;
        int rowsToBeChecked = 3;
        block = 0;
        //checking to win
        for (int j = 0; j < 3; j++) {
            if (j == 0)
                addToInc = 3; // for rows
            else if (j == 1)
                addToInc = 1; // for columns
            else
                addToInc = 4;
            for (int i = 0, rowCount = 0; rowCount < rowsToBeChecked; ) {
                if (playerOccupied[i] == 1 && playerOccupied[i + addToInc] == 1 && (cpuOccupied[i + 2 * addToInc] != 1 && playerOccupied[i + 2 * addToInc] != 1)) {
                    cpuOccupied[i + 2 * addToInc] = 1;
                    id = idArray[i + 2 * addToInc];
                    cpuOccupiedCount++;
                    block = 1;
                    return id; //if not returned the control back, it continues to check for other rows or coloumns and results in a bug
                } else if (playerOccupied[i + 2 * addToInc] == 1 && playerOccupied[i + addToInc] == 1 && (cpuOccupied[i] != 1 && playerOccupied[i] != 1)) {
                    cpuOccupied[i] = 1;
                    id = idArray[i];
                    cpuOccupiedCount++;
                    block = 1;
                    return id;
                } else if (playerOccupied[i] == 1 && playerOccupied[i + 2 * addToInc] == 1 && (cpuOccupied[i + addToInc] != 1 && playerOccupied[i + addToInc] != 1)) {
                    cpuOccupied[i + addToInc] = 1;
                    id = idArray[i + addToInc];
                    cpuOccupiedCount++;
                    block = 1;
                    return id;
                }
                if (j == 0) {
                    i++;    //for coloumn
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
        return id;
    }

    public boolean playerCheck() {
        int addToInc;
        int rowsToBeChecked = 3;
        //checking to win
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
                        button.setImageResource(R.drawable.xwhite);
                    }
                    return true; //if not returned the control back, it continues to check for other rows or coloumns and results in a bug
                } else if (playerOccupied[i + 2 * addToInc] == 1 && playerOccupied[i + addToInc] == 1 && playerOccupied[i] == 1) {
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(R.drawable.xwhite);
                    }
                    return true;
                } else if (playerOccupied[i] == 1 && playerOccupied[i + 2 * addToInc] == 1 && playerOccupied[i + addToInc] == 1) {
                    for (int w = 0; w < 3; w++) {
                        ImageButton button = (ImageButton) findViewById(idArray[i + w * addToInc]);
                        button.setImageResource(R.drawable.xwhite);
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

    //special case to block
    public boolean superBlock() {
        if ((playerOccupied[0] == 1 && playerOccupied[8] == 1) ||
                (playerOccupied[2] == 1 && playerOccupied[6] == 1)) {
            block = 1;
            return true;
        } else {
            block = 0;
            return false;
        }
    }

    public int specialBlock1() {
        int id = -1;
        if (playerOccupied[1] == 1 && (playerOccupied[6] == 1 || playerOccupied[8] == 1)) {
            id = idArray[0];           //idArray[2] also works
            cpuOccupied[0] = 1;
            cpuOccupiedCount++;
        } else if (playerOccupied[3] == 1 && (playerOccupied[2] == 1 || playerOccupied[8] == 1)) {
            id = idArray[6];            //idArray[0] also works
            cpuOccupied[6] = 1;
            cpuOccupiedCount++;
        } else if (playerOccupied[5] == 1 && (playerOccupied[0] == 1 || playerOccupied[6] == 1)) {
            id = idArray[2];           //idArray[8] also works
            cpuOccupied[2] = 1;
            cpuOccupiedCount++;
        } else if (playerOccupied[7] == 1 && (playerOccupied[0] == 1 || playerOccupied[2] == 1)) {
            id = idArray[6];        //idArray[8] also works
            cpuOccupied[6] = 1;
            cpuOccupiedCount++;
        }
        //another case to block when the cpu has already occupodied one tile
        else if (playerOccupied[1] == 1 && playerOccupied[3] == 1) {
            id = idArray[0];           //idArray[2] also works
            cpuOccupied[0] = 1;
            cpuOccupiedCount++;
        } else if (playerOccupied[1] == 1 && playerOccupied[5] == 1) {
            id = idArray[2];           //idArray[2] also works
            cpuOccupied[2] = 1;
            cpuOccupiedCount++;
        } else if (playerOccupied[5] == 1 && playerOccupied[7] == 1) {
            id = idArray[8];           //idArray[2] also works
            cpuOccupied[8] = 1;
            cpuOccupiedCount++;
        } else if (playerOccupied[7] == 1 && playerOccupied[3] == 1) {
            id = idArray[6];           //idArray[2] also works
            cpuOccupied[6] = 1;
            cpuOccupiedCount++;
        }
        return id;
    }
    public void displayCpuScore(int score) {

        TextView quantityTextView = (TextView) findViewById(R.id.cpuScoreText);
        //gets the string from the TextView and then gets rid of the last character, which is replaced with the new score in the next line
        String scoreModified = quantityTextView.getText().toString().substring(0,quantityTextView.getText().toString().length()- 1 );
        quantityTextView.setText(scoreModified + score);
    }

    public void displayPlayerScore(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.playerScoreText);
        //gets the string from the TextView and then gets rid of the last character, which is replaced with the new score in the next line
        String scoreModified = quantityTextView.getText().toString().substring(0,quantityTextView.getText().toString().length()- 1 );
        quantityTextView.setText(scoreModified + score);
    }
}