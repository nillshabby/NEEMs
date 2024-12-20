public class Employee{
    private String Firstname;
    private String Lastname;
    private int Monthlysalary;
    public Employee(String Firstname,String Lastname,int Monthlysalary){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.Monthlysalary=Monthlysalary;
        if(Monthlysalary>0){
        Monthlysalary=0;}
    }
    public int getYearlysalary(){
      return 12*Monthlysalary;}
    public static void main(String[] args){
        Employee Employee1=new Employee("AMINA","PONGWE",790000);
        Employee Employee2=new Employee("SUMAIYA","JUMA",2000000);
    System.out.println("The AMINA'S SALARY IS"+" "+Employee1.getYearlysalary());
    System.out.println("The SUMAIYYA'S SALARY IS"+" "+Employee2.getYearlysalary());
    }
    }

z



















/* (Employee Class) Create a class called Employee that includes three pieces of information
as data members a first name (type string), a last name (type string) and a monthly salary
(type int). Your class should have a constructor that initializes the three data members. If
the monthly salary is not positive, set it to 0. Write a test program that demonstrates class
Employee's capabilities. Create two Employee objects and display each object's yearly
salary. Then give each Employee a 10 percent raise and display each Employee's yearly
salary again.*/