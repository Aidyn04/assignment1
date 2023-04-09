import java.util.Scanner;

public class Problem_8 {
    public static boolean iox(char ch[],int i) {
        if(i==ch.length) return true;
        if(!(Character.isAlphabetic(ch[i]))) return iox(ch,i+1);
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str=in.next();
        char[] ch=str.toCharArray();
        if(iox(ch,0)) System.out.println("Yes");
        else System.out.println("No");
    }
}
