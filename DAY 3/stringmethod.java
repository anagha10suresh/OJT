public class stringmethod {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);

        // Find the length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Check if the string contains "World"
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    }
}
