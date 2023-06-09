package MyClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass {

    static Scanner scanner = new Scanner(System.in);

    public static class Item {
        private String name;
        private String description;
        private int value;

        public Item(String name, String description, int value) {
            this.name = name;
            this.description = description;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

    private static String playerName;
    private static String playerAppearance = "Jesse, a tall and lean man with rugged features, short dark hair, and piercing blue eyes.";
    private static String playerOutfit = "He wears a brown leather jacket with several pockets, black cargo pants, and sturdy boots.";

    private static ArrayList<Item> items = new ArrayList<Item>();

    private static int playerHealth = 100;
    private static int playerStamina = 100;

    public static void main(String[] args) {
        items.add(new Item("water canteen", "A container for carrying water.", 10));
        items.add(new Item("map", "A map of the area.", 5));
        items.add(new Item("compass", "A device for determining direction.", 8));
        items.add(new Item("flashlight", "A portable electric light.", 15));

        System.out.println("Welcome to the Temple Explorer Game!");

        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();

        System.out.println("Hello, " + playerName + "! Let's begin our adventure.");

        System.out.println("You find yourself standing in front of an ancient temple.");

        char[][] gameMap = {
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'R'},
            {'M', 'M', 'M', 'V', 'V', 'F', 'F', 'R', 'R', 'T'}
        };

        System.out.println("   `,.      .   .        *   .    .      .  _    ..          .\r\n"
        		+ "     \\,~-.         *           .    .       ))       *    .\r\n"
        		+ "          \\ *          .   .  |    *  . .  ~    .      .  .  ,\r\n"
        		+ " ,           `-.  .            :               *           ,-\r\n"
        		+ "  -             `-.        *._/_\\_.       .       .   ,-'\r\n"
        		+ "  -                 `-_.,     |n|     .      .       ;\r\n"
        		+ "    -                    \\ ._/_,_\\_.  .          . ,'         ,\r\n"
        		+ "     -                    `-.|.n.|      .   ,-.__,'         -\r\n"
        		+ "      -                   ._/_,_,_\\_.    ,-'              -\r\n"
        		+ "      -                     |..n..|-`'-'                -\r\n"
        		+ "       -                 ._/_,_,_,_\\_.                 -\r\n"
        		+ "         -               ,-|...n...|                  -\r\n"
        		+ "           -         ,-'._/_,_,_,_,_\\_.              -\r\n"
        		+ "             -  ,-=-'     |....n....|              -\r\n"
        		+ "              -;       ._/_,_,_,_,_,_\\_.         -\r\n"
        		+ "             ,-          |.....n.....|          -\r\n"
        		+ "           ,;         ._/_,_,_,_,_,_,_\\_.         -\r\n"
        		+ "  `,  '.  `.  \".  `,  '.| n   ,-.   n |  \",  `.  `,  '.  `,  ',\r\n"
        		+ ",.:;..;;..;;.,:;,.;:,o__|__o !.|.! o__|__o;,.:;.,;;,,:;,.:;,;;:\r\n"
        		+ " ][  ][  ][  ][  ][  |_i_i_H_|_|_|_H_i_i_|  ][  ][  ][  ][  ][\r\n"
        		+ "                     |     //=====\\\\     |\r\n"
        		+ "                     |____//=======\\\\____|\r\n"
        		+ " Ancien Temple           //=========\\\\");

        System.out.println(playerAppearance);
        System.out.println(playerOutfit);

        System.out.println("You have the following items in your backpack:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + " (" + item.getDescription() + ")");
        }

        System.out.println("Your health is " + playerHealth + " and your stamina is " + playerStamina);
        System.out.println("What would you like to do? (explore) (rest) (check inventory)");
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
        System.out.println("You enter the temple and find yourself in a dark hallway. On your right, you can see a high wall with cracks in it. On your left, you can spot something that looks like ancient text. At the end of the hallway, there seems to be a door leading to a room.");

        String choice;
        do {
            System.out.println("What would you like to do? (use flashlight) (climb wall) (decipher text) (enter room)");
            choice = scanner.nextLine();

            switch (choice) {
                case "use flashlight":
                    System.out.println("You use your flashlight to illuminate the hallway.");
                    System.out.println("You can now see the door at the end of the hallway more clearly.");
                    break;

                case "climb wall":
                    System.out.println("You climb the wall to get a better view of your surroundings.");
                    break;

                case "decipher text":
                    System.out.println("You decipher the ancient text on the wall and learn about the temple's history. \"Deep within the heart of an untamed jungle, an ancient temple stood in solemn majesty. Its towering stone pillars reached towards the heavens, adorned with intricate carvings that told the tales of forgotten gods and lost civilizations. Whispers of untold treasures and unsolved mysteries lured brave adventurers from distant lands, drawn to uncover the secrets that lay hidden within the temple's sacred chambers. Little did they know, the temple held not only riches but also ancient guardians and tests of wit and courage, ready to challenge all who dared to enter.\"");
                    break;

                case "enter room":
                    enterRoom();
                    break;

                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (!choice.equals("enter room"));
    }

    static void enterRoom() {
        System.out.println("You enter the room. It's filled with ancient artifacts. You can see a golden idol on a pedestal, a chest full of treasures, and carpet on one of the walls.");

        String choice;
        do {
            System.out.println("What would you like to do? (inspect idol) (open chest) (inspect carpet)");
            choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "inspect idol":
                    System.out.println("As you approach the idol, the ground shakes, you look around, but there is no one in the room except you and some stone statue !");
                    break;

                case "open chest":
                    System.out.println("You open the chest and find a trove of precious gems, gold coins, and a healing potion.");
                    items.add(new Item("key", "A key to unlock doors.", 0));
                    items.add(new Item("healing potion", "A potion that restores health.", 0));
                    System.out.println("You've added a key and a healing potion to your inventory!");
                    break;

                case "inspect carpet":
                    System.out.println("You inspect the carpet. It's covered in strange symbols. You find secret passege behinde the carpet you are ready to enter it, but suddenly stone guardian show behinde you");
                    encounterGuardian();
                    break;

                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (!choice.equals("inspect carpet"));
    }


    static void encounterGuardian() {
        System.out.println("The guardian, a massive stone creature, blocks your path. You will need to fight to proceed!");

        int guardianHealth = 100;

        while (playerHealth > 0 && guardianHealth > 0) {
            System.out.println("What will you do? (attack/run/use healing potion)");
            String choice = scanner.nextLine();

            switch (choice) {
                case "attack":
                    int damageToGuardian = (int) (Math.random() * 85);
                    guardianHealth -= damageToGuardian;
                    System.out.println("You attack the guardian and deal " + damageToGuardian + " damage. Guardian's health is now " + guardianHealth);

                    if (guardianHealth <= 0) {
                        System.out.println("You've defeated the guardian! It drops a gem as it crumbles.");
                        items.add(new Item("gem", "A valuable gem.", 0));
                        System.out.println("You've added a gem to your inventory!");
                        enterTreasureRoom();
                        return;
                    }

                    int damageToPlayer = (int) (Math.random() * 15);
                    playerHealth -= damageToPlayer;
                    System.out.println("The guardian retaliates and deals " + damageToPlayer + " damage. Your health is now " + playerHealth);
                    if (playerHealth <= 0) {
                        System.out.println("You've been defeated by the guardian... Game over!");
                        return;
                    }
                    break;

                case "run":
                    System.out.println("You decide to run away. The guardian returns to its dormant state.");
                    return;

                case "use healing potion":
                    boolean hasHealingPotion = false;
                    for (Item item : items) {
                        if (item.getName().equals("healing potion")) {
                            hasHealingPotion = true;
                            break;
                        }
                    }
                    if (hasHealingPotion) {
                        playerHealth += 50;
                        if (playerHealth > 100) {
                            playerHealth = 100;
                        }
                        System.out.println("You drink the healing potion and recover some health. Your health is now " + playerHealth);
                        items.removeIf(item -> item.getName().equals("healing potion"));
                    } else {
                        System.out.println("You don't have a healing potion in your inventory.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void enterTreasureRoom() {
        System.out.println("You walk down the passage and enter the treasure room. In the middle of the room, there is a pedestal with an inscription. It seems to be some kind of puzzle.");

        System.out.println("What will you do? (Solve puzzle)");
        String choice = scanner.nextLine();

        switch (choice) {
            case "Solve puzzle":
                solvePuzzle();
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    static void solvePuzzle() {
        System.out.println("The inscription on the pedestal reads: 'I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?'");

        System.out.println("Enter your answer:");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("echo")) {
            System.out.println("Correct! The pedestal opens and reveals a priceless golden idol. You pick up the idol and add it to your inventory.");
            items.add(new Item("golden idol", "A priceless golden idol.", 0));
        } else {
            System.out.println("That's not the correct answer. The pedestal remains closed.");
        }

        System.out.println("Suddenly, you step on a loose tile in the floor and hear a rumbling sound. A giant stone ball is rolling towards you!");

        runFromBall();
    }

    static void runFromBall() {
        System.out.println("You start running back towards the entrance of the temple. There are several obstacles in your path.");

        while (true) {
            System.out.println("What will you do? (jump over obstacle/dodge obstacle)");
            String choice = scanner.nextLine();

            switch (choice) {
                case "jump over obstacle":
                    System.out.println("You jump over the obstacle and continue running.");
                    break;

                case "dodge obstacle":
                    System.out.println("You dodge the obstacle and continue running.");
                    break;

                default:
                    System.out.println("Invalid choice. You stumble, and the stone ball catches up to you... Game over!");
                    return;
            }

            if (Math.random() < 0.2) {
                System.out.println("You've reached the entrance of the temple and managed to escape the stone ball just in time. Congratulations, " + playerName + "! You've survived the temple and completed the adventure with the golden idol in your inventory.");
                return;
            }
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
        for (Item item : items) {
            System.out.println("- " + item.getName() + " (" + item.getDescription() + ")");
        }
    }
}

