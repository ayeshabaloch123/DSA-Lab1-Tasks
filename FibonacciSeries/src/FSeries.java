import java.util.Scanner;
public class FSeries {
    public static void main(String[] args) {
        int n,first=1,next=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Terms");
        n=sc.nextInt();
        System.out.print(first+" "+next+" ");
        for(int i=3;i<n;i++){
            int temp=next;
            next=first+next;
            first=temp;
            System.out.print(next+" ");
        }
    }
}

