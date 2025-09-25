import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        // Printing the Factorial of a number 
        Scanner scanner = new Scanner(System.in);


        //Getting the user input

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i < number + 1;i++){
            factorial *= i;
        }
        
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}