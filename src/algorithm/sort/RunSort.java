package algorithm.sort;

public class RunSort {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int[] arr = {5, 3, 7, 2, 9, 1, 1};
        System.out.println("------ Before ------");
        Sort.PrintArr(arr);
        Sort.BubbleSort(arr);

        System.out.println("------- After -------");
        Sort.PrintArr(arr);

        long end = System.currentTimeMillis();

        System.out.println( "Run Time : " + ( end - start )/1000.0 );

    }
}
