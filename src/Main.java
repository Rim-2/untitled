public class Main {
    public static void main(String[] args) {
        char asciiChar = 'A';
        System.out.println("Character: " + asciiChar);

        int asciiCode= (int) asciiChar;
        System.out.println("ASCII Code: " + asciiCode);

        char koreanChar = '가';
        System.out.println("Character: "+ koreanChar);

        int uniCode2 = (int) koreanChar;
        System.out.println("ASCII Code: U+" + Integer.toHexString(uniCode2).toUpperCase());
    }
}