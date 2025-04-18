public class Player {

    private String name;
    private int position;
    private Board board;
    private int moves;

    public Player(String name, int startPosition, Board board) {
        this.name = name;
        this.position = startPosition;
        this.board = board;
        this.moves = 0;
    }

//    public void move(DiceRoll dice) {
//        int roll = dice.roll();
//        position = board.move(position, roll, name);
//        System.out.println(name + " rolls a " + roll + " and moves to position " + position);
//        return position == Board.END_POSITION;
//    }



//    public boolean move(DiceRoll dice) {
//        int roll = dice.roll();
//        moves++;
//        System.out.println(name + " play " + moves + " rolls " + roll);
//        int newPosition = board.move(position, roll);
//
//        if (newPosition != position) {
//            System.out.println("• " + name + " moves from Position " + position + " to Position " + newPosition);
//            position = newPosition;
//        }
//        return board.hasWon(position);
//    }
public boolean move(DiceRoll dice) {
    int roll = dice.roll();
    moves++;
    System.out.println(name + " play " + moves + " rolls " + roll);


    int newPosition = board.move(name, position, roll);

    if (newPosition != position) {
        System.out.println("• " + name + " moves from Position " + position + " to Position " + newPosition);
        position = newPosition;
    }
    return board.hasWon(position);
}


//    public boolean move(DiceRoll dice) {
//        int roll = dice.roll();
//        position = board.move(position, roll);
//        System.out.println(name + " rolls a " + roll + " and moves to position " + position);
//        return board.isWinningPosition(position);
//    }


//    public int getPosition() {
//        return position;
//    }

//    public String getName() {
//        return name;
//    }
}
