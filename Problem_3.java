import java.util.Scanner;
import java.lang.Math;
public class Problem_3 {
    public static int prime(int n,int i)
    {
        double s=Math.floor(Math.sqrt(n));
        s=(int)s;
        if ((s==1) || (s==i) || (n==2)) return 1;
        if(n%i==0) return 0;
        return prime(n,i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int chk=prime(n,2);
        if (chk==1) System.out.print("Prime");
        else System.out.print("Composite");
    }
}
