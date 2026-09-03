import java.util.Random;
import java.util.Scanner;

public class RandomGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for rock ,1 for paper ,2 for scissor");
        int userInput =sc.nextInt();
        Random random=new Random();
        int computerInput=random.nextInt();
        if(userInput==computerInput){
            System.out.println("Drew");
        } else if (userInput==0 && computerInput==2 || userInput==2 && computerInput==1) {
            System.out.println("ypu are win");

        }
        else{
            System.out.println("computer win");

    }
        if (computerInput==0){
            System.out.println("computer choice rock paper");
        } else if (computerInput==1) {
            System.out.println("computer choice paper ");

        } else if (computerInput==2) {
            System.out.println("computer choice scissor");

        }
    }
}
