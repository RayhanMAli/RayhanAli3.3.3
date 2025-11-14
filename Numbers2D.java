/*
 * Activity 3.3.3
*/
public class Numbers2D
{
  public static void main(String[] args)
  {
    int[][] numbers = { {1,5,3,8,-3,0,3},
                      {4,4,8,0,3,-1,1}, 
                      {0,3,8,4,-2,7, 6} };
    
    System.out.println("Sum of all elements: " + Sum(numbers));
    System.out.println("Average of all elements: " + Average(numbers));
    System.out.println("Minimum value in the array: " + min(numbers));
    System.out.println("Maximum value in the array: " + max(numbers));
    System.out.println("Count of negative numbers in the array: " + countNegatives(numbers));


  }
  public static int Sum(int[][] array)
  {
    int sum = 0;

    for (int[] row : array)
    {
      for (int value : row)
      {
        sum += value;
      }
    }
    return sum;
  }
  public static double Average(int[][] array)
  {
    int sum = Sum(array);
    int count = 0;
    for (int[] row : array)
    {
      count += row.length;
    }
    return (double) sum / count;
  }
  public static int min(int[][] array)
  {
    int min = array[0][0];

    for (int[] row : array)
    {
      for (int value : row)
      {
        if (value < min)
        {
          min = value;
        }
      }
    }
    return min;
  }
    public static int max(int[][] array)
    {
        int max = array[0][0];
    
        for (int[] row : array)
        {
        for (int value : row)
        {
            if (value > max)
            {
            max = value;
            }
        }
        }
        return max;
    }
    public static int countNegatives(int[][] array)
    {
        int count = 0;
    
        for (int[] row : array)
        {
        for (int value : row)
        {
            if (value < 0)
            {
            count++;
            }
        }
        }
        return count;
    }
}
