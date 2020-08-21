package ch06.a02_class_variable_method;

public class Run03_ReferenceParamEx01 {
    public static void main(String[] args) {
        Data d = new Data();

        d.x = 10;

        System.out.println("main() - x: " + d.x);
        Data.Change(d);

        System.out.println();
        System.out.println("After ReferenceChange(d)");
        System.out.println("main() - x: " + d.x);
    }
}
