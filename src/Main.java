interface Calculator {
    int compute(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a % b;
            }
        };

        System.out.println(calculator.compute(3, 6));
    }
}