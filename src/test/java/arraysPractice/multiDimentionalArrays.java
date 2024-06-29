package arraysPractice;

import java.util.Arrays;

public class multiDimentionalArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        //            0 1

        int[] arr2 = {3, 4, 5, 6, 7};
        //            0  1  2  3   4

        int[] arr3 = {8, 9, 10, 11, 12, 13};
        //            0 1  2  3  4  5

        int[][] arrays = {arr1, arr2, arr3};
        //                     0     1     2

        System.out.println(arrays[1][3]);

        System.out.println(arrays[2][0]);

        System.out.println(Arrays.toString(arrays[1])); //1D array

        System.out.println("1: " + Arrays.toString(arrays));

        System.out.println("2: " + Arrays.deepToString(arrays));

        System.out.println("==========");

        String[][] group = {
                {"Lily","Lana","Igor"} ,   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } ,  //1

                {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"},//2

        };

        for (int i = 0; i < group.length; i++) {
            System.out.println(Arrays.toString(group[i]));

            for (int j = 0; j < group[i].length; j++) {
                System.out.println(group[i][j]);
            }
        }

        System.out.println("=====");

        for (int i = group.length-1; i >= 0; i--) {

            for (int j = group[i].length-1; j >= 0 ; j--) {
                System.out.println(group[i][j]);
            }

        }
    }
}
