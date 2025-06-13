class ReadOnlyStudent {
    private final int score;

    public ReadOnlyStudent(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        ReadOnlyStudent res = new ReadOnlyStudent(100);

        System.out.println(res.getScore());
    }
}