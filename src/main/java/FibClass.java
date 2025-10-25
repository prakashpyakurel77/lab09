/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class FibClass {

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibIter(int n) {
       
        int i, f[] = new int[n + 2]; 
        f[0] =f[1]= 0;
       
        for (i = 2; i <= n; i++) 
            f[i] = f[i - 1] + f[i - 2];
        
        return f[n];
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Fibonacci (Recursive) of 10: " + fibRec(10));
        System.out.println("Fibonacci (Iterative) of 10: " + fibIter(10));
    }
}
    
    
    


