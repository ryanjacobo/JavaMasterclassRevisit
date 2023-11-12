package dev.lpa.Array.Challenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArrDesc {
    public static void main(String[] args) {
        int[] randomArr = getRandomArray(5);
        System.out.println(Arrays.toString(randomArr));
        int[] sortedDesc = descending(randomArr);
        System.out.println(Arrays.toString(sortedDesc));

        System.out.println("----Enter array elements then sort the array----");
        int[] arr = getIntegers(5);
        System.out.println(Arrays.toString(arr));
        printArray(arr);
        System.out.println(Arrays.toString(descending(arr)));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(10);
        }
        return newInt;
    }
    public static int[] descending(int[] arr){
        Arrays.sort(arr); // array needs to be sorted ascending first before descending
        int[] result = arr;

        for(int i = 0; i < arr.length - 1; i++){
            // once the array is sorted, all you need to do is turn the array around
            for(int j = 0; j < arr.length - 1 - i; j++){
                // first j iteration moves first element to last(arr[4]), second j iteration moves first element to second to the last(arr[3]), etc.
                int temp = arr[j]; // temp saves the first element
                arr[j] = arr[j+1]; // first element becomes the second element
                arr[j+1] = temp; // second element becomes first element
            }
        }
        return result;
    }

    public static int[] getIntegers(int capacity){
        int[] arr = new int[capacity];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while(count < capacity){
            System.out.print("Enter element " + count + ": ");
            arr[count] = scanner.nextInt();
            count++;
        }
        System.out.println("Elements entered are " + count);
        return arr;
    }

    public static void printArray(int[] arr){
        int count = 0; // not necessary
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + count + " contents " + arr[i]);
            count++;
        }
    }
}
