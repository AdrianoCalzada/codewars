package kyu5;

public class IPV4to32bit {

    public static void main(String[] args) {

        long n = 2149583361L;

        System.out.println(longToIP(n));

    }

    public static String longToIP(long ip) {

        long a = (long) (ip / Math.pow(256, 3));
        long b = (long) (ip % Math.pow(256, 3) / Math.pow(256, 2));
        long c = (long) (ip % Math.pow(256, 2) / 256);
        long d = ip % 256;

        return String.format(a + "." + b + "." + c + "." + d);
    }
}
