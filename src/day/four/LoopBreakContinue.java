package day.four;

public class LoopBreakContinue {
    public static void main(String[] args) {
        forBreak();
        forContinue();
    }

    private static void forBreak() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Break Loop:" + i);
        }
    }

    private static void forContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Continue (Skip) Loop:" + i);
        }
    }
}