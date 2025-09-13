import java.util.Scanner;

interface  Operations {
    void add(double a,double b);
    void sub(double a,double b);
    void product(double a,double b);
    void division(double a,double b);
}

class Calculator implements Operations{
   

    public void add(double a,double b){
        double result = a+b;
        System.out.println("Result of Addition is: " + result);
    }

    public void sub(double a,double b){
        double result = a-b;
        System.out.println("Result of Subtraction is: " + result);
    }

    public void product(double a,double b){
        double result = a*b;
        System.out.println("Result of Produvt is: " + result);
    }

    public void division(double a,double b){
        if (b!=0){
            double result = a/b;
            System.out.println("Result of Division is: " + result);
        }
        else {
            System.out.println("Cannot divisible by Zero!");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations c = new Calculator();
        System.out.println("Enter Number 1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Number 2: ");
        double num2 = sc.nextDouble();
        int choice;

        do {
            System.out.println("=====MENU======");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice!");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    c.add(num1,num2);
                    break;
                case 2:
                    c.sub(num1,num2);
                    break;
                case 3:
                    c.product(num1,num2);
                    break;
                case 4:
                    c.division(num1,num2);
                    break;
                case 5:
                    System.out.println("Thanks for using Calculator!");
                    break;
                default:
                    System.out.println("Invalid choice Try Again!");
                    break;
            }
        }while(choice!=5);
        sc.close();
    }
}
