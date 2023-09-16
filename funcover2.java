import java.util.Scanner;
import java.lang.Math;
class Shape
{
         void area(int a)
        {
            int ar=a*a;
            System.out.println("Area of square ="+ar);
        }
        void area(float a,float b)
        {
            float ar=a*b;
            System.out.println("Area of rectangle ="+ar);
        }
       
        void area(double a)
        {
            double ar=3.142*a*a;
            System.out.println("Area of circle ="+ar);
        }
        void area(double a,double b,double c)
        {
            double s=(a+b+c)/2;
            double ar=(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
            System.out.println("Area of triangle ="+ar);
        }
};

class SDemo
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        Shape s=new Shape();
        
        int choice=1;
        while(choice==1)
        {
            System.out.println("Enter the choice \n1.Square\n2.Rectangle\n3.Circle\n4.Triangle\n");
           int n=ob.nextInt();
        switch(n)
        {
            case 1:System.out.println("Enter n value");             
                   int a=ob.nextInt();
                   s.area(a);
                   break;
            case 2:System.out.println("Enter two values"); 
                   float c=ob.nextFloat();
                   float d=ob.nextFloat();
                   s.area(c,d);
                   break;
            case 3:System.out.println("Enter n value"); 
                   double e=ob.nextDouble();
                   s.area(e);
                   break;
            case 4:System.out.println("Enter three values"); 
                  double aa=ob.nextDouble();
                  double bb=ob.nextDouble();
                  double cc=ob.nextDouble();
                   s.area(aa,bb,cc);
                   break;
            default:System.out.println("Invalid choice"); 
      }
      System.out.println("Enter 1 to continue else enter any other no.");
         choice=ob.nextInt();
     }
    }
};
