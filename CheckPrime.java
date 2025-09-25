
import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Get number input
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int counter = 0;
        int numberCopy = 0;
        numberCopy = number;
        number = (number > 0) ? number : number * -1;
        if (number == 1){
            System.out.println("1 is not a prime number");

        }else{
            for (int i = 1; i <= (number / 2 ); i++){
                counter = (number % i == 0) ? counter + 1 : counter;
            }

            String output = (counter > 1) ? numberCopy + " is not prime" : numberCopy + " is prime";
            System.out.println(output);
        }
    }
}