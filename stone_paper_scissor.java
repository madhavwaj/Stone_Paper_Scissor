import java.util.Random;
import java.util.Scanner;
public class stone_paper_scissor {
    public static void main(String args[]){
//        0 for rock
//          1 for paper
//          2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt();

        if (userInput == computerInput){
            System.out.println("draw");

        }

         else if(userInput==0 && computerInput==2 || userInput ==1 && computerInput==0 || userInput == 2 && computerInput == 1)

        {
            System.out.println("you win");
        }

          else{
            System.out.println("Computerwins");
        }
        }
    }
