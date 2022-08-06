import java.util.Scanner;
public class Circle {
    public  double radius=2;

    Circle()
    {

    }
    Circle(double h)
    {
        radius=h;
    }
    public double getarea()
    {
        return radius*radius*3.14;
    }
    public double getperimeter()
    {
        return 2*3.14*radius;
    }
    public static void main(String[] args)
    {
        Circle sc=new Circle();
        sc.getarea();

        double s;
        s=sc.getarea();
        System.out.println(s);

        double h;
        h=sc.getperimeter();
        System.out.println(h);

        Scanner w=new Scanner(System.in);
        double g=w.nextDouble();
        Circle sh=new Circle(g);

        System.out.println(sh.getarea());
        System.out.println(sh.getperimeter());
    }
}
