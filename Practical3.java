
import java.util.Scanner;
public class Practical3 {
    public String id;
    public int balance = 300;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practical3[] str = new Practical3[12];

        for (int i = 1; i < 11; i++) {
            str[i] = new Practical3();

            if (i <= 9) {
                str[i].id = ("AC00" + i);
                System.out.println(str[i].id);

            } else {
                str[i].id = ("AC0" + i);
                System.out.println(str[i].id);
            }

        }
        int flag = 0;
        int i;
        do {
            String a = "";


            a = sc.next();
            System.out.println(a);
            for (i = 1; i < 11; i++) {
                if (a.equals(str[i].id)) {
                    flag = 1;
                    break;
                }

            }
        } while (flag != 1);


        System.out.println("A:Balance Inquiry: ");
        System.out.println("B:Withdraw money:");
        System.out.println("C:Deposit money:");
        System.out.println("D:Money Transfer:");
        System.out.println("E:Create Account:");
        System.out.println("F:Deactivate account:");
        System.out.println("G:Exit:");

        String alphabet = "";
        int sh=2;

        do {
            alphabet = sc.next();

            switch (alphabet) {
                case "A": {
                    System.out.println(str[i].balance);
                    sh=1;
                    break;
                }
                case "B": {
                    //Scanner sc= new Scanner(System.in);
                    int get = sc.nextInt();
                    System.out.println("Initial balance " + str[i].balance);
                    str[i].balance = str[i].balance - get;
                    System.out.println("Amount to be withdrawn " + get);
                    System.out.println("After withdrawal balance " + str[i].balance);
                    sh=1;
                    break;
                }
                case "C":
                {
                    // Scanner sc= new Scanner(System.in);
                    int put = sc.nextInt();
                    System.out.println("Initial balance " + str[i].balance);
                    str[i].balance = str[i].balance + put;
                    System.out.println("Amount to be deposited " + put);
                    System.out.println("After deposition balance " + str[i].balance);
                    sh=1;
                    break;
                }
                case "D":
                {
                    // Scanner sc = new Scanner(System.in);
                    System.out.println("Amount to be transfered:");
                    int mt = sc.nextInt();
                    System.out.println("Amount to be transfered into which account :");
                    int h = sc.nextInt(); // 2
                    System.out.println(str[h].balance);
                    str[h].balance = str[h].balance + mt;
                    System.out.println("After transfering balance" + str[h].balance);
                    sh=1;
                    break;
                }
                case "E":
                {
                    str[11] = new Practical3();
                    str[11].id="AC011";
                    System.out.println("your new account no. is "+str[11].id+" with initial balance" + str[11].balance);
                    sh=1;
                    break;
                }
                case "F":
                {
                    System.out.println("Enter the account no. that you want to deactivate:");
                    str[i].balance = 0;
                    System.out.println(str[i].balance);
                    sh=1;
                    break;
                }
                case "G":
                {
                    System.out.println("ok");
                    sh=0;
                }
            }
        } while (sh!=0);
    }
}
