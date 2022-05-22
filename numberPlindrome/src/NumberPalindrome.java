/*
public class NumberPalindrome {
    public static boolean isPalindrome(int num) {

        return ( reverseNumber(num) == num);
    }

    public static long reverseNumber(int num) {
        int digit = 0;
        int newDigit = 0;

        boolean isNegative = num < 0 ? true : false;
        if (isNegative) {
            num = num * -1;
        }

        while (num >= 1) {
            digit = num % 10;
            newDigit = newDigit * 10+digit;
            num = num / 10;

        }
        return (isNegative == true? newDigit*-1 : newDigit);
    }

}*/

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int digit = 0;
        int newDigit = 0;
        int originalNo=num;

        boolean isNegative = num < 0 ? true : false;
        if (isNegative) {
            num = num * -1;
        }

        while (num >= 1) {
            digit = num % 10;
            newDigit = newDigit * 10+digit;
            num = num / 10;

        }
        int reverse=(isNegative == true? newDigit*-1 : newDigit);
        return ( reverse == originalNo);

    }
}