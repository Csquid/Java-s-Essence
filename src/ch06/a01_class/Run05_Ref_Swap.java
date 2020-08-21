package ch06.a01_class;

public class Run05_Ref_Swap {
    public static void main(String[] args) {
        Tv t01 = new Tv();
        Tv t02 = new Tv();
        Tv temp = null;

        System.out.println("t01.channel: " + t01.channel);
        System.out.println("t02.channel: " + t02.channel);

        t01.channel = 7;
        System.out.println("T01 Turn on channel 7");

        System.out.println("t01.channel: " + t01.channel);
        System.out.println("t02.channel: " + t02.channel);

        System.out.println("run swap");

        temp = t02;
        t02 = t01;
        t01 = temp;

        System.out.println("t01.channel: " + t01.channel);
        System.out.println("t02.channel: " + t02.channel);
    }
}
