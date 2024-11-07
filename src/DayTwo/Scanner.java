package DayTwo;

public class Scanner {
    public static final int DE = 8;

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = n + DE;
        System.out.println("Your number + 8 = " + result);
    }
}