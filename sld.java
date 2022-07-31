// 21CE021 - Dharmik Chondagar
// Given two non-negative int values, return true if they have the same last digit, such 
// as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
// 10 is 7.
// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true


import java.util.Scanner;
public class sld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a%10==b%10)
        {
            System.out.println("Last two digits are same.");
        }
        else{
            System.out.println("Last two digits are not same.");
        }

    }    
}


