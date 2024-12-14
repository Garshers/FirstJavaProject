import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int i=0;
        System.out.println("\n---example "+ (++i) + " - incrementation---");
        incrementationExample();

        System.out.println("\n---example "+ (++i) + " - float number---");
        floatNumberExample();

        System.out.println("\n---example "+ (++i) + " - accuracy of double, float and BigDecimal---");
        accuracyExample();

        System.out.println("\n---example "+ (++i) + " - for, while, if, switch---");
        performActions(10);

        // System.out.println("\n---example "+ (++i) + " - string manipulation---");
        // stringManipulation();

        // System.out.println("\n---example "+ (++i) + " - scanner - InputStream ---");
        // inputStream();
    }

    // Example 1: Incrementation
    public static void incrementationExample() {
        int a = 5;
        System.out.println("Post-incrementation: "+ a++ + "; " + a); // Post-incrementation
        a--;
        System.out.println("Pre-incrementation: "+ ++a + "; " + a); // Pre-incrementation
    }

    // Example 2: Float number and rounding
    public static void floatNumberExample() {
        float b = 2, c = 9;
        b /= c;
        BigDecimal roundedValue = new BigDecimal(b).setScale(2, RoundingMode.HALF_UP);// Rounding to 2 places using BigDecimal
        System.out.println("BigDecimal: "+ roundedValue); // Regular rounding
        System.out.println(String.format("%.2f", b));// Using String.format() - no change in value, only in displaying
        System.out.println(Math.ceil(b));// Rounding up and down
        System.out.println(Math.floor(b));
    }

    // Example 3: Accuracy of double, float, and BigDecimal
    public static void accuracyExample() {
        double d = 0.13, e = 0.17;
        System.out.println(d + e); // Double precision
        float d2 = 0.13f, e2 = 0.17f;
        System.out.println(d2 + e2); // Float precision
        BigDecimal f = new BigDecimal("0.13");
        BigDecimal g = new BigDecimal("0.17");
        System.out.println(f.add(g)); // BigDecimal precision
    }

    public static void performActions(int iterations) {
        for (int i = 1; i <= iterations; i++) {
            System.out.println("Iteration " + i + ":");
            int j=0;

            while(i == 1 && j<5){
                System.out.println("While["+ i +", "+ j++ +"]");
            }
            // Nested if within a for loop
            if (i % 2 == 0) {
                if (i > 3 && i < 7) {
                    System.out.println("  The number is even, and between 3 and 7.");
                } else {
                    System.out.println("  The number is even, outside the range 3 to 7.");
                }
            }

            // Old switch-case structure
            switch (i) {
                case 1:
                    System.out.println("  This is the first iteration.");
                    break;
                case 2:
                    System.out.println("  This is the second iteration.");
                    break;
                case 3:
                    System.out.println("  This is the third iteration.");
                    break;
                default:
                    System.out.println("  This is neither the first, second, nor third iteration.");
            }

            // New switch-case structure
            switch (i) {
                case 1 -> System.out.println("  This is the first iteration. - New switch");
                case 2 -> System.out.println("  This is the second iteration. - New switch");
                case 3 -> System.out.println("  This is the third iteration. - New switch");
                default -> System.out.println("  This is neither the first, second, nor third iteration. - New switch");
            }

            // For loop with a break condition
            for (int k = 1; k <= 5; k++) {
                if (k == 4) {
                    System.out.println("  Breaking out of the for loop at iteration " + k);
                    break;
                }
                System.out.println("  Inside for loop with k = " + k);
            }

            // Using continue in a loop (skipping even numbers)
            for (int l = 1; l <= 5; l++) {
                if (l % 2 == 0) {
                    continue; // Skip even numbers
                }
                System.out.println("  Odd number: " + l);
            }

            // Exception handling with try-catch
            try {
                int result = i / 0; // This will cause ArithmeticException
                System.out.println(i +"devided by 0 is equal: "+ result);
            } catch (ArithmeticException e) {
                System.out.println("  Error: Division by zero.");
            }

            System.out.println("The end");// blank line
        }
    }

    public static void stringManipulation() {
        String originalString = "   To be, or not to BE, that is the question  ";
        System.out.println("Original string: " + originalString);
    
        // 1. Change to uppercase
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);
    
        // 2. Change to lowercase
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);
    
        // 3. Replace a word in the string
        String replacedString = originalString.replace("be", "exist");
        System.out.println("Replaced 'be' with 'exist': " + replacedString);
    
        // 4. Split the string into words
        String[] words = originalString.split(" ");
        System.out.println("Split into words:");
        for (String word : words) {
            System.out.println(word);
        }
    
        // 5. Trim spaces at the beginning and end
        String trimmedString = originalString.trim();
        System.out.println("Trimmed: '" + trimmedString + "'");
    
        // 6. Check if the string contains a specific word
        boolean containsWord = originalString.contains("question");
        System.out.println("Contains 'question': " + containsWord);
    
        // 7. Check if the string starts with a specific prefix
        boolean startsWithTo = originalString.startsWith("To");
        System.out.println("Starts with 'To': " + startsWithTo);
    
        // 8. Check if the string ends with a specific suffix
        boolean endsWithQuestion = originalString.endsWith("question");
        System.out.println("Ends with 'question': " + endsWithQuestion);
    
        // 9. Get a substring from the string
        String substring = originalString.substring(3, 6);
        System.out.println("Substring from index 3 to 6: " + substring);
    }

    // Example 4: String input and output
    public static void inputStream() {
        String name = "No name";
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = scanner.nextLine();
        
        System.out.println("What is your age?");
        age = scanner.nextInt();
        
        System.out.println("Hello, " + name + " age " + age + "!");
        scanner.close();
    }
}

        // -------------------------------------------------Data types:----------------------------------------------------------------------
        // Primitive Data Types - These are the basic, built-in data types in Java. They are simple structures that store data directly in the stack memory.
        // 1. byte - stores whole numbers (8 bits).
        // 2. short - stores whole numbers (16 bits).
        // 3. int - stores whole numbers (32 bits).
        // 4. long - stores whole numbers (64 bits).
        // 5. float - stores floating-point numbers (32 bits).
        // 6. double - stores floating-point numbers (64 bits).
        // 7. char - stores single characters using Unicode (16 bits).
        // 8. boolean - stores logical values (true/false).

        // Reference Data Types:
        // Reference types refer to objects and are created based on classes.
        // Instead of storing the actual value, they store a reference (or address) to the location in memory where the object is stored.
        // 1. Classes (e.g., String, Integer).
        // 2. Arrays.
        // 3. Interfaces.
        // 4. User-defined classes.
        // Reference types are stored in the heap memory, while the variable itself holds the address pointing to their location.