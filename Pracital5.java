import java.util.Scanner;
public class Pracital5
{
    static int add(int a,int b)
    {
         int sum=a+b;
         return sum;
    }
    static float add(float s,float t)
    {
        float adding=s+t;
        return adding;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers you want to add");
        int cr=sc.nextInt();
        int tr=sc.nextInt();
        System.out.println("Enter floaters you want to add");
        float rs=sc.nextFloat();
        float es=sc.nextFloat();
        System.out.println(add(cr,tr));
        System.out.println(add(rs,es));
    }
}
