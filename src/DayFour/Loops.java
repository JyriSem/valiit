package DayFour;

public class Loops {
    public static void main(String[] args) {
        whileLoop();
//        DoWhile();
//        forLoop();
    }

    public static void forLoop() {
        for (int count = 1; count <= 5; count++) {
            System.out.println("For Count " + count);
        }
    }

    public static void doWhileLoop() {
        int count = 1;

        do {
            System.out.println("Do Count " + count);
            count++;

        } while (count <= 5);
    }

    public static void whileLoop() {
        int count = 1;

        while (count <= 5) {
            System.out.println("While Before " + count);
            count++;
            System.out.println("While After " + count);
        }
    }
}