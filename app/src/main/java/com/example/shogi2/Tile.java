package com.example.shogi2;

public class Tile {
    int row;
    int col;
    float xcord; // top left
    float ycord; // top left
    public Tile(){
        row = 0;
        col = 0;
        xcord = 0;
        ycord = 0;
    }

    public Tile(int _row, int _col, float _xcord, float _ycord){
        row = _row;
        col = _col;
        xcord = _xcord;
        ycord = _ycord;
    }
}
