package dev.lpa.Array.Exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int cap = readInteger();
        int[] arr = readElements(cap);
        findMin(arr);
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array capacity.");
        int capacity = scanner.nextInt();
        return capacity;
    }

    public static int[] readElements(int cap){
        int count = 0; // start of the index
        int[] arr = new int[cap]; // capacity will always be count + 1
        Scanner scanner = new Scanner(System.in);
        while(count<cap){
            System.out.print("Enter element " + count + ": ");
            arr[count] = scanner.nextInt();
            count++;
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int el : arr){
            if(el < min){
                min = el;
            }
        }
        System.out.println("Min: " + min);
        return min;
    }
}
