import java.util.Scanner;
public class LCM_algo
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      long a=sc.nextInt();
      long b=sc.nextInt();
      long temp;
      long a1,b1;
      a1=a;
      b1=b;
      while(b!=0)
     {
            temp=a;
            a=b;
            b=temp%b;
        }
        System.out.println((a1*b1)/a);
    }
}