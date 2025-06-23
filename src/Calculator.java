public class Calculator {
    /**
     * @deprecated Use {@link #addNumber(int, int)} instead.
     */
    @Deprecated
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 두 수를 더합니다.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return 두 수의 합
     */
    public int addNumber(int a, int b) {
        return a + b;
    }
}