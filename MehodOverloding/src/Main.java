public class Main {
    public static void main(String[] args) {
        double x = calcFeetAndInchesToCentimeter(13);
        System.out.println(x);
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("invalid feet or inches");
            return -1;
        } else {
            double cm = (feet * 12) * 2.54;
            cm += inches * 2.54;
            System.out.println(feet + " Feet " + inches + " Inches= " + cm + " Centimeters");
            return cm;
        }
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches= " + feet + " Feet " + remainingInches + " Inches. ");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }
}