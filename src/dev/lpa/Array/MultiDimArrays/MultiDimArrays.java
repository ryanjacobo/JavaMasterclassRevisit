package dev.lpa.Array.MultiDimArrays;

import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        Object[] anyArray = new Object[3];
        anyArray[0] = new String[]{"hello", "world", "again"};
        anyArray[1] = new String[][]{
                {"1","2"},{"3","4","5"},{"6","7","8","9"}
        };
        anyArray[2] = new int[1][2][3];
        System.out.println(Arrays.deepToString(anyArray));
        for(Object el : anyArray){
            System.out.println("Element type = " + el.getClass().getSimpleName());
            System.out.println("Element toString() = " + el);
            System.out.println(Arrays.deepToString((Object[]) el));
        }
    }
}
