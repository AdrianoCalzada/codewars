package kyu5;

public class HumanReadableTime {

    public static void main(String[] args) {

        int a = 359999;

        System.out.println(makeReadable(a));

    }

    public static String makeReadable(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;

        return String.format("%02d:%02d:%02d", hours, minutes % 60, seconds % 60);

    }
}
