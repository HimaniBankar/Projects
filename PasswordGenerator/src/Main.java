import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of passwords you want to create : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the number of characters you want in the password : ");
        int length = sc.nextInt();

        String[] randomPasswords = new String[number];

        for (int i = 0; i < number; i++){
            String randomPassword = "";
            for(int j = 0; j < length; j++){
                randomPassword = randomPassword + randomCharacter();
            }
            randomPasswords[i] = randomPassword;
        }
        printPass(randomPasswords);
        //System.out.println(Arrays.toString(randomPasswords));
    }
    public static void printPass(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static char randomCharacter(){
        //0-9 == 48-57 in ascii 10
        //A-Z == 65-90 in ascii 26
        //a-z == 97-122 in ascii 26
        //total 62 combinations

        int rand = (int)(Math.random()*62);
        if(rand <= 9){
            //0-9 == 48-57
            int ascii = rand + 48; //48-0
            return (char)(ascii);
        }
        else if(rand <= 35){
            //A-Z == 65-90
            int ascii = rand + 55; //65-10
            return (char)(ascii);
        }
        else{
            //a-z == 97-122
            int ascii = rand + 61; //97-36
            return (char)(ascii);
        }
    }
}