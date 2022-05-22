
public class AreaCalculator {
    public static final double PI=3.141592653589793238;
    public static double area(double radius) {
        if (radius < 0)
            return -1;
        else {
            return  PI *radius*radius;
        }
    }
    public static double area(double x,double y) {
        if(x<0||y<0)
            return -1;
        else
            return x*y;
    }
}
