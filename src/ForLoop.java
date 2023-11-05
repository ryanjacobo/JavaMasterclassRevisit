public class ForLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter<=5; counter++){
            System.out.println(counter);
        }

        for(double rate = 2; rate <= 5; rate++){
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("10,000 at " + rate + "% interest rate = " + interestAmount );
        }

        for(double rate = 7.5; rate <= 10; rate+=0.25){
            double interestAmount = calculateInterest(100, rate);
            // to end the for-loop before it gets to the end
            if(interestAmount > 8.5){
                break;
            }
            System.out.println("100 at " + rate + "% interest rate = " + interestAmount );
        }

        System.out.println("0 is " + (isPrime(0) ? "" : "not ") + "a prime number."); // 0 is not a prime number
        System.out.println("1 is " + (isPrime(1) ? "" : "not ") + "a prime number."); // 1 is not a prime number
        System.out.println("2 is " + (isPrime(2) ? "" : "not ") + "a prime number."); // 2 is a prime number
        System.out.println("3 is " + (isPrime(3) ? "" : "not ") + "a prime number.");
        System.out.println("5 is " + (isPrime(5) ? "" : "not ") + "a prime number.");
        System.out.println("6 is " + (isPrime(6) ? "" : "not ") + "a prime number.");
        System.out.println("7 is " + (isPrime(7) ? "" : "not ") + "a prime number.");
        System.out.println("9 is " + (isPrime(9) ? "" : "not ") + "a prime number.");

//        primeNumCounter(0);
//        primeNumCounter(1);
//        primeNumCounter(2);
//        primeNumCounter(3);
//        primeNumCounter(4);
        primeNumCounter(10);

        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i + " is divisible by 3 and 5.");
                count++;
                sum+=i;
                if(count == 5){
//                    System.out.println("Found 5 numbers divisible by 3 and 5 - exiting loop. They're sum is " + sum + ".");
                    break;
                }
            }
        }
        System.out.println("Found 5 numbers divisible by 3 and 5 - exiting loop. They're sum is " + sum + ".");

        // will not execute as long as i < 1
        for(int i = 1; i < 0; i+=2){
            System.out.println("number = " + i);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int num){
        // negative numbers, 0, and 1 are not prime numbers
        if(num <= 2){
            return (num == 2); // 2 is a prime number
        }
//        for(int i = 2; i < num; i++){
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeNumCounter(int num){
        if(num>1000){
            System.out.println("Number exceeded max limit.");
        }
        int count = 0;
       for(int i = 0; i < num; i++){
           if(isPrime(i)){
               System.out.println(i + " is a prime number.");
               count++;
               if(count == 3){
                   System.out.println("Found 3 Prime numbers - exiting loop.");
                   break;
               }
           }
       }
//        System.out.println("Total number of prime numbers between 0 and " + num + " is " + count + ".");
//       return count;
    }
}
