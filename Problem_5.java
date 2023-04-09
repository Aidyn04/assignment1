import java.util.Scanner;
import java.lang.Math;
public class Problem_5 {
    public static int fib(int i)
    {
        if(i==0) return 0;
        if(i==1) return 1;
        return fib(i-2)+fib(i-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.print(fib(n));
    }
}
