import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> value = Arrays.asList(10.0, 20.0, 30.0);

        double avg = value.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}