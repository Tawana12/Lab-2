import java.lang.*;
import java.util.Scanner;
public class CheckVowels{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaring variables
        String vowels = "aeiou";
        String sentence;    
        String result;
        int count = 0;

        //Getting user input 
        System.out.print("Enter a sentence or a word: ");
        sentence = scanner.nextLine();

        for (int i = 0; i < vowels.length(); i++){
            //For counting unique
            //count = (sentence.contains(Character.toString(vowels.charAt(i)))) ? count + 1: count;

            for (int j  = 0; j < sentence.length(); j++){
                if (Character.toString(sentence.charAt(j)).toUpperCase().equals((Character.toString(vowels.charAt(i)).toUpperCase()))){
                    count ++;
                }
            }

        }
        System.out.println("The sentence/word has " + count + " vowels");




    }
}