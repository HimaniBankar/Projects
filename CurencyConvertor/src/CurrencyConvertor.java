import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args){
        double amount;
        double rupee, dollar,pound, euro, yen;
        int choice;

        DecimalFormat f =new DecimalFormat("##.##");//This will round off all the digits in two digits

        System.out.println("Following are the choices: ");
        System.out.println("1. Rupee");
        System.out.println("2. Dollar");
        System.out.println("3. Pound");
        System.out.println("4. Euro");
        System.out.println("5. Yen");

        System.out.println("Choose the option of currency you want to convert : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.println("Choose the amount you want to convert : ");
        amount = sc.nextDouble();

        switch (choice){
            case 1: //rupee conversion
                dollar = amount/81.25;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar" );

                pound = amount/99.25;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound" );

                euro = amount/88;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro" );

                yen = amount/0.64;
                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen" );
                break;

            case 2: //dollar conversion
                dollar = amount/0.012;
                System.out.println(amount + " Dollar = " + f.format(dollar) + " Rupee" );

                pound = amount/1.22;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound" );

                euro = amount/1.08;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro" );

                yen = amount/0.0078;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen" );
                break;

            case 3: //pound conversion
                rupee = amount/0.010;
                System.out.println(amount + " Pound = " + f.format(rupee) + " Rupee" );

                dollar = amount/0.82;
                System.out.println(amount + " Pound = " + f.format(dollar) + " Dollar" );

                euro = amount/0.89;
                System.out.println(amount + " Pound = " + f.format(euro) + " Euro" );

                yen = amount/0.0064;
                System.out.println(amount + " Pound = " + f.format(yen) + " Yen" );
                break;

            case 4: //euro conversion
                rupee = amount/0.011;
                System.out.println(amount + " Euro = " + f.format(rupee) + " Rupee" );

                dollar = amount/0.92;
                System.out.println(amount + " Euro = " + f.format(dollar) + " Dollar" );

                pound = amount/1.13;
                System.out.println(amount + " Euro = " + f.format(pound) + " Pound" );

                yen = amount/0.0072;
                System.out.println(amount + " Euro = " + f.format(yen) + " Yen" );
                break;

            case 5: //yen conversion
                rupee = amount/0.64;
                System.out.println(amount + " Yen = " + f.format(rupee) + " Rupee" );

                dollar = amount/0.0078;
                System.out.println(amount + " Yen = " + f.format(dollar) + " Dollar" );

                pound = amount/0.0064;
                System.out.println(amount + " Yen = " + f.format(pound) + " Pound" );

                euro = amount/0.0072;
                System.out.println(amount + " Yen = " + f.format(euro) + " Euro" );
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}
