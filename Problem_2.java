import java.util.Scanner;
public class Problem_2 {

    public static double find_avg(int arr[],double sum,int i)
    {
        if(i==arr.length) return 0;
        sum=find_avg(arr,sum,i+1)+arr[i];
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[];
        arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= in.nextInt();
        }
        System.out.print(find_avg(arr,0,0)/n);
    }
}
