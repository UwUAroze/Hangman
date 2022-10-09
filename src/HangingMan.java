public class HangingMan {

    public static String getFunny(int hangy) {

        // "hangy" = number of missed guesses

        return switch (hangy) {

            case 0 ->
                "+---+\n" +
                "|   |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n";

            case 1 ->
                "+---+\n" +
                "|   |\n" +
                "O   |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n";

            case 2 ->
                "+---+\n" +
                "|   |\n" +
                "O   |\n" +
                "|   |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n";

            case 3 ->
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|   |\n" +
                "     |\n" +
                "     |\n" +
                " =========\n";

            case 4 ->
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n" +
                "     |\n" +
                "     |\n" +
                " =========\n";

            case 5 ->
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n" +
                "/    |\n" +
                "     |\n" +
                " =========\n";

            case 6 ->
                " +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n" +
                "/ \\  |\n" +
                "     |\n" +
                " =========\n";

            default -> "This shouldn't have happened";
        };

    }

}
