package dev.lpa.Array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[5] = 50;

        double[] doubleArr = new double[10];
        doubleArr[2] = 3.5;

        // initializing an array
        int[] newArr;
        newArr = new int[] {5,4,3,2,1};
        // iterating an array should always be i < array.length as the last element of an array is array[length-1]
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

        int[] newArrX = new int[5];
        int num = 1;
        for(int i = 0; i <= newArrX.length - 1; i++){
            newArrX[i] = num;
            num++;
        }
        System.out.println();
        for(int i = 0; i <= newArr.length - 1; i++){
            System.out.print(newArrX[i] + " ");
        }
        System.out.println();
        // enhanced for loop
        for(int el : newArrX){
            System.out.print(el + " ");
        }
        System.out.println();

        // Arrays.toString();
        System.out.println(Arrays.toString(newArrX));

        // instanceof
        Object objVar = newArrX;
        if(objVar instanceof int[]){
            System.out.println("objVar is really an int array");
        }

        if(newArrX instanceof int[]){
            System.out.println("newArrX is an int array");
        }

        Object[] objArr = new Object[3];
        objArr[0] = "Hello";
        objArr[1] = new StringBuilder("World");
        objArr[2] = Arrays.toString(newArrX);
        System.out.println(Arrays.toString(objArr));

        // getRandomArray();
        int[] ranArr = getRandomArray(10);
        // Arrays.sort();
        Arrays.sort(ranArr);
        System.out.println(Arrays.toString(ranArr));

        int[] secArr = new int[10];
        Arrays.fill(secArr, 3);
        System.out.println(Arrays.toString(secArr));

        // Arrays.copyOf
        int [] thirdArr = Arrays.copyOf(ranArr, secArr.length); // second param is the length that you want to be copied
        System.out.println(Arrays.toString(thirdArr));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        String name = "Ryan";
        if(Arrays.binarySearch(sArray, name) >= 0){
            System.out.println("Found " + name + " in the list");
        } else {
            System.out.println(name + " was not found in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        // Arrays.equals();
        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        int[] ranArrX = getRandomArray(5);
        System.out.println(Arrays.toString(ranArrX));
        System.out.println("Sort array ascendingly: " + Arrays.toString(ascSort(ranArrX)));

        int[] arrX = {-3,1, 0,-1,-2};
        System.out.println(Arrays.toString(arrX));
        ascSort(arrX);
        System.out.println(Arrays.toString(arrX));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    // sort array ascendingly without using Arrays.sort()
    public static int[] ascSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i]; // initial key is arr[1]
            int j = i - 1; // initial a[j] is a[0]
            // (j>=0) = iterate through all the indeces(j) while element > key
             while(j >= 0 && arr[j] > key){
                 arr[j+1] = arr[j]; //
                 j = j - 1;
             }
             arr[j + 1] = key;
        }
        return arr;
    }

}
