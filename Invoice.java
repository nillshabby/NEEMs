public class Invoice{
    private String number;
    private String description;
    private int quantity;
    private int price;
    public Invoice(String number,String description,int quantity,int price){
        this.number=number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
    }
    public void setInvoiceamount(int quantity,int price){
        if(quantity>0 && price>0);
        this.quantity=0;
        this.price=0;}
    
    public int getInvoiceamount(){
        return quantity*price;}
    public static void main(String[] args){
        Invoice inv=new Invoice("002","juice boxes",95,4500);
        System.out.println("The Amount is"+":"+inv.getInvoiceamount()+""+"Tzs");

    }

}





















/* (Invoice Class) Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four pieces of
information as data members a part number (type string), a part description (type string),
a quantity of the item being purchased (type int) and a price per item (type int). Your class
should have a constructor that initializes the four data members. In addition, provide a
member function named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as an int value. If
the quantity is not positive, it should be set to 0. If the price per item is not positive, it
should be set to 0. Write a test program that demonstrates class Invoice's capabilities.*/