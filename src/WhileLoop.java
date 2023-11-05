public class WhileLoop {
    public static void main(String[] args) {
        int j = 1;
        while(j<5){
            System.out.println(j);
            j++;
        }

//        j = 11;
        boolean isReady = false;
        do{
            if(j>10){
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j>0);
        }while(isReady); // while isReady is j>0

        int number = 0;
        while(number<50){
            number += 5;
            // skips 25_
            if(number%25==0){
                continue;
            }
            System.out.println(number+"_");
        }

        // challenge - print the number if it's even
        int num = 4;
        int total = 0;
        int evenCount = 0;
        int oddCount = 0;
        while(num <= 20){
            if(isEvenNumber(num)){
                evenCount++;
                System.out.println(num);
                if(evenCount == 5){
                    break;
                }
            } else {
                oddCount++;
            }
            num++;
            total+=num;
        }
        System.out.println("Even number: " + evenCount);
        System.out.println("Odd number: " + oddCount);

        System.out.println("---sumDigits---");
        int numX = 1234;
        System.out.println(sumDigits(numX));

        System.out.println("---isPalindrome---");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(7%10);
        System.out.println(1%10);

        System.out.println("---sumFirstAndLastDigit---");
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println("---getEvenDigitSum---");
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(2000));
//        System.out.println(getEvenDigitSum(-22));

        System.out.println("---hasSharedDigit---");
        System.out.println(hasSharedDigit(12,13));

        System.out.println("---getGreatestCommonDivisor---");
        System.out.println(getGreatestDivisor(25));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(1010, 10));
        System.out.println(getGreatestCommonDivisor(12,12 ));

        System.out.println("---isPerfectNumber---");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(10));
        System.out.println(isPerfectNumber(1147));
        System.out.println(isPerfectNumber(31));

        System.out.println("---numberToWords---");
        numberToWords(123);
        numberToWords(100);

        System.out.println("---reverse---");
        System.out.println(reverse(321));

        System.out.println("---getDigitCount---");
        System.out.println(getDigitCount(100));
        System.out.println(getDigitCount(0));
    }

    // challenge
    public static boolean isEvenNumber(int num){
        return num % 2 == 0 ? true : false;
    }

    public static int sumDigits(int num){
        int sum = 0;
        if(num<0){
            return -1;
        }
        // loop while num>=10
        while(num > 9){
            sum += (num % 10); // sum up the remainders of num % 10
            num /= 10; // divide the number by 10
        }
        sum += num; // if num is a single digit, it gets added to 0 (initial sum value)
        return sum;
    }

    static public boolean isPalindrome(int num){
        int remainder = 0;
        int reversedNum = 0;
        int origNum = num;
        while (num != 0) {
            remainder = num % 10; // get the last digit
            reversedNum = reversedNum * 10 + remainder; // get the reversed number
            num /= 10; // drop the last digit
        }
        // compare the reversed num with give num
        if(origNum == reversedNum){
            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number){
        int firstNum = number;
        int lastNum = number % 10;
        if(number < 0){
            return -1;
        }
        while(number > 9){
            number/=10;
        }
        firstNum = number;
        return firstNum + lastNum;
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int totalEvenNum = 0;
        int lastNumber = number;
        while(number>0){
            number/=10;
            lastNumber = number%10;
            if(lastNumber%2==0){
                totalEvenNum+=lastNumber;
            }
        }
        return totalEvenNum;
    }

    public static boolean hasSharedDigit(int x, int y){
        if(x<10 || x>99 || y<10 || y>99){
            return false;
        }
            int lastX=x%10;
            int lastY=y%10;
            x/=10;
            y/=10;
            int firstX=x;
            int firstY=y;
        return lastX == lastY || lastX == firstY || lastY == firstX || firstX == firstY;
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(x<10 || x>1000 || y<10 || y>1000 || z<10 || z>1000){
            return false;
        }
        int lastX=x%10;
        int lastY=y%10;
        int lastZ=z%10;
        return lastX == lastY || lastX == lastZ || lastY==lastZ;
    }

    public static boolean isValid(int x){
        if(x>=10&&x<=1000){
            return true;
        }
        return false;
    }

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }else{
            for(int i=1; i<=number; i++){
                if(number%i==0){
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static int getGreatestDivisor(int x){
        if(x<10){
            return -1;
        }
        int gD=0;
        for(int i = 1; i<x; i++){
            if(x%i==0){
                gD=i;
                if(i>gD){
                    gD=i;
                }
            }
        }
        return gD;
    }
    public static int getGreatestCommonDivisor(int x, int y){
        if(x<10||y<10){
            return -1;
        }
      boolean xSmaller = x<y;
      int gCD = 0;
        if(xSmaller){
            for(int i = 1; i <= x; i++){
                if(x%i==0 && y%i==0){
                    gCD = i;
                    if(i>gCD){
                        gCD=i;
                    }
                }
            }
        }else{
            for(int i = 1; i <= y; i++){
                if(x%i==0 && y%i==0){
                    gCD = i;
                    if(i>gCD){
                        gCD=i;
                    }
                }
            }
        }
        return gCD;
    }

    public static boolean isPerfectNumber(int num){
        if(num<1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum == num ? true : false;
    }

    public static int reverse(int num){
        int remainder = 0;
        int reverse = 0;
        while (num != 0) {
            remainder = num % 10; // get the last digit
            reverse = reverse * 10 + remainder; // get the reversed number
            num /= 10; // drop the last digit
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count = 0;
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
       for(int i = 1; i<=number; i*=10){
           count++;
       }
        return count;
    }
    public static void numberToWords(int num){
        int reversed = reverse(num);
        int leadingZeroes=getDigitCount(num)-getDigitCount(reversed);
        if(num==0){
            System.out.println("Zero ");
            return;
        }
        if(num<0){
            System.out.println("Invalid Value");
        } else {
            while(reversed>0){
                int lastDigit = reversed % 10;

                switch(lastDigit){
                    case 0 -> System.out.print("Zero ");
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                }
                reversed/=10;
            }
            for(int i=0; i<leadingZeroes; i++){
                System.out.print("Zero ");
            }
        }
        System.out.println("");
    }
}
