import java.util.ArrayList;
import java.util.List;

public class TeamManagement {

    private List<Player> players;

    // Constructor
    public TeamManagement() {
        this.players = new ArrayList<>();
    }

    // Method to add a player
    public void addPlayer(String name, int score) {
        players.add(new Player(name, score));
        System.out.println(name + " added to the team.");
    }

    // Method to remove a player by name
    public void removePlayer(String name) {
        players.removeIf(player -> player.getPlayerName().equalsIgnoreCase(name));
        System.out.println(name + " removed from the team (if they existed).");
    }

    // Method to display all players and their scores
    public void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players in the team.");
        } else {
            System.out.println("Players in the team:");
            for (Player player : players) {
                System.out.println(player);
            }
        }
    }

    public void updateScore(String playerName, int newScore) {
        for (Player player : players) {
            if (player.getPlayerName().equals(playerName)) {
                player.changeScore(newScore);
                break; // Exit the loop once the player is found and updated
            }
        }
    }
}
