package dev.lpa.Array.Challenge.InstrSolution;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = readIntegers();
        System.out.println("Minimum number: " + findMin(arr));
    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();
        String[] integers = input.split(","); // excludes the "," from the required values
        int[] arr = new int[integers.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(integers[i].trim());
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

//    public static int findMin(int[] arr){
//        Arrays.sort(arr);
//        return arr[0];
//    }

    // using Integer.MAX_VALUE
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int el : arr){
            if(el < min){
                min = el;
            }
        }
        return min;
    }
}
