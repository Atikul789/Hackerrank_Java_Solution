import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int Length = A.length() + B.length();
        boolean yes=false;
        for(int i=0;i<Math.min(A.length(),B.length());i++)
        {
            if(A.charAt(i)>B.charAt(i))
            {
                yes = true;
                break;
            }
            else
            {
                break;
            }
        }
        System.out.println(Length);
        if(yes)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        A= A.substring(0,1).toUpperCase() + A.substring(1);
        B= B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A+ " " + B);
    }
}



