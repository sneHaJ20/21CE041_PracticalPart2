//This code is prepared by 21CE041_SnehaJadeja.
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Scanner;
public class Account {
    
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 0.07;
    private Date dateCreated;
    Account()
    {

    }
    Account(int s,double h)
    {
        id=s;
        balance=h;
    }
    void getdata(int r,double e,double f)
    {
        id=r;
        balance= e;
        annualInterestRate= f;
    }
    void putdata()
    {
        System.out.println(id);
        System.out.println(balance);
        System.out.println(annualInterestRate);
    }
    void  getdate()
    {
        Date sn= new Date();
        SimpleDateFormat form= new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(form.format(sn));
    }
    double getMonthlyInterestRate()
    {
       return ((annualInterestRate/12) );
    }
    double getannualInterestrate()
    {
        return ((annualInterestRate/12) * balance);
    }
    void withdraw()
    {
        Scanner sc= new Scanner(System.in);
        int get=sc.nextInt();
        System.out.println("Initial balance " +balance);
        balance=balance-get;
        System.out.println("Amount to be withdrawn " +get);
        System.out.println("After withdrawal balance " +balance);
    }
    void deposit()
    {
        Scanner sc= new Scanner(System.in);
        int put=sc.nextInt();
        System.out.println("Initial balance " +balance);
        balance=balance+put;
        System.out.println("Amount to be deposited " +put);
        System.out.println("After deposition balance " +balance);
    }
    public static void main(String[] args)
    {
        Account ha= new Account();
        ha.getdate();

        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        ha.getdata(a,b,c);
        ha.putdata();

        double h;
        h=ha.getMonthlyInterestRate();
        System.out.println(h);

        double s;
        s= ha.getannualInterestrate();
        System.out.println(s);

        ha.withdraw();
        ha.deposit();
    }
}
