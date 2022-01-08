import java.util.Scanner;
public class CalculateBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Units Consumed ");
        int units=sc.nextInt();            //for getting input from user
        if(units<=50){
            System.out.println("Your Electricity bill is : "+units*10);
        }
        else if(units>49&&units<=100){
            System.out.println("Your Electricity bill is : "+units*15);
        }
        else if(units>100&&units<=200){
            System.out.println("Your Electricity bill is : "+units*20);
        }
        else if(units>200&&units<=300){
            System.out.println("Your Electricity bill is : "+units*25);
        }
        else
        {
            System.out.println("Your Electricity bill is : "+units*30);
        }
    }
}
