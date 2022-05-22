public class SecondsAndMinutesChallenge {
    public static final String INVALID_MSG="Invalid Value";
    public static String getDurationString(long min,long sec){
        if (min<0||(sec<0||sec>59))
            return INVALID_MSG;
        else {
            long hr=min/60;
            long newMin=min%60;
            String Hr=addZero(hr," HH ");
            String Min=addZero(newMin," MM ");
            String Sec=addZero(sec," SS ");
            return Hr+Min+Sec;
        }
    }
    public static String addZero(long value,String H){
        String newValue=value+H;
        if(value<10){
            newValue="0" + newValue;
        }
        return newValue;
    }
    public static String  getDurationString(long sec){
        if (sec<0){
            return INVALID_MSG;
        }
        else {
            long min=sec/60;
            long newSec=sec%60;

            return getDurationString(min,newSec);

        }
    }

}
