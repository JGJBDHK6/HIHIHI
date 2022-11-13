public class _20피자나눠먹기_1 {
    public static void main(String[] args) {
        int n = 15;
        int pizza = 1;
        for (int pice = 7; pice < n; ) {
            pice += 7;
            pizza += 1;
        }
        System.out.println(pizza);
    }
}
