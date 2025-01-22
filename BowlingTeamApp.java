import java.util.Scanner;

public class BowlingTeamApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For reading user input
        TeamManagement team = new TeamManagement();

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add Player");
            System.out.println("2. Update Player Score");
            System.out.println("3. Remove Player");
            System.out.println("4. View Players");
            System.out.println("q. Quit");
            System.out.print("Enter your choice: ");

            // Read user input
            String choice = scanner.nextLine();

            if (choice.equals("q")) {
                System.out.println("Exiting program.");
                break;  // Exit the loop and the program
            }

            switch (choice) {
                case "1": // Add Player
                    System.out.print("Enter player's name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter player's score: ");
                    int scoreToAdd = Integer.parseInt(scanner.nextLine());
                    team.addPlayer(nameToAdd, scoreToAdd);
                    break;

                case "2": // Update Player Score
                    System.out.print("Enter player's name to update score: ");
                    String nameToUpdate = scanner.nextLine();
                    System.out.print("Enter new score: ");
                    int newScore = Integer.parseInt(scanner.nextLine());
                    team.updateScore(nameToUpdate, newScore);
                    break;

                case "3": // Remove Player
                    System.out.print("Enter player's name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    team.removePlayer(nameToRemove);
                    break;

                case "4": // View Players
                    System.out.println("\nCurrent Players:");
                    team.displayPlayers();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close(); // Close the scanner when done
    }
}
