import java.util.Scanner;

public class Loop_result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int num=sc.nextInt();
        if(num>=1){
            double aggregate=0;
            System.out.println("Welcome to result calculator");
            for(int i=1;i<=num;i++){
                System.out.println("Enter the marks of the subject");
                double marks=sc.nextDouble();
                System.out.println("Enter total marks");
                double total_marks=sc.nextDouble();
                double percentage=(marks/total_marks)*100;
                aggregate+=percentage;
            }
            double avg=aggregate/num;
            if(avg>=0 && avg<=100 ){
                if(avg>=90 && avg<=100){
                    System.out.println("A+");
                } else if (avg>=80 && avg<90) {
                    System.out.println("A");
                } else if (avg>=70 && avg<80) {
                    System.out.println("B+");
                } else if (avg>=60 && avg<70) {
                    System.out.println("B");
                } else if (avg>=50 && avg<60) {
                    System.out.println("C+");
                } else if (avg>=40 && avg<50) {
                    System.out.println("C");
                } else if (avg>=35 && avg<40) {
                    System.out.println("D");
                } else if (avg>=0 && avg<35) {
                    System.out.println("NG");
                }

            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
