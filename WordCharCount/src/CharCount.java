import java.util.Scanner;
public class CharCount{
    public void charCount(){
        String str;
        int len = 0;
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for(int i = 0; i <= str.length(); i++){
            len = i;
        }
        System.out.println("Length of the string will be : " + len);
    }
    public void wordCount(){
        String str;
        String[] count;
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        count = str.split("\\s+");
        System.out.println("Number of word are " + count.length);
    }
}

