public class sumDigits {
    static int  sum = 0;
    static int current;

    public static void digits() {

        for (int i = 0; i <= 300; i++) {
            if (i % 4 == 0 && i % 6 != 0) {
                current = i;
                while (current > 0) {
                    sum += current % 10;
                    current = current / 10;
                }
                if (sum < 10) {
                    System.out.println(i);
                }
                sum = 0;
            }
        }
    }
}
