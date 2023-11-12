package dev.lpa.Array.Challenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);

        int[] arrHL = {6,7,8,9,10};
        reverseHL(arrHL);

        System.out.println(Arrays.toString(reverseCopy(arrHL)));
    }

    // arr[i] traverses every arr[i+1]
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // reversing using halfLength
    public static void reverseHL(int[] arr){
        int halfLength = arr.length/2;
        for(int i = 0; i<halfLength;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseCopy(int[] arr){
        int[] reversedArr = new int[arr.length];
        int maxIndex = arr.length-1;
        System.out.println(arr[maxIndex]);
        for(int el : arr){
            reversedArr[maxIndex] = el; // fills up the new array with the elements of the arr starting from the last index
            maxIndex--;
        }
        return reversedArr;
    }
}
