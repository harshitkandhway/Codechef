import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PanaromicString {
    public void checkPanaromicString(String str)
    {
        char tempChar;
        str = str.toLowerCase();
        HashSet<Character> tempHS = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            tempChar=str.charAt(i);
            if(tempChar>='a' && tempChar<='z')
            {
                tempHS.add(tempChar);
            }
        }
        if(tempHS.size()==26)
            System.out.println("Panaromic String");
        else
            System.out.println("String is not panaromic");

    }

    public static void main(String args[])throws IOException
    {
        PanaromicString ps = new PanaromicString();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ps.checkPanaromicString(str);

    }
}
