// public class BowlingTeamApp {
    
    
// public void addPlayer(){

// }
// public void removePlayer(){

// }

// public void loopedMenu(int n){

//     for (int i =0; i<n ; i++){
      
        
//         double scores = 0.0;
//         for (int j =0; i<n ; i++){        
//             System.out.println("Player score is:" + scores);
//     }
//   }
// }

// }

public class BowlingTeamApp {

    // Players' names and scores
    private String[] playerNames = {"Alice", "Bob", "Charlie"};
    private int[] playerScores = {120, 150, 180};

    // Add a new player (add player at the end)
    private void addPlayer(String name, int score) {
        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] == null) {
                playerNames[i] = name;
                playerScores[i] = score;
                return;
            }
        }
    }

    // Remove a player
    private void removePlayer(String name) {
        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] != null && playerNames[i].equals(name)) {
                playerNames[i] = null;
                playerScores[i] = 0;
                return;
            }
        }
    }

    // View all players and scores
    private void viewPlayers() {
        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] != null) {
                System.out.println(playerNames[i] + ": " + playerScores[i]);
            }
        }
    }

    // Update a player's score
    private void updateScore(String name, int newScore) {
        for (int i = 0; i < playerNames.length; i++) {
            if (playerNames[i] != null && playerNames[i].equals(name)) {
                playerScores[i] = newScore;
                return;
            }
        }
    }

    // Run the app with hardcoded actions
    public void run() {
        // View players before any changes
        System.out.println("Initial players:");
        viewPlayers();

        // Adding a player
        addPlayer("David", 200);
        System.out.println("\nAfter adding David:");
        viewPlayers();

        // Updating Bob's score
        updateScore("Bob", 160);
        System.out.println("\nAfter updating Bob's score:");
        viewPlayers();

        // Removing Alice
        removePlayer("Alice");
        System.out.println("\nAfter removing Alice:");
        viewPlayers();
    }

    // Main method to run the app
    public static void main(String[] args) {
        new BowlingTeamApp().run();
    }
}
