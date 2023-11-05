public class Exercises {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        System.out.println(toMilesPerHour(95.75));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(0.0);
        printConversion(95.75);

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(isLeapYear(4));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(1700));

        System.out.println("****are equal by three decimal places****");
        System.out.println(areEqualByThreeDecPlaces(-3.1756, -3.1756));
        System.out.println(areEqualByThreeDecPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecPlaces(-3.125, 3.125));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(-2050);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(3000);

        printYearsAndDays(525600);
        printYearsAndDays(0);
        printYearsAndDays(1440);

        System.out.println("---canPack---");
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(1,0,6));

        System.out.println("---printSquareStar---");
        printSquareStar(10);

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.26,2.15,.75));
    }

    public static long toMilesPerHourX(double kilometersPerHour){
        long result = 0;
        if(kilometersPerHour < 0){
            result = -1;
        } else {
            result = Math.round(kilometersPerHour / 1.609);
        }
        return result;
    }

    public static void printConversionX(double kilometersPerHour){
        long mph = Math.round(kilometersPerHour / 1.609);
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value.");
        } else {

            System.out.println(kilometersPerHour + "km/h" + " = " + mph + "mi/h");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking){
            if(hourOfDay >= 0 && hourOfDay <= 23){
                return hourOfDay < 8 || hourOfDay > 22 ? true : false;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 400 == 0){
                return true;
            } else if (year % 100 == 0){
                return false;
            }
            else return year % 4 == 0;
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecPlacesX(double first, double second) {
        double x = (int) (first * 1000);
        double y = (int) (second * 1000);
        System.out.println("first: " + x + ", " + "double: " + y);
        return x == y;
    }

    public static boolean areEqualByThreeDecPlaces(double x, double y){
        return (int)(x * 1000) == (int)(y * 1000) ? true : false;
    }

    public static boolean hasTeen(int x, int y, int z) {
        return isTeen(x) || isTeen(y) || isTeen(z);
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19 ? true : false;
    }

    public static void checkNumber(int number){
        if(number>0){
            System.out.println("positive");
        }else if(number<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
//        double kphInMiles = 0.621371;
//        return Math.round(kilometersPerHour*kphInMiles);

        double kphInMiles = 1.609;
        return Math.round(kilometersPerHour/kphInMiles);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h" + " = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        } else {
            int conversion = 1024;
            System.out.println(kiloBytes + " KB = " + kiloBytes/conversion + " MB and " + kiloBytes % 1024 + " KB");
        }
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        long days = (minutes / 60) / 24;
        long years = days / 365;
        long remDays = days % 365;
        System.out.println(minutes + " min" + " = " + years + " y and " + remDays + " d");
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        // bigCount wt cap is 5, smallCount wt cap is 1
        int bigWeight = bigCount*5;
        int smallWeight = goal - bigWeight;
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if(bigWeight >= goal){
            int remainder = goal%5;
            return smallCount >= remainder?true:false;
        }else{
            if(smallCount >= smallWeight){
                return true;
            }
        }
        return false;
    }

    public static int getLargestPrime(int number){
        if(number<2){
            return -1;
        }
        int factor = -1;
        // iterate from 2 to the square root of number
        for(int i = 2; i*i<=number; i++){
            if(number%i!=0){
                continue;
            }
            factor = i;
            while(number%i==0){
                number/=i;
            }
        }
        return number == 1?factor:number;
    }

    public static void printSquareStar(int number){
      String star = "*";
      String space = " ";
      if(number<5){
          System.out.println("Invalid Value");
      } else {
          for(int row = 1; row <= number; row++){
              for(int column = 1; column <= number; column++){
                  boolean isFirstRowOrColumn = row == 1 || column ==1;
                  boolean isLastRowOrColumn = row == number || column == number;
                  boolean isDiagonal = (row == column) || (column == (number - row + 1));
                  if(isFirstRowOrColumn || isLastRowOrColumn || isDiagonal){
                      System.out.print(star);
                  } else {
                      System.out.print(space);
                  }
              }
              System.out.println();
          }
      }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        double remainingArea = area - (areaPerBucket * extraBuckets);
//        int bucketsToBuy = (int) Math.ceil(totalBucketsNeeded - extraBuckets);
        return getBucketCount(remainingArea, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        double totalArea = width * height;
//        int totalBucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);
        return getBucketCount(totalArea, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        double numberOfBuckets = area/areaPerBucket;
        return (int)Math.ceil(numberOfBuckets);
    }
}
