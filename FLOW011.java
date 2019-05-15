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
public class FLOW011 {
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine());
            if(n<1500)
                System.out.println(2*n);
            else
                System.out.println((double)((1.98*n)+500));
        }
    
    }
}
