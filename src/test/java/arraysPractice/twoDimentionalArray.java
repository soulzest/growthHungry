package arraysPractice;

public class twoDimentionalArray {
    public static void main(String[] args) {

            /* int[] a = {1,2,3,4};
        int[] b = {5,6};
        int[] c = {7,8,9};
        int[] d = {10,11,12};
        int[] e = {13,14,15,16,17};

        */

        //                 0 1 2 3    0 1    0 1 2    0  1   2    0   1  2  3  4
        int[][] arr2D = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};
        //                  0          1       2         3            4

        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for (int i = 0; i <= arr2D.length - 1; i++) {

            int[] arr1D = arr2D[i];
            for (int j = 0; j <= arr1D.length - 1; j++) {
                int eachElement = arr1D[j];

                if (eachElement > max) {
                    max = eachElement;
                }
                if (eachElement < min) {
                    min = eachElement;
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
