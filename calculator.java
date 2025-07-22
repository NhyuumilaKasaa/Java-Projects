import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        int operator, n1, n2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        n1=sc.nextInt();

        System.out.println("Enter another number:");
        n2=sc.nextInt();

        System.out.println("Choose Operator:");
        System.out.println("1-Add \n 2-Subtract \n 3-Multiply \n 4-Divide \n");
        operator=sc.nextInt();

        int result = 0;
        switch(operator){
            case 1:
            result=n1+n2;
            break;

            case 2:
            result=n1-n2;
            break;

            case 3:
            result=n1*n2;
            break;

            case 4:
            result=n1/n2;
            break;

            default:
            System.out.println("Invalid operator.");
        }
        System.out.println("Result: " + result);
    }
}
