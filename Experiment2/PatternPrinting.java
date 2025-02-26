public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Printing stars
            for (int k = 0; k < (n - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
