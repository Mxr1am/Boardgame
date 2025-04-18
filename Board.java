//public class Board {
//
//    private static final int SIZE = 18;
//    private static final int TAIL_START = SIZE - 2;
//    private static final int TAIL_END = SIZE + 1;
//
//    public int move(int currentPosition, int roll) {
//        int newPosition = currentPosition + roll;
//
//
//        if (newPosition >= TAIL_START) {
//            int tailStep = newPosition - TAIL_START + 1;
//            if (tailStep >= 3) {
//                System.out.println("Moves to TAIL (Tail Position 3 - END)");
//                return TAIL_END;
//            } else {
//                System.out.println("Moves to TAIL (Tail Position " + tailStep + ")");
//                return SIZE + tailStep - 2;
//            }
//        }
//
//        return Math.min(newPosition, SIZE);
//    }
//
//    public boolean hasWon(int position) {
//        return position == TAIL_END;
//    }
//}

public class Board {

    private static final int SIZE = 18;
    private static final int RED_TAIL_START = 18;  // Red enters tail after position 18
    private static final int BLUE_TAIL_START = 9;  // Blue enters tail after position 9
    private static final int TAIL_END = 21;        // Tail Position 3 (Winning position)

    public int move(String player, int currentPosition, int roll) {
        int newPosition = (currentPosition + roll - 1) % SIZE + 1; // Wrap around board correctly

        // RED Player Tail Handling (after position 18)
        if (player.equals("Red") && currentPosition >= RED_TAIL_START) {
            int tailStep = currentPosition - RED_TAIL_START + 1;
            if (tailStep >= 3) {
                System.out.println("Moves to TAIL (R3 - END)");
                return TAIL_END; // Red wins
            } else {
                System.out.println("Moves to TAIL (R" + tailStep + ")");
                return RED_TAIL_START + tailStep;
            }
        }

        // BLUE Player Tail Handling (after position 9)
        if (player.equals("Blue") && currentPosition >= BLUE_TAIL_START) {
            int tailStep = currentPosition - BLUE_TAIL_START + 1;
            if (tailStep >= 3) {
                System.out.println("Moves to TAIL (B3 - END)");
                return TAIL_END; // Blue wins
            } else {
                System.out.println("Moves to TAIL (B" + tailStep + ")");
                return BLUE_TAIL_START + tailStep;
            }
        }

        return newPosition; // Continue moving clockwise normally
    }

    public boolean hasWon(int position) {
        return position == TAIL_END;
    }
}
