/* package codechef; // don't place package name! */
import java.math.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef 
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger[] a = new BigInteger[100000];
        for(int h=0;h<t;h++)
        {
            int n;
            long m,x;
            int j,i;
            n= sc.nextInt();
            m= sc.nextInt();
            x= sc.nextInt();
            for(j=0;j<n;j++)
            {
                a[j] = sc.nextBigInteger();
            }
            int count=0;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    BigInteger k = (a[i].add(a[j]));
                    BigInteger l = BigInteger.valueOf(m);
                    BigInteger lx = BigInteger.valueOf(x);
                    if(k.mod(l).compareTo(lx)<=0)
                    { count++; 
                      //System.out.println("("+a[i]+","+a[j]+")");
                }}
            }
            System.out.println(count);
        }
   }
    
}
