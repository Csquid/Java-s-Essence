package ch06.a02_class_variable_method;

public class Run02_PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();

        d.x = 10;
        System.out.println();
        System.out.println("main() - x: " + d.x);

        Data.Change(d.x);

        System.out.println();
        System.out.println("After PrimitiveChange(d.x)");
        System.out.println("main() - x: " + d.x);

    }
}
