package dev.lpa.AutoBoxing;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoBoxingLesson {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        double unboxed = getDoubleObject();
        Double boxed = getLiteralDoublePrimitive();
        System.out.println(unboxed + ", " + boxed);

        Integer[] wrapperArr = new Integer[5];
        wrapperArr[0] = 50;
        System.out.println(Arrays.toString(wrapperArr));
        System.out.println(wrapperArr[0].getClass().getName());
        Character[] charArr = {'a','b','c','d'};
        System.out.println(Arrays.toString(charArr));

        var ourList = getList(1,2,3,4,5); // works with List.of(1,2,3,4,5);
        System.out.println(ourList);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    // works with Integer param too
    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;
    }
}
