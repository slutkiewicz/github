package com.game;

import gameControll.Control;
import gameMode.GameMode;

public class GameCommand {
    private static GameCommand ourInstance = new GameCommand();

    private Game nowGame ;


    public static GameCommand getInstance() {

        return ourInstance;
    }

    private GameCommand() {

    }
    public static void NewGame(){



    }
    public static void Restart(){


    }
    public static void Quit(){


    }
    private class GameMaker{
        private Map map;
        private Control whiteControl;
        private Control blackControl;
        private GameMode gameMode;

        public Game MakeGame() {
            System.out.println("Select White Controls");
            System.out.println("Select Black Controls");

            System.out.println("Select Game Mode");

            Game newGame=new Game();
            return newGame;
        }
    }
}
