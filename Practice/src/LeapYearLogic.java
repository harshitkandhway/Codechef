import java.util.Scanner;

public class LeapYearLogic {
    public void leapYear(int year)
    {
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Not Leap Year");
            }
            else
                System.out.println("Leap Year");
        }
        else
            System.out.println("Not Leap Year");
    }

    public static void main(String[] args) {
        LeapYearLogic lyl = new LeapYearLogic();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        lyl.leapYear(year);
    }
}
