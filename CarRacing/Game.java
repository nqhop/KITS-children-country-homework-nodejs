package CarRacing;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private HashMap<Player, Car> game = new HashMap<>();

    public void addGame(Player p, Car c){
        game.put(p, c);
    }

    
    public void gameInfo() {
        for(Map.Entry<Player, Car> map : game.entrySet()){
            System.out.println(map.getKey().getName() + " -> " + map.getValue().getName() + ", headlth: " + map.getValue().getHealth() + ", power: " + map.getValue().getPower());
        }
    }

    // Player 1 attack player 2
    public void attack(Player P1, Player P2){
        System.out.println(P1.getName() + " attack " + P2.getName());
        if(game.get(P2).getHealth() <= 0){
            System.out.println(P2.getName() + " died");
            return;
        }
        game.get(P2).setHealth(game.get(P2).getHealth() - game.get(P1).getPower());
        if(game.get(P2).getHealth() <= 0){
            System.out.println(P2.getName() + " died");
            return;
        }
        gameInfo();
    }
}
