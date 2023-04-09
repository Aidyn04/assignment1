import java.util.Scanner;
import java.lang.Math;
public class Problem_4 {
    public static int fact(int n,int i)
    {
        if(i==n) return i;
        return fact(n,i+1)*i;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.print(fact(n,1));
    }
}
