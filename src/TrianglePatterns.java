import org.w3c.dom.ls.LSOutput;

public class TrianglePatterns {
    public static void main(String[] args) {
        System.out.println("---rows---");
        rows(5);

        System.out.println("---columns---");
        columns(5);

        System.out.println("---downwardStairs---");
        downwardStairs(5);

        System.out.println("---decreasingTriangle---");
        decreasingTriangle(5);

        System.out.println("---increasingTriangle---");
        increasingTriangle(5);

        System.out.println("---upwardStairs---");
        upwardStairs(5);


        System.out.println("---hillPattern---");
        hillPattern(3);

        System.out.println("---upsideDownHill---");
        upsideDownHill(5);

        System.out.println("---diamondPattern---");
        diamondPattern(5);

        System.out.println("---rightPointingArrow---");
        rightPointingArrow(5);

        System.out.println("---boxIn---");
        boxIn(4);
    }

    public static void rows(int num){
        // row
        for(int row = 1; row<=num; row++){
            // column
            for(int col = 1; col<=num; col++){
                System.out.print("R" + row + " ");
            }
            System.out.println();
        }
    }

    public static void columns(int num){
        // row
        for(int row = 1; row<=num; row++){
            // column
            for(int col = 1; col<=num; col++){
                System.out.print("C" + col + " ");
            }
            System.out.println();
        }
    }
    public static void downwardStairs(int num){
        // row creates the space, column prints the character
        for(int row = 1; row<=num; row++){
            for(int col = 1; col<=row; col++){
//                System.out.print("* ");
                System.out.print(col + " ");
            }
            // next line
            System.out.println();
        }
    }

    public static void decreasingTriangle(int num){
        for(int row = 1; row<=num; row++){
//            for(int col=row; col<=num; col++){
                // works the same
                for(int col=1; col<=num + 1 - row; col++){
//                System.out.print("* "); // col <= num: print while col <= 5
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void increasingTriangle(int num){
        for(int row = 1; row<=num; row++){
            //
            for(int col = 1; col<=row; col++){
                System.out.print("  ");
            }
            for(int col = row; col<=num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void upwardStairs(int num){
        for(int row = 1; row<=num; row++){
            // column spaces, 1 <= 5, 2 <=5, 3 <= 5...
            for(int col = row; col<=num; col++){
                System.out.print("  ");
            }
            // 1 <= 1, 2 <= 2, 3 <= 3...
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void hillPattern(int num){
//        for(int row = 1; row <= num; row++){
//            for(int col=row;col<=num;col++){
//                System.out.print("  ");
//            }
//            for(int col = 1; col<row; col++){
//                System.out.print("* ");
//            }
//            for(int col = 1; col<=row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int i = 1; i<=num; i++){
            for(int space = 1; space <= num-i; space++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
//                System.out.print("* ");
                System.out.print(j + " ");
            }
            for(int j = 2; j <= i; j++){
//                System.out.print("* ");
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void upsideDownHill(int num){
        for(int row = 1; row <= num; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("  ");
            }
            for(int col = row; col<=num; col++){
                System.out.print("* ");
            }
            for(int col=row; col<num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int num){
//        for(int row = 1; row < num; row++){
//            for(int col=row;col<=num;col++){
//                System.out.print("  ");
//            }
//            for(int col = 1; col<row; col++){
//                System.out.print("* ");
//            }
//            for(int col = 1; col<=row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int row = 1; row <= num; row++){
//            for(int col = 1; col<=row; col++){
//                System.out.print("  ");
//            }
//            for(int col = row; col<=num; col++){
//                System.out.print("* ");
//            }
//            for(int col=row; col<num; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int i = 1; i<=2*num; i++){
            int c = i > num ? 2 * num - i : i;
            for(int space = 0; space < num-c; space++){
                System.out.print("  ");
            }
            for(int j = c; j >= 1; j--){
//                System.out.print("* ");
                System.out.print(j + " ");
            }
            for(int j = 2; j <= c; j++){
//                System.out.print("* ");
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void rightPointingArrow(int num) {
        for(int row = 1; row<=num; row++){
            for(int col = 1; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1; row<=num; row++){
            for(int col=row; col<=num; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        for(int row=0; row<2*num; row++){
//            int totalColsInRow = row > num ? 2 * num - row : row;
//            for(int col = 0; col < totalColsInRow; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    public static void boxIn(int num){
        int originalNum = num;
        num = num * 2;
        for(int row = 1; row < num; row++){
            for(int col = 1; col < num; col++){
                int atEveryIndex = originalNum - Math.min(Math.min(row, col), Math.min(num-row, num-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
