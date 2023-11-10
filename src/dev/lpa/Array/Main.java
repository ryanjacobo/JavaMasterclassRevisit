package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[5] = 50;

        double[] doubleArr = new double[10];
        doubleArr[2] = 3.5;

        int[] newArr;
        newArr = new int[] {5,4,3,2,1};
        for(int i = 0; i <= newArr.length - 1; i++){
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
        System.out.println(Arrays.toString(newArrX));

        Object objVar = newArrX;
        if(objVar instanceof int[]){
            System.out.println("objVar is really an int array");
        }

        Object[] objArr = new Object[3];
        objArr[0] = "Hello";
        objArr[1] = new StringBuilder("World");
        objArr[2] = newArrX;
        System.out.println(Arrays.toString(objArr));
    }
}
