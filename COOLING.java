/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//QUESTION STATEMENT..!
import java.util.Scanner;
/**
 *
 * @author harshit
 */
public class COOLING {
    public static void main(String args[])
    {
        int[] b = new int[30];
        int max=0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n =sc.nextInt();
            for(int j=0;j<n;j++)
            {
            
            b[j]=sc.nextInt();
            int a =sc.nextInt();
            if(a>max)
                max=a;
            }
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(b[j]<=max)
                    count++;
            }
            System.out.println(count);
        }
    }
}
