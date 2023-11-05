public class StringMethod {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        String month = birthDate.substring(3,4);
        System.out.println("Month = " + month);
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);
        newDate = "06";
        newDate = "/";
        newDate = "24";
        newDate = "/";
        newDate = "1979";
        System.out.println("newDate = " + newDate);
        newDate = "10".concat("/").concat("12").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);
        newDate = newDate.replace('/', '-');
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("-", "---"));
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
        System.out.println("    ABC\n".repeat(3).indent(-2)); // indents only 2 spaces since the String has 4 spaces already
        System.out.println("-".repeat(20));
    }
}
