public class Main {
    public static void main(String[] args) {
        double x = AreaCalculator.area(5.0);
        System.out.println(x);
        x = AreaCalculator.area(-1.0);
        System.out.println(x);
        x = AreaCalculator.area(5.0, 4.0);
        System.out.println(x);
        x = AreaCalculator.area(-1.2, 5.0);
        System.out.println(x);
    }
}