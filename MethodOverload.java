public class MethodOverload
{
  public void testOverloadedMethods()
  {
    System.out.printf("o Quadrado do numero inteiro 7 é %d\n",square(7));
    System.out.printf("o Quadrado do numero double 7.5 é %d\n",square(7.5));
  }

  public int square(int intValue)
  {
    System.out.printf("\nchamada square com argumento intt:%d\n",intValue);
    return intValue * intValue;
  }

  public double square(double doubleValue)
  {
    System.out.printf("\nchamada square com argumento double:%f\n",doubleValue);
    return doubleValue * doubleValue;
  }
