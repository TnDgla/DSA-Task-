import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childIndex = 0; // Pointer for children
        int cookieIndex = 0; // Pointer for cookies
        
        // Loop until we reach the end of either list
        while (childIndex < g.length && cookieIndex < s.length) {
            // If the current cookie can satisfy the current child's greed
            if (s[cookieIndex] >= g[childIndex]) {
                // Move to the next child
                childIndex++;
            }
            // Always move to the next cookie
            cookieIndex++;
        }
        
        // The number of satisfied children is childIndex
        return childIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for greed factors
        System.out.print("Enter the number of children: ");
        int numChildren = scanner.nextInt();
        int[] g = new int[numChildren];
        
        System.out.println("Enter the greed factors of the children:");
        for (int i = 0; i < numChildren; i++) {
            g[i] = scanner.nextInt();
        }

        // Input for cookie sizes
        System.out.print("Enter the number of cookies: ");
        int numCookies = scanner.nextInt();
        int[] s = new int[numCookies];
        
        System.out.println("Enter the sizes of the cookies:");
        for (int i = 0; i < numCookies; i++) {
            s[i] = scanner.nextInt();
        }

        AssignCookies solution = new AssignCookies();
        int result = solution.findContentChildren(g, s);
        System.out.println("Maximum number of content children: " + result);
        
        scanner.close();
    }
}
