package com.game;
import figury.GamePiece;
import gameControll.Control;

import java.util.ArrayList;

public abstract class Director {
    abstract Map createMap();
    abstract ArrayList<GamePiece> createFigurs();
    abstract Control controlPlayer1();
    abstract Control controlPlayer2();



}
