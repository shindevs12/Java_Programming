class Base
{
   public int i,j;


}

class Derived extends Base
{
  public int x;
}

class RMDdemo1
{
    public static void main (String A[])
    {
       Base bp1 = new Base(); //no casting
       Derived dp = new Derived(); //no casting

       Base bp2 = new Derived(); //upcasting

       Derived dp2 = new Base();  //downcasting //ERROR

    }
}