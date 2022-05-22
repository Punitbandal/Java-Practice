import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int a = 0;
        while (true) {
            int order=num+1;
            System.out.println("Enter Number #"+order+":");

            boolean isInt = scanner.hasNextInt();
            if (isInt) {

                a += scanner.nextInt();
                num++;
                if (num == 10)
                    break;
            } else{
                System.out.println("Invalid Value");
            }
scanner.nextLine();
        }
        System.out.println("Sum Of All Total Numbers is:"+ a);
scanner.close();

    }
}