package ch02.a03_constant_literal;

public class ConstEx02 {
    public static void main(String[] args) {
        /*
            int triangleArea = (20 * 10) / 2;
            int rectangleArea = 20 * 10;

            공식을 모르는 사람 이라면 저 리터럴 숫자의 의미를 알 수 없다.
            그렇기 때문에 의미 있는 상수를 만들어 그 의미를 부여 해준다.
        */

        final int WIDTH  = 20;
        final int HEIGHT = 10;

        int triangleArea  = (WIDTH * HEIGHT) / 2;
        int rectangleArea = WIDTH * HEIGHT;
    }
}
