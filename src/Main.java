import java.util.ArrayList;
import java.util.InputMismatchException;
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

    static ArrayList<String> correctGuesses = new ArrayList<>();
    static ArrayList<String> incorrectGuesses = new ArrayList<>();
    static String word = getRandomWord();

    public static void main(String[] args) {
        while (true) nextTurn();
    }

    public static void printGame() {
        System.out.println(HangingMan.getFunny(incorrectGuesses.size()));
        System.out.println(word);
        printPlaceHolders();
    }

    public static String getRandomWord() { return words[(int) (Math.random() * words.length)]; }
    public static String getInput() { return new Scanner(System.in).next().toLowerCase(); }

    static void printPlaceHolders() {
        StringBuilder placeHolders = new StringBuilder();

        for (int x=0; x < word.length(); x++) {
            placeHolders.append(" ");
            String correctChar = String.valueOf(word.charAt(x));

            if (correctGuesses.contains(correctChar.toLowerCase())) {
                placeHolders.append(correctChar);
                continue;
            } placeHolders.append("_");
        }

        System.out.println(placeHolders);
    }

    static void nextTurn() {
        System.out.print("Guess: ");
        String input = getInput();
        if (word.toLowerCase().contains(input.toLowerCase())) correctGuesses.add(input);
        else incorrectGuesses.add(input);

        printGame();

    }

}