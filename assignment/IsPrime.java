/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isprime;

/**
 *
 * @author Students
 */
public class IsPrime {
 public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int first = 1;
        int second = 2;
        
        while (second <= limit) {
            if (second % 2 == 0) {
                sum += second;
            }
            
            int next = first + second;
            first = second;
            second = next;
        }
        
        return sum;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n = 10; 
        int first = 1; 
        int second = 2; 
        
        System.out.print("First " + n + " terms of Fibonacci sequence: ");
        System.out.print(first + " " + second + " ");
        
        for (int i = 3; i <= n; i++) {
            int next = first + second; 
            System.out.print(next + " ");
            first = second; 
            second = next;
        }
        
        int limit = 4000000; 
        int sumEven = sumEvenFibonacci(limit);
        System.out.println("\nSum of even-valued Fibonacci terms below " + limit + ": " + sumEven);
        
        int count = 0;
        int num = 2;
        System.out.print("First 20 prime numbers: ");
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    
}
