package ch06.a02_class_variable_method;

public class Data {
    public int x;

    public static void Change(int x) {
        x = 1000;

        System.out.println("Primitive Change() - x: " + x);
    }

    public static void Change(Data da) {
        da.x = 1000;

        System.out.println("Reference Change() - x: " + da.x);
    }

    public static void Change(int[] x) {
        x[0] = 1000;
        System.out.println("Array Change() - x[0]: " + x[0]);
    }
}
