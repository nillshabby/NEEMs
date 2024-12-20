public class Rectangle{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        setLength(length);
        setWidth(width);

    }

    public void setLength(double length){
        if(length>0.0 &&length<=20.0)
          this.length=length;
          else
            this.length=1.0;}
          
    public double getLength(){
        return length;}

    public void setWidth(double width){
        if(width>0.0 &&width<=20.0)
           this.width=width;
          else
            width=1.0;}
    public double getWidth(){
        return width;}
    public double getArea(){
        return length*width;}
    public double getPerimiter(){
        return 2*(length+width);}
    
    public static void main(String[] args){
        Rectangle rec=new Rectangle(15,8);
        System.out.println("The width is"+":"+rec.getWidth());
        System.out.println("The length is"+":"+rec.getLength());
        System.out.println("The Area is"+":"+rec.getArea());
        System.out.println("The Perimeter is"+":"+rec.getPerimiter());
        }
    
}

    




















/*(Rectangle Class) Create a class Rectangle with attributes length and width. Provide
member functions that calculate the perimeter and the area of the rectangle*/