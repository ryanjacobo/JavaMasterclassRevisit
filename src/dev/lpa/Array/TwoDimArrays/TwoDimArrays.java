package dev.lpa.Array.TwoDimArrays;

import java.util.Arrays;

public class TwoDimArrays {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        System.out.println(Arrays.toString(arr)); // only prints the outer but not the inner

        for(int[] inner : arr){
            System.out.println(Arrays.toString(inner));
        }

        // old for-loop method
        for(int i = 0; i < arr.length; i++){
            var innerArr = arr[i]; // var is a sub for int[]
            for(int j = 0; j < innerArr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced
        for(var outer : arr){
            for(var inner : outer){
                System.out.print(inner + " ");
            }
            System.out.println();
        }

        // using Arrays.deepToString();
        System.out.println(Arrays.deepToString(arr));

        for(int i = 0; i < arr.length; i++){
            var innerArr = arr[i]; // var is a sub for int[]
            for(int j = 0; j < innerArr.length; j++){
                arr[i][j] = (i*10) + (j+1); // each i is multiplied by 10 and each j is incremented by 1
            }
//            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

        arr[1] = new int[] {22, 23, 24}; // replaces the index 1 array
        System.out.println(Arrays.deepToString(arr));
    }
}
