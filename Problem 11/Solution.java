import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
         BigInteger a = new BigInteger( n ); 
  
        // When certainty is one, 
        // it will check number for prime or composite 
        boolean result;
        result = a.isProbablePrime(1); 
        if(result)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
