package day.two;

public class Scanner {
    public static final int EIGHT = 8;

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int inputNumber = userInput.nextInt();
        int result = inputNumber + EIGHT;
        System.out.println("Your number + " + EIGHT + " = " + result);
    }
}