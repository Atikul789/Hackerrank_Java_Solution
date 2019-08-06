import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s;
        Scanner input = new Scanner(System.in);
        s=input.nextLine();
        BigInteger a  = new BigInteger(s );
        s= input.nextLine(); 
        BigInteger b= new BigInteger(s);
        BigInteger add= a.add(b);
        BigInteger mul =  a.multiply(b);
        System.out.println(add+ "\n" + mul);
        input.close();
    }
}

