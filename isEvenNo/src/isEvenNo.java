public class isEvenNo {
    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }

    public static void printEvenNo(int num, int finalNo) {
        int totalNoOfCount = 0;
        while (num <= finalNo) {
            if (isEvenNumber(num)) {
                System.out.println("Even number are:" + num);
                totalNoOfCount++;
            }
            if (totalNoOfCount < 5)
                num++;
            else {
                System.out.println(totalNoOfCount);
                break;
            }
        }
    }
}
