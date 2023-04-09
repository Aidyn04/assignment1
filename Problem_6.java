import java.util.Scanner;
import java.lang.Math;
public class Problem_6 {
    public static int fib(int a,int n)
    {
        if(n==0) return 1;
        return a*fib(a,n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int n= in.nextInt();
        System.out.print(fib(a,n));
    }
}
