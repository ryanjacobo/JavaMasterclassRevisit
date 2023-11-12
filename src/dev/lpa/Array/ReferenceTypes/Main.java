package dev.lpa.Array.ReferenceTypes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArr = new int[5];
        int[] refToMyIntArr = myIntArr;

        System.out.println(Arrays.equals(myIntArr, refToMyIntArr) ? true : false);
        refToMyIntArr[0] = 1;
        System.out.println(Arrays.equals(myIntArr, refToMyIntArr) ? true : false); // result is still true

        modifyArray(myIntArr);
        System.out.println(Arrays.equals(myIntArr, refToMyIntArr) ? true : false); // result is still true

        modifyArray(refToMyIntArr);
        System.out.println(Arrays.equals(myIntArr, refToMyIntArr) ? true : false); // result is still true
    }

    public static void modifyArray(int[] arr){
        arr[1] = 11;
    }
}
