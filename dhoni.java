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
public class dhoni {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        long[] a = new long[1000000000];
        for(int h=0;h<t;h++)
        {
            long n,m,x;
            int j,i;
            n= sc.nextInt();
            m= sc.nextInt();
            x= sc.nextInt();
            for(j=0;j<n;j++)
            {
                a[j] = sc.nextInt();
            }
            int count=0;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(((a[i]+a[j])%m)<=x)
                    { count++; 
                      System.out.println("("+a[i]+","+a[j]+")");
                }}
            }
            System.out.println(count);
        }
    }
}
