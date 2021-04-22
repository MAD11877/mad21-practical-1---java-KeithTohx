import java.util.Scanner;
import java.util.ArrayList;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int intNum = in.nextInt();
    ArrayList<Integer> intList = new ArrayList<>();
    int highestInt = 0;
    int highestOcc = 0;

    for (int i = 0; i < intNum; i++) {
      int num = in.nextInt();
      intList.add(num);
      int numOcc = 0;

      for (int n : intList){
        if (n == num){
          numOcc++;
        }
      }

      if (numOcc > highestOcc){
        highestOcc = numOcc;
        highestInt = num;
      }
    }
    System.out.println(highestInt);

  }
}
