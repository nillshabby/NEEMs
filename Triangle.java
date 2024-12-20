public class Triangle{
    private int a;
    private int b;
    private int c;
    public Triangle(int newa, int newb, int newc){
        this.a=newa;
        this.b=newb;
        this.c=newc;
        }

    public boolean isTriangle(){
        return(a>0 && b>0 && c>0 && (a+b > c) && (a+c > b) && (b+c > a));}
    
    public double getArea(){
        return(1/2*(a*b));}
    



    public static void main(String[] args){
        Triangle T1=new Triangle(12,8,6);
        System.out.println("The Area is"+T1.getArea());
    }
}

















/*87.	Define a class called Triangle with three integer data members a, b, and c as the
 lengths of its three edges. This class should have the following methods:
(a)	a constructor with 3 parameters representing the 3 edges
(b)	a method isTriangle() which returns true if the 3 edges are 
all positive and they satisfy thetriangle inequality where a+b > c, a+c > b, b+c > a.
(c)	a method getArea() which returns the area of triangle. 
NB: Area=1/2(a*b) The signature of these methods are given below:
public Triangle(int newa, int newb, int newc) public boolean isTriangle() public double getArea()
Note: getAngle() should return zero if the triangle is not really a triangle.*/


