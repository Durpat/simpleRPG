package Game;

import Player.Player;

import java.util.Scanner;

public class Game {
    public void startGame(){
        Player player = new Player();
            player.profile();
            player.lvlUp();
            player.profile();
        }
}
