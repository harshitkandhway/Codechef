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
public class TWOSTR {
    public static void main(String ars[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        char[] a = new char[10];
        char[] b = new char[10];
        for(int h=0;h<t;h++)
        {
            int count=0;
        String str =br.readLine();
        a = str.toCharArray();
        b = br.readLine().toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(a[i]!=b[i] && a[i]!='?' && b[i]!='?' )
                count++;
        }
        if(count>0)
            System.out.println("No");
        else 
            System.out.println("Yes");
        }
    }
}
