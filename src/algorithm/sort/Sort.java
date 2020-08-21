package algorithm.sort;

public class Sort {
    public static int[] MakeRandomDatas(int maxLength) {


        return null;
    }
    public static void BubbleSort(int[] arr)
    {

        /*
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {

                if (arr.length - i == j + 1) {
                    break;
                }

                if (arr[j] > arr[j + 1]) {
                    int temp = 0;

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        */
        for(int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] arr)
    {
        System.out.println();
        System.out.println("----- Processing -----");

        for(int i = 0; i < arr.length - 1; i++) {
            int min   = arr[i];
            int temp  = 0;
            int index = 0;

            for(int j = i; j < arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            if(index != 0) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }

            Sort.PrintArr(arr);
        }

        System.out.println("-------- End --------");
        System.out.println();
    }

    public static void PrintArr(int[] arr)
    {
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++) {

            if(i + 1 == arr.length) {
                System.out.println(arr[i] + " ]");
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
    }
}
