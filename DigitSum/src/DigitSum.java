public class DigitSum {
    public static int sumDigits(int number) {
        int sum = 0;

//        while(num > 0 || sum > 9)
//        {
//            if(num == 0)
//            {
//                num = sum;
//                sum = 0;
//            }
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum;
        if (number < 0) {
            return -1;
        }



        while (number > 0) {
            sum += number % 10;
            number = number / 10;

        }
        return sum;

    }
}

