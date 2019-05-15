/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author harshit
 */
public class PRB01 {
    public static void main(String args[])throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int count=0;
            int n = Integer.parseInt(br.readLine());
            for(int j=2;j<(n/2);j++)
            {
                if(n%j==0)
                    count++;
            }
            if(count>0)
                System.out.println("no");
            else
                System.out.println("yes");
        }
    }
}
