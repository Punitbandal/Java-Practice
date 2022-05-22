public class Main {
    public static void main(String[] args) {
        double myop1 = 10.00d;
        double myop2 = 20.00d;

        double myTotal = 100.00d * (myop1 + myop2);

        double reminder = myTotal % 40.00d;
        boolean x = reminder == 0 ? true : false;

        System.out.println(x);

        if (!x) {
            System.out.println("Got some reminder");
        }


    }
}