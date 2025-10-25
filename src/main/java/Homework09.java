/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {
    
    // Method to count the divisors of a number
    public static int countDivisors(long n) {
        int count = 0;
        long sqrt = (long) Math.sqrt(n);
        for (long i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count += 2; 
            }
        }
        if (sqrt * sqrt == n) {
            count--; 
        }
        return count;
    }

    // Method to find the first triangle number with over 'limit' divisors
    public static long findTriangleWithDivisors(int limit) {
        long triangle = 0;
        int n = 1;

        while (true) {
            triangle += n; 
            int divisors = countDivisors(triangle);

            if (divisors > limit) {
                return triangle;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        int limit = 100;
        long result = findTriangleWithDivisors(limit);
        System.out.println("The first triangle number with over " + limit + " divisors is: " + result);
    }
}
    
    

