
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int prev = 0;
        int next = 0;
        int fib = 0;
        // Setting the number 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();



        for (int i = 0; i < number; i++){
            if (i < 2){
                fib = i;
                next = fib;
                System.out.println(fib + " ");
                continue;
            }
            fib = prev + next;
            prev = next;
            next = fib;
            
            System.out.println(fib + " ");
        }
    }
}