public class Reduce {
    public static void main(String[] args) {
        int n = 0;
        int x = 100;
        while (x != 0) {
            if (x % 2 == 0) {
                x /= 2;

            } else {
                x -= 1;
            }
            n += 1;
        }
        System.out.println(n);
    }
}
