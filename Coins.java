/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author harshit
 */
public class Coins {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            BigInteger n = sc.nextBigInteger();
                   BigInteger g = n.divide(BigInteger.valueOf(2)).add(n.divide(BigInteger.valueOf(3))).add(n.divide(BigInteger.valueOf(4)));
                   int i= n.compareTo(g);
                   if(i<0)
                       System.out.println(g);
                   else
                       System.out.println(n);
        }
    }
}
