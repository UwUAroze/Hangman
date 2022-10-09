public class Main {

    static int totalGuesses = 0;
    static int incorrectGuesses = 0;

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

    public static void main(String[] args) {
        printGame();
    }

    public static void printGame() {
        System.out.println(HangingMan.getFunny(incorrectGuesses));
        System.out.println(getRandomWord());
    }

    public static String getRandomWord() { return words[(int) (Math.random() * words.length)]; }

}