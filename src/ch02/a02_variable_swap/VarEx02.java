/*
*
*   swap
*
*/

package ch02.a02_variable_swap;

public class VarEx02 {
    public static void main(String[] args) {

        int temp = 0;
        int x    = 10;
        int y    = 20;

        String line = "-----";

        System.out.println(line + " Before " + line);
        System.out.println("x: " + x + "%ny: " + y);

        temp = x;
        x    = y;
        y    = temp;

        System.out.println(line + " After " + line);
        System.out.println("x: " + x + "%ny: " + y);

    }
}
