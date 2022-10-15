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
    private int initX;
    private int initY;

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
    public int selectPiece1() {
        return pieces1.indexOf(Piece.GAME_PIECES.PAWN);
    }

    public int selectPiece2() {
        return pieces1.indexOf(Piece.GAME_PIECES.PAWN);
    }

    public int selectPiece3() {
        return pieces1.indexOf(Piece.GAME_PIECES.ROOK);
    }

    /**
     * Piece movement (hard coded now, flexible code later)
     * Pre-set pieces: p1 (pawn) at (7r,8c), p2 (pawn) at (3r,1c), p1 (rook) at (8r,8c)
     */
    public void initialPositions1() {
        // Pawn
        initX = 8;
        initY = 7;
    }

    public void initialPositions2() {
        // Pawn
        initX = 7;
        initY = 8;
    }

    public void initialPositions3() {
        // Rook
        initX = 1;
        initY = 3;
    }

    /**
     * Piece movement (hard coded now, flexible code later)
     * Pre-set pieces: p1 (pawn) to (6r,8c), p2 (pawn) to (4r,1c), p1 (rook) to (7r,8c)
     */
    public void movePiece1() {
        // Pawn, p1
        initX = 8;
        initY = 6;
    }

    public void movePiece2() {
        // Pawn, p2
        initX = 1;
        initY = 4;
    }

    public void movePiece3() {
        // Rook, p1
        initX = 8;
        initY = 7;
    }

    /**
     * Piece capture (hard coded now, flexible code later)
     * pieces: (none) (skipping for GameState, from meeting on Wed.)
     */
    public int pieceCapture() {
        // ID of piece captured
        // If 0, then no pieces were captured
        // Sends ID to graveyard
        return 0;
        // identify the piece
    }
}
