public class Main {
    public static void main(String[] args) {


        int myMinIntValue =Integer.MIN_VALUE;
        int myMaxIntValue =Integer.MAX_VALUE;
        System.out.println("Integer Min Value " + myMinIntValue);
        System.out.println("Integer Max Value " + myMaxIntValue);
        int bustedMin =myMinIntValue+1;
        int bustedMax =myMaxIntValue+1;
        System.out.println("Busted MIN And MAX Values are: "+bustedMin +"  "+bustedMax);
        int myMaxIntTest= 2147483647;

        byte myByteMinValue=Byte.MIN_VALUE;
        byte myByteMaxValue=Byte.MAX_VALUE;
        System.out.println("Byte MIN Values: "+ myByteMinValue);
        System.out.println("Byte Max Values: "+ myByteMaxValue);

        short myShortMinValue=Short.MIN_VALUE;
        short myShortMaxValue=Short.MAX_VALUE;
        System.out.println("Short MIN Values: "+ myShortMinValue);
        System.out.println("Short Max Values: "+ myShortMaxValue);


        long myLongValue =10000000000000000L;
        long myLongMinValue=Long.MIN_VALUE;
        long MyLongMaxValue=Long.MAX_VALUE;
        System.out.println("Long MIN Values: "+ myLongMinValue);
        System.out.println("Long Max Values: "+ MyLongMaxValue);

        int myTotal=myMaxIntTest/2;
        byte myByteTotal=(byte) (myByteMaxValue/2);

        byte myByteNumber =122;
        short myShortNumber=1022;
        int myIntNumber=1972;

        long myEquation=50000L+10L *(myByteNumber)+(myShortNumber)+myIntNumber;
        long myEquation1=(short)(50000+10 *(myByteNumber)+(myShortNumber)+myIntNumber);
        System.out.println(myEquation);
        System.out.println(myEquation1);
    }
}