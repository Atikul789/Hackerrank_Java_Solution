import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int start=0, end = A.length()-1;
        boolean palindrome = true ;
        while(start<=end)
        {
            if(A.charAt(start)!=A.charAt(end))
            {
               palindrome = false;
            }
            start++;
            end--;
        }
        if(palindrome)
        {
            System.out.println("Yes");
        }
        else

        {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



