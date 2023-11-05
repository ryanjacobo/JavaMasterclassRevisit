public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        System.out.println("New calculated score is " + calculateSCore(30));

        System.out.println("No score parameter is " + calculateSCore());

        System.out.println(convertToCentimeters(6));

        System.out.println(convertToCentimeters(6, 0) + " cm");

        System.out.println(getDurationString(3945)); // 3945
        System.out.println(getDurationString(65, 45)); // 65min, 45secs
        System.out.println(getDurationString(-3945)); // 3945
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(0, 45));
        System.out.println(getDurationString(50, 0));

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.46,1.2));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return calculateSCore(score);
    }

    public static int calculateSCore(int score){
        return score * 1000;
    }

    public static int calculateSCore(){
        return calculateScore("Peter", 24);
    }

    // challenge - convert inches to cm
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int heightInInches = feetToInches + inches;
        return convertToCentimeters(heightInInches);
    }

    // challenge - seconds to HH:MM:SS
    public static String getDurationString(int seconds){
        if(seconds <= 0){
            return "Invalid seconds.";
        }
//        int minutes = seconds / 60;
//        int hour = minutes / 60;
//        int remMin = minutes % 60;
//        int remSec = seconds % 60;
//        return hour + "h " + remMin + "m " + remSec + "s";

//        int minutes = seconds / 60;
//        return getDurationString(minutes, seconds); // doesn't validate seconds

        // display Xh Ym Zs
        return getDurationString(seconds / 60, seconds % 60);
    }

    // returning int values with String concatenation returns a String
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
                return "Invalid minutes.";
        }
        if(seconds < 0 || seconds > 59) {
            return "Invalid seconds.";
        }
        int hour = minutes / 60;
        int remMin = minutes % 60;
        int remSec = seconds % 60;
        return hour + "h " + remMin + "m " + remSec + "s";
    }

    // AreaCalculator
    public static double area(double radius){
        if(radius < 0) {
            return -1;
        }
        double pi = 3.14159;
        double result = (radius * radius) * pi;
        return result;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) {
            return -1;
        }
        double result = x * y;
        return result;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        double remainingArea = area - (areaPerBucket * extraBuckets); // areaPerBucket * extraBuckets = area painted with available buckets
        // area/areaPerBucket = number of buckets needed
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
