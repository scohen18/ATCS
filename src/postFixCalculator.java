/**
 * intellij was made by Sam on 9/1/16.
 */
import java.util.*;
import java.awt.*;
public class postFixCalculator {
    public static void main(String[] args) {

        ArrayList<String> operations = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a post fix string of things: ");
        String input = scan.nextLine();

        String[] stringSplit = input.split(" ");
        int numNums = 0;
        for(int i = 0; i < stringSplit.length; i ++)
        {
            if(!(stringSplit[i].equals("*") || stringSplit[i].equals("+") || stringSplit[i].equals("/") || stringSplit[i].equals("-") || stringSplit[i].equals(" ")))
            {
                numNums ++;
            }

        }
        int[] numbers = new int[numNums];

        for(int i = 0; i < numbers.length; i ++)
        {
            if(!(stringSplit[i].equals("*") || stringSplit[i].equals("+") || stringSplit[i].equals("/") || stringSplit[i].equals("-")))
            {
                numbers[i] = Integer.parseInt(stringSplit[i]);
            }
            else
            {
                operations.add(stringSplit[i]);
            }

        }


        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < numbers.length; i ++)
        {
            stack.push(numbers[i]);
        }

        for(int i = 0; i < numbers.length; i ++)
        {
            System.out.println(numbers[i]);
        }



    }
}
