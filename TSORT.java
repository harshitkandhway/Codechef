import java.util.*;
public class TSORT {
    public static void main(String args[])
    {
        int[] a = new int[100000];
        int max=0;
         Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
             if(max<a[i])max=a[i];   
         }
         int[] b = new int[max+1];
        for(int j=0;max>j;j++)
        {
            b[j]=0;
        }
          for(int i=0;i<n;i++)
              b[a[i]]++;
         for(int j=0;j<=max;j++)
         {
             if(b[j]!=0)
             {
                 for(int y=0;y<b[j];y++)
                     System.out.println(j);
             }
         }    
    }    
}
