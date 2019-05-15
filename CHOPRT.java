/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
public class CHOPRT {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a  = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a>b)
                System.out.println(">");
            else if(a<b)
                System.out.println("<");
            else
                System.out.println("=");
        }
    }
        
}
