/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author harshit
 */
public class TLG {
    public static void main(String args[])throws IOException
    {
        int max=0,win=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a1;
        a1 = new int[n];
        int[] b1;
        b1 = new int[n];
        
        for(int i=0;i<n;i++)
        {
            String str= br.readLine();
            StringTokenizer st;
            st = new StringTokenizer(str," ");
            int a=0,b=0,lead;
            a1[i]= Integer.parseInt(st.nextToken());
            b1[i]= Integer.parseInt(st.nextToken());
            a=a+a1[i];
            b=b+b1[i];
            if(a>b)
            {
                lead = a-b;
                if(lead>max){
                    max=lead;
                    win = 1;
            }}
            else
            {
                lead = b-a;
                if(lead>max)
                {
                    max = lead;
                    win =2;
                }
            }    
        }
        System.out.println(win+" "+max);
    }
    
}
