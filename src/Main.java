public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0 || i % 3 != 0) {
                if (i == 100) {
                    break;
                }

                continue;
            }

            System.out.println(i);
        }
    }
}