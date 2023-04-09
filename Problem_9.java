import java.util.Scanner;

public class Problem_9 {
    public static int binom(int n,int k)
    {
        if((k==0) || (n==k)) return 1;
        return binom(n-1,k-1)+binom(n-1,k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k,n;
        n=in.nextInt();
        k=in.nextInt();
        System.out.println(binom(n,k));
    }
}
