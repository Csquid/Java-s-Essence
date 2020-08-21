package ch06.a02_class_variable_method;

public class Run04_ReferenceParamEx02 {
    public static void main(String[] args) {
        int[] x = { 10 };

        System.out.println("main() - x[0]: " + x[0]);
        Data.Change(x);

        System.out.println();
        System.out.println("After Change(x)");
        System.out.println("main() - x[0]: " + x[0]);
    }
}
