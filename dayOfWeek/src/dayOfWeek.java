public class dayOfWeek {
    public static void printDayOfWeek(int day){

        switch (day){

            case 0:
                System.out.println("It's a Sunday");
                break;
            case 1:
                System.out.println("It's a Monday");
                break;
            case 2:
                System.out.println("It's a Tuesday");
                break;
            case 3:
                System.out.println("It's a Wednesday");
                break;
            case 4:
                System.out.println("It's a Thursday");
                break;
            case 5:
                System.out.println("It's a Friday");
                break;
            case 6:
                System.out.println("It's a Saturday");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
