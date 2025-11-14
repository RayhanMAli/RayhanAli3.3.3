import java.util.Arrays;
/*
 * Activity 3.3.3
*/
public class Names2D
{
  public static void main(String[] args)
  {
    String[][] names = {{"Ari", "Avery", "Ash", "Aman"},
                        {"Brynn", "Bodie", "Bo", "Barrie"},
                        {"Cris", "Carter", "Cali", "Ari"}};
    
    System.out.print("Determine if there are duplicate names:" + hasDuplicates(names));
   
    
    System.out.println("\nAccess consecutive pairs of elements in each row:");
    printConsecutivePairs(names);
    System.out.println("\nReverse the order of the elements in second column:");
    reverseSecondColumn(names);
    System.out.println(Arrays.deepToString(names));
    System.out.println("\nShift an element in a row: Shift the first name in the first row left to the last name in the row:");
    shift(names);
    System.out.println(Arrays.deepToString(names));

    System.out.println("\nShift an element in a column: Shift the last name in the first row down to the last row:");
    shift2(names);
    System.out.println(Arrays.deepToString(names));
  }
  public static boolean hasDuplicates(String[][] array)
  {
    for (String[] row : array)
    {
      for (String i : row)
      {
        for (String j : row)
        {
          if (i.equals(j))
          {
            return true;
          }
        }
      }
    }
    return false;
  }
  public static  void printConsecutivePairs(String[][] array)
  {
    for (String[] row : array)
    {
      for (int i = 0; i < row.length - 1; i++)
      {
        System.out.println(row[i] + ", " + row[i + 1]);
      }
    }
  }
  public static void reverseSecondColumn(String[][] array)
  {
    int numRows = array.length;
    for (int i = 0; i < numRows / 2; i++)
    {
      String temp = array[i][1];
      array[i][1] = array[numRows - 1 - i][1];
      array[numRows - 1 - i][1] = temp;
    }
  }
  public static void shift(String[][] array)
  {
    String firstName = array[0][0];
    String lastName = array[0][array[0].length - 1];
    array[0][0] = lastName;
    array[0][array[0].length - 1] = firstName;
  }
  public static void shift2(String[][] array)
  {
    String lastName = array[0][array.length - 1];
    array[array.length - 1][0] = lastName;
  }
}
