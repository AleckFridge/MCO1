package ELDEN_ROGUE;
import java.util.*;

public class Title_Screen {
    private Scanner scanner;

    public Title_Screen() {
        this.scanner = new Scanner(System.in);
    }
    public void ShowTitle(){
        System.out.println("Welcome to Elden Rogue!");
    }
    public void displayOptions(){
        System.out.println("Options:");
        System.out.println("[1] Start"); 
        System.out.println("[2] Exit");
        System.out.println("[3] Details:");
    }

    public void displayDetails(){
       
        System.out.println("[1]Game Title");
        System.out.println("[2]SystemPrompts");
    }

    public int getUserChoice(){
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public void closeScanner() {
        scanner.close();
    }

    public static void main(String[] args) {
        Title_Screen screen = new Title_Screen();
        screen.displayOptions();
        int choice = screen.getUserChoice();

        switch (choice) {
            case 1:
                System.out.println("Starting the game...");
                // Add code for starting the game
                break;
            case 2:
                System.out.println("Exiting the game...");
                // Add code for exiting the game
                break;
            case 3:
                System.out.println("Displaying Game Details...");
                screen.displayDetails();
                choice = screen.getUserChoice();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        choice = screen.getUserChoice();

        switch (choice) {
            case 1:
                System.out.println("ELDEN ROGUE");
                // Add code for displaying game title details
                break;
            case 2:
                System.out.println("SystemPrompts: You will receive system prompts during gameplay.");
                // Add code for displaying system prompt details
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        screen.closeScanner();
    }
}

