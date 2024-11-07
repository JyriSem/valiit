package day.three;

public class Examples {
    public static void main(String[] args) {
        useOfMultipleBuiltInMethods();
        ignoreCaseOnEqual();
        formatInt();
        addValues();
        comparingValues();
    }

    public static void useOfMultipleBuiltInMethods() {
        String upperCaseValue = "PHO";
        String concatValue = "ning";
        String foratting = upperCaseValue.toLowerCase().concat(concatValue);
        System.out.println(foratting);
    }

    public static void ignoreCaseOnEqual() {
        String compareValueOne = "wave";
        String compareValueTwo = "WAVE";
        System.out.println(compareValueOne.equalsIgnoreCase(compareValueTwo));
    }

    public static void formatInt() {
        int a = 1;
        int b = 2;
        System.out.format("%d%d\n", a, b);
    }

    public static void addValues() {
        String blah = "blah";
        String blahn = "blah\n";
        String iblahi = "\"bla'h\"";
        System.out.println(blah + blahn + iblahi);
    }

    public static void comparingValues() {
        String blah = "blah";
        String blahn = "blah\n";
        String iblahi = "\"bla'h\"";
        System.out.println(blah.equals(blahn));
        System.out.println(blah.equals(iblahi));
        System.out.println(blahn.equals(iblahi));
    }
}
