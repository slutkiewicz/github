package com.game;

import figury.Cordinates;
import figury.GamePiece;
import gameControll.Control;

import java.util.ArrayList;

public class Map {
    private int size;

    private GamePiece[][] Pieces = new GamePiece[size][size];

    private Control WhiteControl;
    private Control BlackControl;

    private GamePiece Attacker;
    private GamePiece Defender;


    private ArrayList<Integer> Mapper;

    public GamePiece WhitePickPiece(Cordinates piece)

    {

    }

    public GamePiece BlackPickPiece(Cordinates piece)

    {


    }
    public Cordinates WhitePickDestination()

    {
        Cordinates select;
//      System input
        return select;
    }

    public Cordinates BlackPickDestination()

    {

        Cordinates select;
//      System input
        return select;
    }
    //----------------------------------------------------------------------
    public boolean WhiteKillCheck(GamePiece Attacker,Cordinates piece) {
        for (GamePiece WhiteIt : WhitePieces) {
            if (WhiteIt.getMyCordinates().checkIfSame(piece))
                return false;
        }

        for (GamePiece BlackIt : BlackPieces) {
            if (BlackIt.getMyCordinates().checkIfSame(piece)) {
                if (BlackIt.kill(piece))
                    return true;
                    }
                }
                return false;
    }
    //----------------------------------------------------------------------
    public boolean BlackKillCheck(GamePiece Attacker,Cordinates piece){
        for (GamePiece BlackIt : BlackPieces) {
            if (BlackIt.getMyCordinates().checkIfSame(piece))
                return false;
        }

        for (GamePiece WhiteIt : WhitePieces) {
            if (WhiteIt.getMyCordinates().checkIfSame(piece)) {
                if (WhiteIt.kill(piece))
                    return true;
            }
        }
        return false;
    }
    //----------------------------------------------------------------------
    public boolean WhiteMoveCheck(GamePiece Attacker,Cordinates piece){
        for (GamePiece WhiteIt : WhitePieces) {
            if (WhiteIt.getMyCordinates().checkIfSame(piece))
                return false;
        }

        for (GamePiece BlackIt : BlackPieces) {
            if (BlackIt.getMyCordinates().checkIfSame(piece)) {
                if (BlackIt.move(piece))
                    return true;
            }
        }
        return false;
    }
    //----------------------------------------------------------------------
    public boolean BlackMoveCheck(GamePiece Attacker,Cordinates piece){
        for (GamePiece BlackIt : BlackPieces) {
            if (BlackIt.getMyCordinates().checkIfSame(piece))
                return false;
        }

        for (GamePiece WhiteIt : WhitePieces) {
            if (WhiteIt.getMyCordinates().checkIfSame(piece)) {
                if (WhiteIt.move(piece))
                    return true;
            }
        }
        return false;
    }
    //----------------------------------------------------------------------
    public void KillPiece(int id){


    }
    //----------------------------------------------------------------------
    public void MovePIece(int id,Cordinates toMove){

    }
}