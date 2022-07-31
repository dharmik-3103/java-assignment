// 21CE021 - Dharmik Chondagar
// The problem is to write a program that will grade multiple-choice tests. Assume 
// there are eight students and ten questions, and the answers are stored in a two-
// dimensional array. Each row records a student’s answers to the questions, as 
// shown in the following array.
// Student's Answers to the Questions:


import java.util.*;
import java.util.Scanner;
public class anskey {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j;
        int count=0;
        char ans[][] = new char[10][10];
        String ANS = "DBDCCDAEAD";
        for(i=0;i<10;i++)
        {
            for(j=0;j<=9;j++)
            {
                ans[i][j] = s.next().charAt(0);
            }
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(ans[i][j]==ANS.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }
    }
    
}

