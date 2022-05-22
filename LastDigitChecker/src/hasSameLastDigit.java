public class hasSameLastDigit {
    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (isValid(a) && isValid(b) && isValid(c)) {
            int lasta = a % 10;
            int lastb = b % 10;
            int lastc = c % 10;

            return (lasta == lastb || lasta == lastc ||lastb==lastc);
        }
    return false;

    }
}
