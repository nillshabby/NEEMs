public class Account{
    private int AccountBalance;
    public Account(int initialBalance){
        if(initialBalance>=0){
        AccountBalance=initialBalance;}
        else{
        AccountBalance=0;
        System.out.println("The initial balance is invalid");}
        }
    public double credit(int Amount){
        AccountBalance=AccountBalance+Amount;
        return AccountBalance;
    }
    public double debit(int Amount){
        if(Amount>AccountBalance){
            System.out.println("Debit Amount exceeds AccountBalance");}
        else{
            AccountBalance=AccountBalance-Amount;}
            return AccountBalance;
            }
    public int getBalance(){
        return AccountBalance;
    }
    public static void main(String[] args){
        Account Account1=new Account(8900000);
        Account1.credit(180000);
        System.out.println("The AMOUNT AFTER CREDIT"+" "+Account1.getBalance()); 
        Account1.debit(80000);
        System.out.println("The AMOUNT AFTER WITHDRAW IS"+" "+Account1.getBalance());
    }
        }
    
    

























/*(Account Class) Create a class called Account that a bank might use to represent
customers' bank accounts. Your class should include one data member of type int to
represent the account balance. Your class should provide a constructor that receives an
initial balance and uses it to initialize the data member. The constructor should validate
the initial balance to ensure that it is greater than or equal to 0. If not, the balance should
be set to 0 and the constructor should display an error message, indicating that the initial
balance was invalid. The class should provide three member functions. Member function
credit should add an amount to the current balance. Member function debit should
withdraw money from the Account and should ensure that the debit amount does not
exceed the Account's balance. If it does, the balance should be left unchanged and the
function should print a message indicating "Debit amount exceeded account balance."
Member function getBalance should return the current balance. Create a program that
creates two Account objects and tests the member functions of class Account.*/