public class StringFormatting {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" + "\t\u2022 First Point\n" + "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d, Birth month = %d\n", age, yearOfBirth, 6);

        System.out.printf("Your age is %.2f%n", (float) age); // %.2f = make data 2 decimal places; %n = next line

        for(int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i); // %6d = data will be aligned 6 spaces to the right
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d". formatted(age);
        System.out.println(formattedString);

        printInformation("Hello World");
        printInformation("");
        printInformation("\t     \n");

        System.out.println("---Index inspection---");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l')); // index of first 'l'
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l')); // index of last 'l'

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3)); // next 'l' from 'l'(index 3)
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8)); // last 'l' from index 8 going to the left

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }
        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
