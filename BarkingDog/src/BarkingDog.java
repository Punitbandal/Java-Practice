public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
/*We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

In all other cases return false.

If the hourOfDay parameter is less than 0 or greater than 23 return false.*/


        if (!isBarking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23))
            return false;
        else
            return true;
    }
}
