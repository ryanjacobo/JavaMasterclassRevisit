public class StringBuilderMethod {
    public static void main(String[] args) {
        String helloWorld = "Hello " + "World";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");

        helloWorld.concat(" and Goodbye");
        helloWorldBuilder.append(" and Goodbye");

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        emptyStart.append("a".repeat(17));
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");
        System.out.println(builderPlus);

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "X");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length() );
        System.out.println("capacity = " + builder.capacity());
    }
}
