import java.util.Scanner;
public class GCD
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int temp;
      while(b!=0)
     {
            temp=a;
            a=b;
            b=temp%b;
        }
        System.out.println(a);
    }
}