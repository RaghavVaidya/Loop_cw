import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("There are three dishes available; enter the number of dishes you would like to order");
        int a=sc.nextInt();
        int total_bill=0;
        int price=0;
        if(a>=1 && a<=3){
            for(int i=1;i<=a;i++){
                System.out.println("Enter your first item");
                System.out.println("Enter 1 and you get Mo:Mo");
                System.out.println("Enter 2 and you get pizza");
                System.out.println("Enter 3 and you get Nachos");
                int num=sc.nextInt();
                System.out.println("Enter the quantity");
                int quan=sc.nextInt();
                if(num==1){
                    price=150;
                    System.out.println("Momo Rs"+quan);
                } else if(num==2){
                    price=200;
                    System.out.println("Pizza Rs"+quan);
                } else if(num==3){
                    price=250;
                    System.out.println("Nachos Rs"+quan);
                }
                total_bill+=price*quan;
            }
            int final_bill=(13/100)*total_bill+total_bill-(10/100)*total_bill;
            System.out.println("The final bill with VAT and 10 percent discount is "+final_bill);
        } else if (a==0) {
            System.out.println("We hope we could be at your service in the future");
        }else{
            System.out.println("Invalid input");
        }

    }
}
