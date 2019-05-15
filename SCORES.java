import java.io.*;
import java.util.*;
public class SCORES 
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long[] a = new long[t];
        long max=0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int j=0;j<t;j++)
        {
            a[j]=Long.parseLong(st.nextToken());
            if(a[j]>max)
                max = a[j];
        }
        long max1=0,count=0;
        for(int j=0;j<t;j++)
        {
            if(a[j]==max)
                count++;
            if(a[j]>max1 && a[j]<max)
                max1=a[j];
        }
        if(count>1)
        System.out.println(max+" "+max);
        else
            System.out.println(max+" "+max1);        
    }
}
