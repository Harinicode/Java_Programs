import java.util.Scanner;
import java.lang.Math;
class Mymath
{
    
        void arithoper(int a,int b)
        {
            int sum=a+b;
            System.out.println("Addition of "+a+" and "+b+" = "+sum);
        }
        void arithoper(float a,float b)
        {
            float mul=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" = "+mul);
        }
        void arithoper(double base,double expo)
        {
            double power=Math.pow(base,expo);
            System.out.println(base+" To the power "+expo+" = "+power);
        }
};

class MDemo
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        Mymath m=new Mymath();
        System.out.println("Enter two numbers for addition\n");
        int a=ob.nextInt();
        int b=ob.nextInt();
        m.arithoper(a,b);
        System.out.println("Enter two float no.s for multiplication\n");
        float c=ob.nextFloat();
        float dd=ob.nextFloat();
        m.arithoper(c,dd);
         System.out.println("Enter two no.s to find power");
        double e=ob.nextDouble();
        double f=ob.nextDouble();
        m.arithoper(e,f);
        
    }
};
