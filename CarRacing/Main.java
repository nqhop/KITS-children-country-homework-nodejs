package CarRacing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", 10, 1);
        Car car2 = new Car("Car2", 10, 2);
        Car car3 = new Car("Car3", 10, 4);


        Player player1 = new Player("Jax");
        Player player2 = new Player("Lee");

        Game game = new Game();
        game.addGame(player1, car1);
        game.addGame(player2, car2);
        game.gameInfo();
        game.attack(player1, player2);
    }
}
