import java.util.*;

class ExceptionDemo3
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int ino1=0, ino2=0, ians=0;
       
       
       System.out.println("Enter first no:");
       ino1 = sobj.nextInt();

       System.out.println("Enter second no:");
       ino2 = sobj.nextInt();

      ians = ino1 / ino2;

      System.out.println("Division is :"+ians);


    }
}