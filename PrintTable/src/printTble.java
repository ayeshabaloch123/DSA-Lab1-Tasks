import java.util.Scanner;

public class printTble{
    public static void main(String[] args) {
        int start,end,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Point");
        start=sc.nextInt();
        System.out.println("Enter Ending Point");
        end=sc.nextInt();
        for(i=start;i<=end;i++){
            System.out.println("5 x "+i+" = "+(5*i));
        }

    }
}
