package ch06.a02_class_variable_method;

public class Run01_CardGame {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println("c1 Class Static Variable width:  " + c1.width);
        System.out.println("c1 Class Static Variable height: " + c1.height);
        System.out.println("c2 Class Static Variable width:  " + c2.width);
        System.out.println("c2 Class Static Variable height: " + c2.height);

        c1.number = 10;
        c1.kind = "Diamond";

        c2.number = 8;
        c2.kind = "Space";

        Card.width = 50;
        Card.height = 100;

        System.out.println("static variable change");

        System.out.println("c1 Class Static Variable width:  " + c1.width);
        System.out.println("c1 Class Static Variable height: " + c1.height);
        System.out.println("c2 Class Static Variable width:  " + c2.width);
        System.out.println("c2 Class Static Variable height: " +  c2.height);

        System.out.println("C1.number: " + c1.number);
        System.out.println("C1.kind:   " + c1.kind);
        System.out.println("C2.number: " + c2.number);
        System.out.println("C2.kind:   " + c2.kind);
    }
}
