import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame{
    public static void main(String[] args){

    Random rand = new Random();
    int rn=rand.nextInt(100)+1;

    int n;
    Scanner sc=new Scanner(System.in);

    while(true){

    System.out.println("Enter a guess:");
    n=sc.nextInt();

    if(n==rn){
        System.out.println("Correct.");
        break;
    }
    else if(n>rn){
        System.out.println("The number is greater.");
    }
    else{
        System.out.println("The number is smaller.");
    }
    }
    }
}
