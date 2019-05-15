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
public class FLOW009 {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int quan = Integer.parseInt(st.nextToken());
            int pri  = Integer.parseInt(st.nextToken());
            if(quan<1000)
                System.out.println((double)(quan*pri));
            else
                System.out.println((double)(0.9*quan*pri));
        }
    }
}
