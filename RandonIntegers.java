import java.util.Random;
public class RandomIntegers
{
  public static void main(String[] args)
    {
      Random randomNumbers = new Random();
      int face;
      for(int counter =1;counter <=20;counter++)
      {
        face = 1 + randomNumbers.nextInt(6);
        System.out.println("%d ",face);
        if (counter %5==0)
          System.out.println();
      }
    }
}
