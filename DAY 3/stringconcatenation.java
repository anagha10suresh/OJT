public class stringconcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate using + operator
        String concatenated1 = str1 + ", " + str2 + "!";
        System.out.println("Concatenated using +: " + concatenated1);

        // Concatenate using concat method
        String concatenated2 = str1.concat(", ").concat(str2).concat("!");
        System.out.println("Concatenated using concat: " + concatenated2);
    }
}
