/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author harshit
 */
public class ASP {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int count=0;
            int n=sc.nextInt();
            int ar[] = new int[n];
            for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
                if(j>0)
                {
                    if(ar[j]>ar[j-1])
                        count++;
                }
            }
            if(count==n-1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
