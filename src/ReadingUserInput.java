import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        // Parse a String data to int
        int currentYear = 2023;
        String userDateOfBirth = "1979";
        int stringToInt = Integer.parseInt(userDateOfBirth);
        System.out.println("User age in years = " + (currentYear - stringToInt));

        // Parse a String data to double
        String ageWithPartialYear = "22.5";
        double stringToDouble = Double.parseDouble(ageWithPartialYear);
        System.out.println("User age in with partial years = " + stringToDouble);


        // Exception handling (running a System.console().readLine method)
//        System.out.println(getInputFromConsole(currentYear));
//        try {
//            System.out.println(getInputFromConsole(currentYear));
//        } catch (NullPointerException e){
//            System.out.println(getInputFromScanner(currentYear));
//        }

//        sumOfFiveNumbers()
//        minAndMaxNumbers();
        inputThenPrintSumAndAverage();
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        String yearOfBirth = System.console().readLine("What year where you born? ");
        int age = currentYear - Integer.parseInt(yearOfBirth);
        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! Thanks for taking the course!");
        boolean validDOB = true;
        int age = 0;
        do{
            System.out.println("What year where you born? Enter a year between " + (currentYear - 125) + " and " + currentYear + ".");
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age > 0 ? true : false;
            }catch(NumberFormatException badUserData){
                System.out.println("Characters not allowed! Try again.");
            }
        }while(!validDOB);
//        String yearOfBirth = scanner.nextLine();
        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125; // 2023 - 125(max human age) = 1898

        if(dob < minimumYear || dob > currentYear){
            return -1;
        }
        return (currentYear - dob);
    }

    public static void sumOfFiveNumbers(){
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;

        do{
            System.out.println("Enter number #" + counter + ": ");
            String givenNumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(givenNumber);
                counter++;
                sum+=number;
            } catch(NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        }while(counter <= 5);
        System.out.println("The sum of the 5 numbers is " + sum + ".");
//       scanner.close();
    }

    public static void minAndMaxNumbers(){
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int count = 0;
        while(true){
            System.out.println("Enter a number: ");
            String userInput = scanner.nextLine();
            try{
                int number = Integer.parseInt(userInput);
                if(count == 0 || number > max){
                    max = number;
                }
                if(count == 0 || number < min) {
                    min = number;
                }
                count++;
            } catch (NumberFormatException e){
                System.out.println("End of program.");
                break;
            }
        }
        if(count > 0){
            System.out.println("Min number is: " + min);
            System.out.println("Max number is: " + max);
        } else {
            System.out.println("No valid data entered.");
        }
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt) {
                break;
            }
            String userInput = scanner.nextLine();
            int number = Integer.parseInt(userInput);
            sum+=number;
            count++;
            scanner.nextLine();
        }
        if(count>0){
            avg=Math.round((double)sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }


}
