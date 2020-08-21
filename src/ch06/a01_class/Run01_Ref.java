package ch06.a01_class;

public class Run01_Ref {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();

        System.out.println("power: " + t.power);

        System.out.println("power on");
        t.power();

        System.out.println("power: " + t.power);
        System.out.println("current Tv Channel: " + t.channel);

        System.out.println("Turn on channel 7");
        t.channel = 7;

        System.out.println("current Tv Channel: " + t.channel);

        System.out.println("Channel Down");
        t.channelDown();

        System.out.println("current Tv Channel: " + t.channel);
    }
}
