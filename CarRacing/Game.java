package CarRacing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private HashMap<Player, Car> game = new HashMap<>();
    boolean player1InTurn;
    String name;
    Player player;

    public void addGame(Player p, Car c) {
        game.put(p, c);
    }

    public void gameInfo() {
        for (Map.Entry<Player, Car> map : game.entrySet()) {
            System.out.println(map.getKey().getName() + " -> " + map.getValue().getName() + ", health: "
                    + map.getValue().getHealth() + ", power: " + map.getValue().getPower());
        }
    }

    public boolean checkDied(Player p) {
        return game.get(p).getHealth() <= 0;
    }

    public void setHealthInGame(Player p1, Player p2, int attack){
        game.get(p2).setHealth(game.get(p2).getHealth() - game.get(p1).getPower() * attack );
    }

    // Player 1 attack player 2
    public void attack(Player P1, Player P2) {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            player = (player1InTurn) ? P1 : P2;
            System.out.print(player.getName() + " attack (power * dam):");
            int p = Integer.valueOf(myObj.nextLine());

            if(player1InTurn)
                setHealthInGame(P1, P2, p);
            else
                setHealthInGame(P2, P1, p);
            this.gameInfo();

            if (player1InTurn && checkDied(P2)) {
                System.out.println(P1.getName() + " win");
                return;
            }
            if (!player1InTurn && checkDied(P1)) {
                System.out.println(P2.getName() + " win");
                return;
            }
            player1InTurn = !player1InTurn;

        }
    }
}
