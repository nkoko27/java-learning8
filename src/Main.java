public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "WOrld";
        helloWorld.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
        helloWorldBuilder.append(" and Goodbye");
        printInfo(helloWorldBuilder);
        printInfo(helloWorld);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInfo(String string) {
        System.out.println("string = " + string);
        System.out.println("lenght = " + string.length());
    }

    public static void printInfo(StringBuilder builder) {
        System.out.println("stringBuilder = " + builder);
        System.out.println("lenght = " + builder.length());
    }
}
