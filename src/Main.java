public class Main {

    public static void main(String[] args) {
        int x = 2;

        while (x > 0) {
            int y = x * 4;

            if (x < 2) {
                System.out.print("L");
            } else {
                System.out.print("A");
            }

            if (y > 6) {
                for (int i = y + 1; i < y + 3; i++) {
                    System.out.print("P");
                }
            }

            if (x % 2 == 1) {
                System.out.print("E");
            }

            --x;
        }
    }
}