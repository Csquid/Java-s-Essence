package ch02.a01_variable;

public class VarEx01 {
    public static void main(String[] args) {

        int year = 0;
        int age  = 14;

        System.out.println(year);       // 0
        System.out.println(age);        // 14

        year = age + 2000;
        age  = age + 1;

        System.out.println();

        System.out.println(year);       // 2014
        System.out.println(age);        // 15

    }
}
