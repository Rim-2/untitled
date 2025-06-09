public class Main {
    public static String greet() {
        return "Hello, World!";
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(greet("Alice"));
    }
}