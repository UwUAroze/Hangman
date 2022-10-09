import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Word list stolen from: https://github.com/UwUAroze/ChatMinigames/blob/master/src/main/resources/config.yml
    public static String[] words = {
            "Attractive", "Baguette", "Bathtub", "Bedrock", "Broadcast", "Brother", "Ceiling", "Character", "Choke",
            "Compartment", "Competitive", "Conclusion", "Confession", "Couple", "Cucumber", "Daddy", "Defenestration",
            "Diamond", "Discombobulated", "Duvet", "Eggplant", "Emerald", "Extension", "Fishing", "Floor", "Generator",
            "Greeting", "Hypothesis", "Immortal", "Improvement", "Invasion", "Iron", "Journal", "Knowledge", "Legend",
            "Marriage", "Mommy", "Multiplier", "Nerd", "Obsidian", "Photosynthesis", "Pillow", "Prestige", "Raid",
            "Sister", "Stick", "Suck", "Summer", "Swallow", "Transparent", "Treat", "Unique", "Villager", "Vomit",
            "Winter"
    };

    static ArrayList<String> guesses = new ArrayList<>();
    static ArrayList<String> incorrectGuesses = new ArrayList<>();
    static String word = getRandomWord();

    public static void main(String[] args) {
        System.out.println("\nHangman, woah!");
        while (true) nextTurn();
    }

    public static void printGame() {
        printFunnyMan();
        printPlaceHolders();
        StringBuilder misses = new StringBuilder().append("Misses:\t");
        for (String miss : incorrectGuesses) misses.append(miss);
        System.out.println(misses);
    }

    public static String getRandomWord() { return words[(int) (Math.random() * words.length)]; }
    public static String getInput() { return new Scanner(System.in).next().toLowerCase(); }
    public static void printFunnyMan() { System.out.println(HangingMan.getFunny(incorrectGuesses.size())); }

    static boolean checkForWin() {
        for (int x=0; x < word.length(); x++) if (!guesses.contains(String.valueOf(word.charAt(x)).toLowerCase())) return false;
        return true;
    }

    static void printPlaceHolders() {
        StringBuilder placeHolders = new StringBuilder().append("Word:\t");

        for (int x=0; x < word.length(); x++) {
            placeHolders.append(" ");
            String correctChar = String.valueOf(word.charAt(x));

            if (guesses.contains(correctChar.toLowerCase())) {
                placeHolders.append(correctChar);
                continue;
            } placeHolders.append("_");
        }

        System.out.println(placeHolders);
    }

    static void nextTurn() {

        System.out.println();

        printGame();
        System.out.print("\nGuess: ");
        String input = getInput();

        while (guesses.contains(input)) {
            System.out.print("You already tried that! Have another guess: ");
            input = getInput();
        }

        while (input.length() != 1) {
            System.out.print("Invalid input. Please try again: ");
            input = getInput();
        }

        guesses.add(input);
        if (!word.toLowerCase().contains(input.toLowerCase())) incorrectGuesses.add(input);

        if (checkForWin()) {
            printFunnyMan();
            System.out.println("You wonn!");
            System.out.println("Now only half a man is hanged! woo.");
            System.exit(0);
        }

        if (incorrectGuesses.size() == 6) {
            printFunnyMan();
            System.out.println("Game over. The man has been hanged ;c");
            System.out.println("The word was: '" + word + "'");
            System.exit(0);
        }

    }

}