// 21CE021 - Dharmik Chondagar
// Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the 
// array somewhere.
// array123([1, 1, 2, 3, 1]) → true
// array123([1, 1, 2, 4, 1]) → false
// array123([1, 1, 2, 1, 2, 3]) → true
import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        boolean flag=true;
        for(int j=0;j<5;j++)
        {   
            a[j]=s.nextInt();
        }
        for(int i=0;i<(a.length)-2;i++)
        {
            if(a[i]==1)
            {
                if(a[i+1]==2)
                {
                    if(a[i+2]==3)
                    {
                        flag=false;
                }
            }
        }

    }
    if(flag==true)
    {
        System.out.println("No, number 123 is not present in sequence.");
    }
    else
    {
        System.out.println("Yes, number 123 is  present in sequence.");
    }
    
}
}


