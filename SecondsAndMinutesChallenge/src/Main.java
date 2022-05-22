public class Main {
    public static void main(String[] args) {
        String x = SecondsAndMinutesChallenge.getDurationString(11111, 555);
        System.out.println(x);
        x = SecondsAndMinutesChallenge.getDurationString(1123, 28);
        System.out.println(x);
        x = SecondsAndMinutesChallenge.getDurationString(1, 22);
        System.out.println(x);
        x = SecondsAndMinutesChallenge.getDurationString(122, 9);
        System.out.println(x);
        x = SecondsAndMinutesChallenge.getDurationString(487L);
        System.out.println(x);
        x = SecondsAndMinutesChallenge.getDurationString(4L);
        System.out.println(x);
        x = SecondsAndMinutesChallenge.getDurationString(-182);
        System.out.println(x);
    }
}