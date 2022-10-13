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
     * Includes: Positions, selectedPiece and pieceType, turn,
     * and current state of the game (ongoing play).
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
     * Selecting (identifying) a piece
     *
     * @return selected piece ID
     */
    public int selectPiece() {

        return 0;
    }

    /**
     * Piece movement (hard coded now, flexible code later)
     * Pre-set pieces: p1 (pawn), p2 (pawn), p1 (rook)
     */
    public void initialPositions() {
        // board.tiles



        // identify the piece
    }

    /**
     * Piece capture (hard coded now, flexible code later)
     * pieces: (none) not demonstrating for GameState!
     */
    public int pieceCapture() {
        // ID of piece captured
        // If 0, then no pieces were captured
        // Sends ID to graveyard
        return 0;
        // identify the piece
    }

    // capture piece -> move piece
    // capture -> if (enemy) - is at visited spot, send them to grave
    // line per action
    // how to have move piece: we do 3 hard coded movements
    // then flexible movement, due friday
    // diagonal movement

    // selected piece (identifies current piece)
    // caoture -> remove it from the board -> add it to the graveyard
    // cant drop unless something's captured

    // move a pawn, rook, and king



}
