
import java.io.*;
import java.util.*;

class TwoNumbers {

    public static void main(String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long turns=sc.nextLong();
            if(turns==1)
            {
                a=a*2;
            }
            else{
            if(turns%2==0)
            {
                a=a*(2*(turns/2));
                b=b*(2*(turns/2));
            }
            else
            {
                  a=a*(2*(turns/2));
                a=a*2;
                b=b*(2*(turns/2));
            }
            }
            long ans=Math.max(a,b)/Math.min(a,b);
            System.out.println(ans);
        }
    }
}