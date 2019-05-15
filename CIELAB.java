/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
*/
import java.util.*;
public class CIELAB {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a-b)%10==9)
            System.out.println(a-b-1);
        else
            System.out.println(a-b+1);
    }
}
