import java.util.Scanner;

public class NumberGuess {
    private int NUM_OF_GUESS = 5;
    private int number;
    private int input;

    public void numGuess(){
        System.out.println("------This is a number guessing game------"+
                            "\n------You have to guess the number between 1 to 20------"+
                            "\n------You can guess the number 5 times------");
        number = 1 + (int)(20 * Math.random());

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < NUM_OF_GUESS; i++){
                System.out.println("Enter the Number : ");
                input = sc.nextInt();
                if(input > 20 || input < 1){
                    System.out.println("Invalid Input.");
                }
                if(number > input && i != NUM_OF_GUESS-1){
                    System.out.println("Correct number is greater than the input.");
                }
                else if(number < input && i != NUM_OF_GUESS-1){
                    System.out.println("Correct number is lesser than the input.");
                }
                else if(number == input) {
                    System.out.println("YOU WON!!");
                    break;
                }
                else
                    System.out.println("YOU LOSE.."+
                                        "\nThe Correct number was : "+ number);
        }

    }
}
