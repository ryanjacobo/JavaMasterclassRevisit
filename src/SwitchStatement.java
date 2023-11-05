public class SwitchStatement {

    public static void main(String[] args) {
        int val = 11;
        switch(val){
            case 1:
                System.out.println("Value was 1.");
                break;
            case 2:
                System.out.println("Value was 2.");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was either 3, 4, or 5.");
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5.");
                break;
        }

        val = 6;
        switch(val) {
            case 1 -> System.out.println("Value was 1.");
            case 2 -> System.out.println("Value was 2.");
            case 3, 4, 5 -> {
                System.out.println("Value was either 3, 4, or 5.");
                System.out.println("Value was " + val + ".");
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, or 5.");
        }

        System.out.println(getQuarter("January"));
        System.out.println(getQuarterNew("january"));
        System.out.println(natoAlphabet('E'));
        System.out.println(natoAlphabet('F'));

        printDayOfWeek(8);
        printDayOfWeek(6);

        printDayOfWeekIf(8);
        printDayOfWeekIf(2);

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(-2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(4, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(12, 10000));
    }

    public static String getQuarter(String month) {
        switch (month) {
            case "January": case "February": case "March": return "Month was in the first quarter.";
            case "April": case "May": case "June": return "Month was in the second quarter.";
            case "July": case "August": case "September": return "Month was in the third quarter.";
            case "October": case "November": case "December": return "Month was in the fourth quarter.";
        }
        return "Not a valid month.";
    }

    public static String getQuarterNew(String month){
        return switch(month){
            case "January", "February", "March" -> "Month was in the first quarter.";
            case "April", "May", "June" -> "Month was in the second quarter.";
            case "July", "August", "September" -> "Month was in the third quarter.";
            case "October", "November", "December" -> "Month was in the fourth quarter.";
            default -> {
                String badResponse = "Invalid month.";
                yield badResponse;
            }
        };
    }

    public static String natoAlphabet(char letter){
        return switch(letter){
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Invalid letter.";
        };
    }

    public static void printDayOfWeek(int num){
        switch(num){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Number not between 1-7.");
        };
    }

    public static void printDayOfWeekIf(int num){
        if(num == 1){
            System.out.println("Sunday");
        } else if(num == 2){
            System.out.println("Monday");
        } else if(num == 3){
            System.out.println("Tuesday");
        } else if(num == 4){
            System.out.println("Wednesday");
        } else if(num == 5){
            System.out.println("Thursday");
        } else if(num == 6) {
            System.out.println("Friday");
        } else if(num == 7){
            System.out.println("Saturday");
        } else {
            System.out.println("Number not between 1-7.");
        }
    }

    public static void printNumberInWord(int num){
        String numInWord;
            switch(num){
                case 0 -> numInWord = "ZERO";
                case 1 -> numInWord = "ONE";
                case 2 -> numInWord = "TWO";
                case 3 -> numInWord = "THREE";
                case 4 -> numInWord = "FOUR";
                case 5 -> numInWord = "FIVE";
                case 6 -> numInWord = "SIX";
                case 7 -> numInWord = "SEVEN";
                case 8 -> numInWord = "EIGHT";
                default -> numInWord = "OTHER";
            };
        System.out.println(numInWord);
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

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999){
            return - 1;
        }
       return switch(month) {
           case 1, 3, 5, 7, 8, 10, 12 -> 31;
           case 2 -> isLeapYear(year) ? 29 : 28;
           case 4, 6, 9, 11 -> 30;
           default -> -1;
       };
    }
}
