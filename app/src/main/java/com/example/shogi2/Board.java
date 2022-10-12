package com.example.shogi2;

public class Board {
    int row;
    int col;
    float xcord; // top left
    float ycord; // top left
    public Board(){
        row = 0;
        col = 0;
        xcord = 0;
        ycord = 0;
    }

    public Board(int _row, int _col, float _xcord, float _ycord){
        row = _row;
        col = _col;
        xcord = _xcord;
        ycord = _ycord;
    }
    // copy constructor
}
