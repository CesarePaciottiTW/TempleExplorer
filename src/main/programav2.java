package main;
import java.util.Scanner;
public class main_program {
		static Scanner scanner = new Scanner(System.in);
	    
		static String playerName;
		static String playerAppearance = "Jesse, a tall and lean man with rugged features, short dark hair, and piercing blue eyes.";
		static String playerOutfit = "He wears a brown leather jacket with several pockets, black cargo pants, and sturdy boots.";
		static String[] playerInventory = {"water canteen", "map", "compass", "flashlight"};
		static int playerHealth = 100;
		static int playerStamina = 100;
	    
	    public static void main(String[] args) {
	        System.out.println("Welcome to the Temple Explorer Game!");
	        System.out.print("Enter your name: ");
	        playerName = scanner.nextLine();
	        System.out.println("Hello, " + playerName + "! Let's begin your adventure.");
	        System.out.println("You find yourself standing in front of an ancient temple.");
	        System.out.println(playerAppearance);
	        System.out.println(playerOutfit);
	        System.out.println("You have the following items in your backpack:");
	        for (String item : playerInventory) {
	            System.out.println("- " + item);
	        }
	        System.out.println("Your health is " + playerHealth + " and your stamina is " + playerStamina);
	        System.out.println("What would you like to do?");
	        String choice = scanner.nextLine();
	        switch (choice) {
	            case "explore":
	                exploreTemple();
	                break;
	            case "rest":
	                rest();
	                break;
	            case "check inventory":
	                checkInventory();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	    }
	    
	    static void exploreTemple() {
	        System.out.println("You enter the temple and find yourself in a dark hallway. On your right you see a high wall with cracks in it. On the wall on your left you see something that looks like ancient text, but it's too dark. Suddenly you hear metal crackling noise.");
	        System.out.println("What would you like to do?");
	        String choice = scanner.nextLine();
	        switch (choice) {
	            case "use flashlight":
	                System.out.println("You use your flashlight to illuminate the hallway. It turns out to be a statue on the corner of the hallway and in front of the statue you see a sword. Maybe the rackling noise came from here ");
	                break;
	            case "climb wall":
	                System.out.println("You climb the wall to get a better view of your surroundings.");
	                break;
	            case "decipher text":
	                System.out.println("You decipher the ancient text on the wall and learn about the temple's history.");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	    }
	    
	    static void rest() {
	        System.out.println("You take a break and rest for a while.");
	        playerStamina += 20;
	        if (playerStamina > 100) {
	            playerStamina = 100;
	        }
	        System.out.println("Your stamina is now " + playerStamina);
	    }
	    
	    static void checkInventory() {
	        System.out.println("You have the following items in your backpack:");
	        for (String item : playerInventory) {
	            System.out.println("- " + item);
	        }
	    }
	}
