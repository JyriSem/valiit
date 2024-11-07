package DayTwo;

public class ArrayExample {
    public static void main(String[] args) {
        char[] charData = {'a', 'b', 'c'};
        String output = new String(charData);
        System.out.println(output);

        String firstPart = "one";
        String secondPart = "two";
        String full = firstPart.concat(secondPart);
        System.out.println(full);
        char c = firstPart.charAt(1);
        System.out.println(c);
    }
}