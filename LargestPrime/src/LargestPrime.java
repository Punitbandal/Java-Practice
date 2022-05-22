public class LargestPrime {
    public static int getLargestPrime(int number) {
        for (int j = 1; j <= number; j++) {


            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    number /=i;
                }
            }
        }
        return number;
    }
}