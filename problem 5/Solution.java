import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] ary= new int[16];
        
        ary[1]=1;
        ary[2]=2;
        for(int i=3;i<16;i++)
            {
            ary[i]=ary[i-1]*2;
        }
        for(int i=2;i<16;i++)
            {
            ary[i]=ary[i]+ary[i-1];
        }
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<=n;j++)
                {
                System.out.print((a+(b*ary[j]))+" ");
            }
            System.out.println();                     
        }
        in.close();
    }
}
