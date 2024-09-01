package AlgorithmicAnalysis;

public class BigOSingleLoop {

    public static void main(String[] args) {
        long numberOfOperations = 0;
        int n = 10000;
        long startTime;
        long endTime;

        System.out.println("Input size n is equal to " + n);
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations (linear - O(n)) = " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task 2 Nested Loops
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with nested loops (quadratic - O(n^2))= " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task 3 Three nested loops

        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations += 1;
                }
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with three nested loops (polynomial - O(n^3))= " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task 4.1 Consecutive n and m operations
        numberOfOperations = 0;
        int m = 10000;
        startTime = System.currentTimeMillis();
        for (int k = 0; k < n; k++) {
            numberOfOperations += 1;
        }
        for (int i = 1; i < m; i*=2) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with consecutive n and m O(n+m) = " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task 4.1 Consecutive n and m operations
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int k = 0; k < n; k++) {
            for (int i = 1; i < m; i*=2) {
                numberOfOperations += 1;
            }
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with nested n and m O(n*m) = " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");

        // Task 5 Logarithmic Complexity
        numberOfOperations = 0;
        startTime = System.currentTimeMillis();
        for (int i = 1; i < n; i*=2) {
            numberOfOperations += 1;
        }
        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with logarithmic log(n)= " + numberOfOperations + " in " + (endTime - startTime) + " milliseconds");



    }
}
