interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("익명 클래스를 사용하여 출력한 문장입니다.");
            }
        };

        greeting.greet();
    }
}