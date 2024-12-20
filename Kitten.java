public class Kitten{
    private String name;
    private String owner;
    private int age;
    public Kitten(String name,String owner,int age){
        this.name=name;
        this.owner=owner;
        this.age=age;
        age=0;
}
public int getAge(){
    return age;}

public int getHaveBirthday(){
    return 1+age;}

public void Displaytostring(){
    System.out.println(name+" "+" is"+" "+age+" "+"years old"+" "+ "and belongs to"+" "+owner);}

public static void main(String[] args){
    Kitten Kit1=new Kitten("Manunu","Wema",15);
    Kit1.Displaytostring();}
}



















/*6.	Create a class called Kitten that has three fields: String name, 
String owner, and int age. Create a constructor for Kitten that takes a String name and 
owner for the Kitten and uses them for initialization. Have the age for a Kitten start at 0;
 Implement a method for age which return a Kitten’s age.
  Implement a method called haveBirthday that does not return anything and 
  simply increases a Kitten’s age by one. Finally, write a method called
   toString that returns a string of the form: ”<Kitten name> is <age> and belongs to <Owner name>”
e.g. ”Bob is 87 and belongs to Gregor Samsa”.
 Create an object which initialize three data members and print out the string above.*/
