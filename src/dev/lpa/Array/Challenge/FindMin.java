package dev.lpa.Array.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] intArr = readIntegers(5);
        System.out.println("Minimum el: " + findMin(intArr));
    }

    public static int[] readIntegers(int num){
        System.out.println("Enter " + num + " integers.");
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[num];
        int count = 0;
        while(count < num){
            intArr[count] = scanner.nextInt();
            count++;
        }
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }

    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
