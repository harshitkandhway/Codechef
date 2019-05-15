import java.io.*;
public class HEADBOB {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int ci=0,cn=0;
            int n = Integer.parseInt(br.readLine());
            char[] a = new char[n];
            a = br.readLine().toCharArray();
            for(int j=0;j<n;j++)
            {
                if(a[j]=='I')
                    ci++;
                else if(a[j]=='N')
                    cn++;
            }
            if(ci>0)
                System.out.println("INDIAN");
            else{
                if(cn==n)
                    System.out.println("NOT SURE");
                else
                    System.out.println("NOT INDIAN");
            }
        }
    }
}
