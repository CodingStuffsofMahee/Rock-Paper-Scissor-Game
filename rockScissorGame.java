package rockSicissorGame;

import java.util.Random;
import java.util.Scanner;

public class rockScissorGame {
    public static Scanner scan=new Scanner(System.in);
    //Rock Scissor And Paper Game
    protected static void  type1(){
        int paper=2,rock=1,scissor=0;
        System.out.println("0-->Scissor\n" +
                "1-->Rock\n" +
                "2-->Paper\n" +
                "Enter your choice (in numbrs):-");
        Random random=new Random();
        //Generating the PC Choice
        int ranLimit= random.nextInt(4);
        //Entering the User's Choice
        int enteredValue= scan.nextInt();
        if (enteredValue == ranLimit){
            System.out.println("Draw");
        }
        //Winning Possibilities of Computer
        else if (enteredValue==paper && ranLimit==scissor || enteredValue==scissor && ranLimit==rock || enteredValue==rock && ranLimit==paper){
            System.out.println("PC Wins");

        }
        //Winning Possibilities of User
        else if (enteredValue==rock && ranLimit==scissor || enteredValue==paper && ranLimit==rock || enteredValue==scissor && ranLimit==paper){
            System.out.println("User Wins");
        }
    }
    protected static void  type2(){
        String paper="paper",rock="rock",scissor="scissor";
        System.out.println("Scissor\n" +
                "Rock\n" +
                "Paper\n" +
                "Enter your choice (Case doesn't matter):-");
        Random random=new Random();
        //Generating the PC Choice
        int ranLimit= random.nextInt(4);
        //Entering the User's Choice
        scan.nextLine();
        String enteredValue= scan.nextLine();
        String[] userValue={"rock","paper","scissor"};
        if (enteredValue.toLowerCase().equals(userValue[ranLimit])){
            System.out.println("Draw");
        }
        //Winning Possibilities of Computer
        else if (enteredValue.toLowerCase().equals(paper) && userValue[ranLimit].equals(scissor) || enteredValue.toLowerCase().equals(scissor) && userValue[ranLimit].equals(rock) || enteredValue.toLowerCase().equals(rock) && userValue[ranLimit].equals(paper)){
            System.out.println("PC Wins");

        }
        //Winning Possibilities of User
        else if (enteredValue.toLowerCase().equals(rock) && userValue[ranLimit].equals(scissor) || enteredValue.toLowerCase().equals(paper) && userValue[ranLimit].equals(rock) || enteredValue.toLowerCase().equals(scissor) && userValue[ranLimit].equals(paper)){
            System.out.println("User Wins");
        }
    }
    public static void main(String[] args) {
        /*Types of game of Rock Paper and Scissor
        Type1-->Number as Input
        Type2-->String as Input
        */
        System.out.println("How Will you like to play\n" +
                "1-->Number as Input\n" +
                "2-->String as Input\n" +
                "Enter the choice:-");
        int gameTypeValue=scan.nextInt();
        if (gameTypeValue==1){
            type1();
        }else if (gameTypeValue==2){
            type2();
        }
    }
}
