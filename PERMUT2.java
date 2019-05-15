import java.io.*;
import java.util.*;
public class PERMUT2 {    
    public static void main(String args[])throws IOException
    {
        int[] ar1=new int[10001];
        int[] ar2=new int[10001];
        ar1[0]=0;
        ar2[0]=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(!"0".equals(str=br.readLine()))
        {
            int n =Integer.parseInt(str);
           String str1 =br.readLine();
            StringTokenizer st = new StringTokenizer(str1," ");
            for(int j=1;j<=n;j++)
            {
                int a = Integer.parseInt(st.nextToken());
                ar1[j]=a;
                ar2[a]=j;
            }
            if(Arrays.equals(ar1, ar2))
                System.out.println("ambigious");
            else
                System.out.println("not ambigious");
        }
    }
}
