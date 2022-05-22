public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        int originalDigit = num;
        if (num < 1) {
            return false;
        } else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;

                }
            }
            //System.out.println(sum);
        }

        return (originalDigit == sum);

    }
}
