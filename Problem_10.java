import java.util.Scanner;

public class Problem_10 {
    public static int euqlid(int n,int m)
    {
        int q,k;
        q=n%m;
        if(q==0) return m;
        return euqlid(m,q);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        if(n>m) System.out.println(euqlid(n,m));
        else System.out.println(euqlid(m,n));
    }
}
