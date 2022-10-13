package com.example.shogi2;

import java.util.ArrayList;
import java.util.Random;

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

public class GameState {
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
    private boolean turn; // [true = Player 1, false = other]
    private Board board;
    private final int p1 = 0;
    private final int p2 = 1;
    private Graveyard grave_1;
    private Graveyard grave_2;
    private ArrayList<Piece> pieces1;
    private ArrayList<Piece> pieces2;
    private String banner;
    private int turnCount = 1;

    /**
     * Current state of the game constructor
     */
    public GameState() { //Cntr
        turn = first();
        board = new Board();
        grave_1 = new Graveyard();
        grave_2 = new Graveyard();
        pieces1 = new ArrayList<Piece>();
        pieces2 = new ArrayList<Piece>();
    }

    /**
     * Current state of the game deep copy constructor
     */
    public GameState(int id, GameState orig) { //DEEP COPY cntr

        this.turn = orig.turn;
        this.board = orig.board;
        this.grave_1 = orig.grave_1;
        this.grave_2 = orig.grave_2;
        this.pieces1.addAll(orig.pieces1);
        this.pieces2.addAll(orig.pieces2);
    }

    /**
     * Determine next turn based on current turn
     */
    public void changeTurn() {
        turn = !turn;

        if (turn) {
            banner = "Player one's Turn";
        } else{
            banner = "Player two's turn";
        }
    }

    /**
     * Display all game state information in the TextView
     */
    @Override
    public String toString() {
        return "Weeee";
    }

    //Make methods for defined actions
    //make pieces
    private void assignPieces() {
        for (Piece.GAME_PIECES piece : Piece.GAME_PIECES.values()) {
            for (int i = 0; i < piece.getAmount(); i++) {
                pieces1.add(new Piece(piece, Piece.DIRECTION.FORWARD));
                pieces2.add(new Piece(piece,Piece.DIRECTION.BACKWARD));
            } // for i
        } // for pieces
    }
    // see who goes first
    public boolean first() {
        Random rand = new Random();
        int i = rand.nextInt(11);
        if (i < 6) {
            return true;
        } else {
            return false;
        }
    }
    // check and checkmate methods
    public boolean isChecked() {return false;}
    public boolean isCheckmated() {return false;}

    /**
     * Pre-set selected pieces and order
     *
     * @return selected piece from pieces array otherwise 0 (none)
     */
    public int selectPiece() {
        switch(turnCount) {
            case 1:
                turnCount++;
                return pieces1.indexOf(Piece.GAME_PIECES.PAWN);
            case 2:
                turnCount++;
                return pieces2.indexOf(Piece.GAME_PIECES.PAWN);
            case 3:
                return pieces1.indexOf(Piece.GAME_PIECES.ROOK);
        }
        return 0;
    }

    /**
     * Piece movement (hard coded now, flexible code later)
     * Pre-set pieces: p1 (pawn) at (7r,8c), p2 (pawn) at (3r,1c), p1 (rook) at (8r,8c)
     */
    public void initialPositions() {
        // identify piece


    }

    /**
     * Piece movement (hard coded now, flexible code later)
     * Pre-set pieces: p1 (pawn) to (6r,8c), p2 (pawn) to (4r,1c), p1 (rook) to (7r,8c)
     */
    public void movePiece() {

        // identify the piece
        switch(turnCount) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }

    /**
     * Piece capture (hard coded now, flexible code later)
     * pieces: (none) (skipping for GameState, from meeting)
     */
    public int pieceCapture() {
        // ID of piece captured
        // If 0, then no pieces were captured
        // Sends ID to graveyard
        return 0;
        // identify the piece
    }
}
