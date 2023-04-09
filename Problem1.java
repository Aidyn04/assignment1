import java.util.Scanner;

public class Problem1 {
    public static int find_min(int arr[],int min,int i)
    {
        if(i==arr.length) return min;
        if(min>arr[i]) min=arr[i];
        return find_min(arr,min,i+1);
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
        System.out.print(find_min(arr,arr[0],0));
    }
}
