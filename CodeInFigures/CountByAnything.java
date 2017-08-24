import java.util.Scanner;

public class CountByAnything {

   public static void main(String[] args) {
      int counter = 0;
      int stop = 300;
      int userInput;

      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a number to count by: ");

      userInput = input.nextInt();

      while(counter < stop){
         counter += userInput;
         System.out.println(counter);
      }

   }

}
