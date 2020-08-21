package ch02.a04_scanner;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int nNum = 0;

        System.out.print("double digit integer: ");
        input = scanner.nextLine();

        nNum = Integer.parseInt(input);

        System.out.println("input data: " + input);
        System.out.printf("num: %d%n", nNum);
    }
}
