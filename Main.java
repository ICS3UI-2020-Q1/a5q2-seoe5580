import java.util.Scanner;
/**
 * This program counts up the number from one all the way to user's number
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to input a integer
    System.out.println("Please enter a positive integer");

    // Gets the number from user
    int num = input.nextInt();

    // starts at 1 and prints up to 1 number before num vaule and adds a ", " after every loop
    for(int i = 1; i < num; i++){
      System.out.print(i + ", ");
    }

    // prints out the last number out of the loop so it wouldnt loop 1, num 2, num 3, num
    System.out.print(num);
    
  }
}
