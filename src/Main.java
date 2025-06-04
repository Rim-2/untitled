//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mood = "angry";

        switch (mood) {
            case "happy":
                System.out.println("행복해용");
                break;
            case "angry":
                System.out.println("화나용");
                break;
            case "sad":
                System.out.println("슬퍼용");
                break;
            default:
                System.out.println("그냥그래용");
        }

        if (mood == "happy") {
            System.out.println("행복해용");
        } else if (mood == "angry") {
            System.out.println("화나용");
        } else if (mood == "sad") {
            System.out.println("슬퍼용");
        } else {
            System.out.println("그냥그래용");
        }

        int a = 12;
        System.out.println(a++);
    }
}