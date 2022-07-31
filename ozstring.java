// 21CE021 - Dharmik Chondagar
// Given a string, return a string made of the first 2 chars (if present), however include
// first  char  only  if  it  is  'o' and  include  the  second  only  if  it  is  'z',  so  "ozymandias"
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"

import java.util.*;
import java.util.Scanner;
public class ozstring {
    public static void main(String[] args) {
        String a = "ozymandias";
        String b = "bzoo";
        String c = "oxx";
        String d;
        char c1[],c2[],c3[];
        c1 = a.toCharArray();
        c2 = b.toCharArray();
        c3 = c.toCharArray();
        if(c1[0]=='o'&& c1[1]=='z')
        {
            System.out.println(c1[0]+""+c1[1]);
        }
        if(c2[1]=='z')
        {
            System.out.println(c1[1]);
        }
        if(c3[0]=='o')
        {
            System.out.println(c1[0]);
        }
    }
}



