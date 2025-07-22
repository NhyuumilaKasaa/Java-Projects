import java.util.Scanner;

public class rockPaperScissorsGame{
    public static void main(String[] args){
         String userMove, computerMove;
         Scanner sc=new Scanner(System.in);

         computerMove="scissors";

         while(true){

             System.out.println("Enter your move: rock, paper, or scissors:");
             userMove=sc.nextLine();

            if(userMove.equals("scissors")){
                System.out.println("Again.");
            }
            else if(userMove.equals("rock")){
                System.out.println("You win.");
                break;
            }
            else if(userMove.equals("paper")){
                System.out.println("You lose.");
                break;
            }
         }
    }
}