import java.util.*;
public class MAXCOUNT {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] a = new int[10000];
    int[] b = new int[10000];
    for(int i=0;i<t;i++)
    {
        int n = sc.nextInt();
        int max=0;
        for(int j=0;j<n;j++)
        {
            a[j]=sc.nextInt();
            b[a[j]]++;
            if(a[j]>max)
            {
                max=a[j];
            }
        }
        int count=0,prin=0;
        for(int j=max;j>=0;j--)
        {
            if(b[j]>=count)
            {
                count = b[j];
                prin = j; 
            }  
            b[j]=0;
        }
        System.out.println(prin+" "+count);
    }
}
}
