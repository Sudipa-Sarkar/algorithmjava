import java.util.Scanner;
public class max_pair
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        int temp;
        int c=0;
        long m;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        while(c<2)
        {
        for(i=0;i<n-1;i++)
        {
          if(a[i]>a[i+1])
          {
              temp=a[i];
              a[i]=a[i+1];
              a[i+1]=temp;
            }
        }
        c++;
        }
        m=a[n-1]*a[n-2];
        System.out.println(m);
    }
}