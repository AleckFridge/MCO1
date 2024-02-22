package ELDEN_ROGUE;

import java.util.*;

public class CreateCharacter {
    private Scanner scanner;
    private String characterName;
    private String JobClass;
    private int characterLvl;
    private int statistics;

    public CreateCharacter(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startCreation() {
        System.out.println("Creating Character...");
        System.out.println("Options:");
        System.out.println("[1] Input Name");
        System.out.println("[2] Select Job Class");
        System.out.println("[3] Confirm");
        System.out.println("[4] Back");
        System.out.println("[5] Show Details");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                inputName();
                break;
            case 2:
                selectJobClass();
                break;
            case 3:
                confirmCharacter();
                break;
            case 4:
                System.out.println("Going back to main menu...");
                break;
            case 5:
                showDetails(); 
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                startCreation();
        }
    }

    private void inputName() {
        System.out.print("Enter character name: ");
        String name = scanner.next();
        setCharacterName(name);
        startCreation(); // Go back to character creation menu
    }
        

private int jobClassIndex;

private void selectJobClass(){
    System.out.println("Select Job Class:");
    String[] jobClasses = { "Vagabond", "Samurai", "Warrior", "Hero", "Astrologer", "Prophet" };
    System.out.println(Arrays.toString(jobClasses));
    int choice;
    String jobClass = jobClasses[jobClassIndex];

    while (true) {
        System.out.print("Enter the number of your choice: ");
        choice = scanner.nextInt();

        if (choice >= 1 && choice <= jobClasses.length)
            break;

        System.out.println("Invalid choice. Please try again.");
    }

    jobClassIndex = choice - 1;
    System.out.println("You have selected " + jobClasses[jobClassIndex] + ".");
    setJobClass(jobClass);// Go back to character creation menu
    startCreation();
}   
    

    private void confirmCharacter() {
        System.out.println("Confirming character...");
        String jobClass;

    switch (jobClassIndex) {
            case 0:
                jobClass = "Vagabond";
                setJobClass(jobClass);
                break;
            case 1:
                jobClass = "Samurai";
                setJobClass(jobClass);
                break;
            case 2:
                jobClass = "Warrior";
                setJobClass(jobClass);
                break;
            case 3:
                jobClass = "Hero";
                setJobClass(jobClass);
                break;
            case 4:
                jobClass = "Astrologer";
                setJobClass(jobClass);
                break;
            case 5:
                jobClass = "Prophet";
                setJobClass(jobClass);
                break;
            default:
                jobClass = "Unknown";
                break;
        }
    }

    public void showDetails() {
        System.out.println("ELDEN ROGUE");
        System.out.println("Name: "+getCharacterName());
        System.out.println("Job Class: "+ getJobClass());
        System.out.println("Level: "+ getcharacterLvl());
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
    public String getCharacterName()
    {
        return characterName;
    }

    public void setCharacterName(String name)
    {
        this.characterName = name;
    }
    public String getJobClass(){
        return JobClass;
    }

    public void setJobClass(String jobClass){
        this.JobClass = jobClass;
    }
    
    public int getcharacterLvl(){
        return characterLvl;
    }
    public void setcharacterLvl(int level){
        this.characterLvl = level;
    }

}