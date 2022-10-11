package com.example.shogi2;

import java.util.ArrayList;
import java.util.Random;

public class GameState extends Button{
    /* [other class]/
    * Board (reference to copy constructor)
    * Pieces
    * */

    /**
     * Grave (2)
     * Button (new game)
     * TextView (____'s Turn / ____ Wins!)
     * Turn (keep track) X
     *
     * Current selected piece
     * Selected space
     * Locations
     *
     * Players
     *
     * *** if stalemate ***
     * Previous turn state
     * */
    private boolean Turn; // [true = Player, false = other]
    private Board board;
    private Graveyard grave_1;
    private Graveyard grave_2;
    private ArrayList<Piece> Pieces1;
    private ArrayList<Piece> Pieces2;

    public GameState() { //Cntr
        Turn = first();
        board = new Board();
        grave_1 = new Graveyard();
        grave_2 = new Graveyard();
        Pieces1 = new ArrayList<Piece>();
        Pieces2 = new ArrayList<Piece>();
    }

    public GameState(GameState orig) { //DEEP COPY cntr
    }

    @Override
    public String toString() {
        return "Weeee";
    }

    //Make methods for defined actions
    //make pieces
    private void assignPieces(ArrayList<Piece>){
        for(piece : Piece.GAME_PIECES){

        }
    }
    // see who goes first
    public boolean first(){
        Random rand = new Random();
        int i = rand.nextInt(11);
        if(i < 6){return true;}
        else{return false;}
    }
    // check and checkmate methods
    public boolean isChecked(){return false;}
    public boolean isCheckmated(){return false;}

}
