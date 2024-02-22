package ELDEN_ROGUE;
import  java.util.Scanner;

public class Game {
    private Scanner scanner;
    private Boolean isRunning = true;
    
    public Game() {
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        do {
        Title_Screen title_Screen = new Title_Screen();
        title_Screen.displayOptions();
        int choice = getUserChoice();
        
        switch (choice) {
            case 1:
                createCharacter();
                break;
            case 2:
                System.out.println("Exiting the game...");
                isRunning = false;
                break;
            case 3: 
                title_Screen.displayDetails(); 
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        } while (isRunning==true);
    }
    
    private void createCharacter() {
        CreateCharacter createCharacter = new CreateCharacter(scanner);
        createCharacter.startCreation();
    }
    
    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

