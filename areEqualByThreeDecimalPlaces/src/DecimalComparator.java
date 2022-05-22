public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a *= 1000;
        b *= 1000;
        int aa = (int) a;
        int bb = (int) b;
        return aa == bb;
    }
}
