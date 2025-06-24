import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeFile("example.txt", "쭈꾸미 먹어야겠다");
        System.out.println("파일 생성 완료");
    }
}