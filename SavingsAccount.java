public class SavingsAccount {
    private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    public void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

       modifyInterestRate(0.04);
        System.out.println("Saver1 Monthly Interest: $" + saver1.calculateMonthlyInterest());
        System.out.println("Saver2 Monthly Interest: $" + saver2.calculateMonthlyInterest());
        System.out.println("Saver1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 Balance: $" + saver2.getSavingsBalance());

        modifyInterestRate(0.15);
        System.out.println("Saver1 Monthly Interest: $" + saver1.calculateMonthlyInterest());
        System.out.println("Saver2 Monthly Interest: $" + saver2.calculateMonthlyInterest());
        System.out.println("Saver1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 Balance: $" + saver2.getSavingsBalance());
    }
}



