import java.util.*;
public class NoSquare {
    public static void main(String[] args) {
       int r=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to find Square");
        n=sc.nextInt();
        for (int i = 0; i < n; ++i) {
            r += n;
        }
        System.out.println("Square is "+r);
    }
}
