import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.println("연산자를 입력하세요(+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        System.out.println("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("값은 %f입니다.\n", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("값은 %f입니다.\n", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("값은 %f입니다.\n", result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.printf("값은 %f입니다.\n", result);
                }
                break;
            default:
                System.out.println("부적절한 연산자입니다.");
        }
        scanner.close();
    }
}