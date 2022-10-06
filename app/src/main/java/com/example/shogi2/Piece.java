package com.example.shogi2;

public class Piece {

    public enum GAME_PIECES
    {
        KING (R.drawable.king), GOLD_GENERAL (R.drawable.gold_gen), SILVER_GENERAL (R.drawable.silv_gen),
        PROMOTED_SILVER_GENERAL (R.drawable.promoted_silv_gen), BISHOP (R.drawable.bishop),
        PROMOTED_BISHOP (R.drawable.promoted_bishop), ROOK (R.drawable.rook),
        PROMOTED_ROOK (R.drawable.promoted_rook), LANCE (R.drawable.lance), PROMOTED_LANCE (R.drawable.promoted_lance),
        KNIGHT (R.drawable.knight), PROMOTED_KNIGHT (R.drawable.promoted_knight),
        PAWN (R.drawable.pawn), PROMOTED_PAWN (R.drawable.promoted_pawn)
    }

    public enum DIRECTION
    {
        FORWARD, BACKWARD
    }

    public GAME_PIECES pieceType;

    public DIRECTION directionMovement;

}
