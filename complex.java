import java.util.*;
import java.lang.Math;
import java.io.*;
    
class Complex_op
{
  int real,imag;
  public Complex_op(){}
  public Complex_op(int real,int imag)
  {
      this.real=real;
      this.imag=imag;
  }
 

  public Complex_op Addnumbers(Complex_op x)
  {
      Complex_op temp = new Complex_op();
      temp.real= (this.real + x.real);
      temp.imag= (this.imag + x.imag);
      return temp;
      
  }

  public Complex_op Subnumbers(Complex_op x)
  {
      Complex_op temp = new Complex_op();
      temp.real= (this.real - x.real);
      temp.imag= (this.imag - x.imag);
      return temp;
      
  }
  
  public Complex_op Mulnumbers(Complex_op x)
  {
    Complex_op temp = new Complex_op();
    temp.real=(this.real*x.real)+(this.imag*x.imag);
    temp.imag=(this.real*x.imag)+(this.imag*x.real);
    return temp;
  }
  public Complex_op Divnumbers(Complex_op x)
  {
    Complex_op temp = new Complex_op();
      int deno=(x.real*x.real + x.imag*x.imag);
      temp.real=(this.real*x.real + this.imag*x.imag)/deno;
      temp.imag=(x.real*this.imag-this.real*x.imag)/deno;
      return temp;
  }
 
}// end of class

public class complex
{
public static void main(String args[])
{
    
    Scanner s= new Scanner(System.in);
    int x1real,x1imag,x2real,x2imag;
    System.out.println("Enter the real and imaginary values of the 1st number");
    x1real= s.nextInt();
    x1imag= s.nextInt();
    System.out.println("Enter the real and imaginary values of the 2nd number");
    x2real= s.nextInt();
    x2imag= s.nextInt();
    int ch;
    Complex_op x1= new Complex_op(x1real,x1imag);
    Complex_op x2= new Complex_op(x2real,x2imag);
System.out.println(x1.real +" + "+x1.imag+"i");
System.out.println(x2.real + " + "+x2.imag+"i");

            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Choose ur choice:");
            ch = s.nextInt();
            switch(ch)
            {
                case 1:
                    Complex_op  sum= x1.Addnumbers(x2);
                    System.out.println(sum.real+" + "+ sum.imag+ "i");
                    break;
                case 2:
                    Complex_op sub= x1.Subnumbers(x2);
                    System.out.println(sub.real+ " + "+ sub.imag+"i");;
                    break;
                case 3:
                    Complex_op mul= x1.Mulnumbers(x2);
                    System.out.println(mul.real+ " + "+ mul.imag+ "i");;
                    break;
                case 4:
                    Complex_op div= x1.Divnumbers(x2);
                    System.out.println(div.real+ " + "+ div.imag+ "i");;
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        
        
    }
}