// 21CE021 - Dharmik Chondagar
// Given 2 strings, a and b, return the number of the positions where they contain the 
// same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
// and "az" substrings appear in the same place in both strings.
// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0
import java.util.Scanner;
public class position {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len,count=0;
        String a = s.next();
        String b = s.next();
        if(a.length()>b.length())
        {
            len = b.length();
        }
        else if(a.length()>b.length())
        {
            len = b.length();
        }
        else
        {
            len = a.length();
        }
        for(int i=0;i<len-1;i++)
        {
            if(a.substring(i,i+2).equals(b.substring(i,i+2)))
            {
                count++;
            }
        }
        System.out.println(count);
}
}


