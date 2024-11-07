package DayThree;

public class Examples {
    public static void main(String[] args) {
        String test = "blah\n";
        String test2 = "\"bla'h\"";
        String test3 = "blah3";
        String testCase = "BLAH";
        String formatTest = testCase.toLowerCase().concat(test);
        System.out.println(formatTest);
        int a = 1;
        int b = 2;
//        System.out.println(a + b);
//        System.out.format("%d%d", a, b);
        System.out.println(test + test2 + test3);
        System.out.println(test.equals(test2));
        System.out.println(test.equals(test3));
        System.out.println(test.equalsIgnoreCase(testCase));
    }
}