import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Problem_7 {
    public static void iox(char ch[],int l, int r) {
        if (l==r) {
            System.out.println(ch);
        } else {
            for (int i = l; i <= r; i++) {
                char t=ch[i];
                ch[i]=ch[l];
                ch[l]=t;
                iox(ch, l+1, r);
                ch[l]=ch[i];
                ch[i]=t;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.next();
        char[] ch=str.toCharArray();
        iox(ch,0,ch.length-1);
    }
}
