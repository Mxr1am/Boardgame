
public class Main {

//    private static final int BOARD_SIZE = 18;
//    private static final int RED_START_POSITION = 1;
//    private static final int BLUE_START_POSITION = 10;
//
//    private int redPosition;
//    private int bluePosition;
//    private DiceRoll diceRoll;
//
//    public Main() {
//        redPosition = RED_START_POSITION;
//        bluePosition = BLUE_START_POSITION;
//        diceRoll = new DiceRoll();
//    }


//    private void movePlayer(boolean player) {
//        int roll = diceRoll.roll();
//        if (player) {
//            redPosition = Math.min(redPosition + roll, BOARD_SIZE);
//            System.out.println("Red rolls a " + roll + " and moves to position " + redPosition);
//        } else {
//            bluePosition = Math.min(bluePosition + roll, BOARD_SIZE);
//            System.out.println("Blue rolls a " + roll + " and moves to position " + bluePosition);
//        }
//    }



    private Player redPlayer;
    private Player bluePlayer;
    private DiceRoll dice;
    private int turn;

    public Main() {
        Board board = new Board();

        this.red = new Player("Red", board, 1);
        this.blue = new Player("Blue", board, 10);
        this.dice = new DiceRoll();
        this.turn = 1;  // Start from Turn 1
    }
//        dice = new DiceRoll();
//        redPlayer = new Player("Red", 1, board);
//        bluePlayer = new Player("Blue", 10, board);
//        this.turn = 1;
//    }
    public void startGame() {

        System.out.println("Red starts at position 1");
        System.out.println("Blue starts at position 10");


//        for (int i = 0; i < 10; i++) {
//            System.out.println("\nPlay " + (i + 1));
//            movePlayer(true);  // Red's turn
//            movePlayer(false); // Blue's turn
//        }
//
//
//    }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("\nTurn " + (i + 1));
//            if (redPlayer.move(dice)) return;
//            if (bluePlayer.move(dice)) return;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("\nTurn " + (i + 1));
//            if (redPlayer.move(dice)) {
//                System.out.println("Red wins!");
//                return;
//            }
//            if (bluePlayer.move(dice)) {
//                System.out.println("Blue wins!");
//                return;
//            }
//        }
//    }
        while (true) {
            System.out.println("\nTurn " + turn);

            if (red.move(dice)) {
                System.out.println("• Red wins in " + red.getMoves() + " moves!");
                break;
            }
            if (blue.move(dice)) {
                System.out.println("• Blue wins in " + blue.getMoves() + " moves!");
                break;
            }

            turn++;  // Increment turn after both players move
        }
    }}

//        int turn = 0;
//        while (true) {
//            System.out.println("\nTurn " + (++turn));
//            if (redPlayer.move(dice)) {
//                System.out.println("• " + redPlayer.getName() + " wins in " + turn + " moves!");
//                break;
//            }
//            if (bluePlayer.move(dice)) {
//                System.out.println("• " + bluePlayer.getName() + " wins in " + turn + " moves!");
//                break;
//            }
//        }
//    }
//
//        public static void main (String[]args){
//            Main game = new Main();
//            game.startGame();
//        }
//    }
