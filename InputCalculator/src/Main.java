import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count=0;
        while (scan.hasNextInt()) {
            sum += scan.nextInt();
            count++;
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/count));

        scan.close();
    }
}