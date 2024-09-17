import java.util.*;

public class Main {
    
    // Function to generate liked numbers up to the required number of elements
    public static List<Integer> generateLikedNumbers(int upTo) {
        List<Integer> likedNumbers = new ArrayList<>();
        int currentNumber = 1;
        
        while (likedNumbers.size() < upTo) {
            if (currentNumber % 3 != 0 && currentNumber % 10 != 3) {
                likedNumbers.add(currentNumber);
            }
            currentNumber++;
        }
        
        return likedNumbers;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        // Read all k values and determine the maximum k needed
        int[] ks = new int[t];
        int maxK = 0;
        
        for (int i = 0; i < t; i++) {
            ks[i] = scanner.nextInt();
            if (ks[i] > maxK) {
                maxK = ks[i];
            }
        }
        
        // Generate liked numbers up to the maximum k needed
        List<Integer> likedNumbers = generateLikedNumbers(maxK);
        
        // Output the k-th liked number for each test case
        for (int k : ks) {
            System.out.println(likedNumbers.get(k - 1));
        }
        
        scanner.close();
    }
}
