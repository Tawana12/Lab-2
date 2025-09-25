import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int reverse  = 0; 
        int number = 0; 
        int checkNumber = 0;
        // Getting user input 
        System.out.print("Enter the number ");
        number = scanner.nextInt();

        int numberCopy = number;

        //Check if the number is (+) o r (-)
        checkNumber = (number > 0) ? 1 : -1;

        //Converting to positive if it is negative
        number = (number > 0) ? number : number * -1;



        
        while(number > 0){
            reverse = (reverse * 10) + (number  % 10); 
            number /= 10;
        }

        reverse = (checkNumber > 0) ? reverse : reverse * -1;

        System.out.println("The reverse of " + numberCopy + " is " + reverse);

    }
}