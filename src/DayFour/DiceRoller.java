package DayFour;

public class DiceRoller {
    public static void main(String[] args) {
        int diceRoll = rollDice();
        System.out.println("Rolled: " + diceRoll);
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}