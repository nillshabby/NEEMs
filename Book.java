public class Book{
    private String bookname;
    private int ISBN;
    private String author;
    private String publisher;
    public Book(String bookname,int ISBN,String author,String publisher){
        this.bookname=bookname;
        this.ISBN=ISBN;
        this.author=author;
        this.publisher=publisher;
    }
    public void setName(String name){
        this.bookname=bookname;}
    public String getName(){
        return bookname;}
    public void setISBN(int ISBN){
        this.ISBN=ISBN;}
    public int getISBN(){
        return ISBN;}
    public void setauthor(String author){
        this.author=author;}
    public String getauthor(){
        return author;}
    public void setPublisher(String publisher){
        this.publisher=publisher;}
    public String getpublisher(){
        return publisher;}

    public String getBookInfo(){
        return "Name:"+bookname+",ISBN:"+ISBN+",Author:"+author+",Publisher:"+publisher;
    }
    public static void main(String[] args){
        Book[] books=new Book[30];
        books[0] =new Book("java basics",123345900,"John Doe","nill wise");
        System.out.println(books[0].getBookInfo());
    }

    }

    
    




















/*9.	Create a class called Book to represent a book. A Book should include four pieces of information as 
instance variables‐a book name, an ISBN number, an author name and a publisher.
Your class should have a constructor that initializes the four instance variables.
Provide a mutator method and accessor method (query method) for each instance variable. 
Inaddition, 
provide a method named getBookInfo that returns the description of the book as a String
(the description should include all the information about the book). You should use this keyword in member methods and constructor. 
 Write a test application named BookTest to create an array of object for 30 elements 
for class Book to demonstrate the class Book's capabilities.*/
