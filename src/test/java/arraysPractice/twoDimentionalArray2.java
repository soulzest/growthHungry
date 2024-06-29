package arraysPractice;

public class twoDimentionalArray2 {
    public static void main(String[] args) {

        //                 0 1 2 3    0 1    0 1 2    0  1   2    0   1  2  3  4
        int[][] arr2D = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};
        //                  0          1       2         3            4

        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for (int[] eachArray : arr2D) {
            for (int eachElement : eachArray) {

                if (eachElement > max) {
                    max = eachElement;
                }
                if (eachElement < min) {
                    min = eachElement;
                }
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }


    }
}
