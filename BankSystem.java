
// Bank Account Simulation
class BankAccount{
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double iniBalance){
        this.accountNumber = accountNumber;
        this.balance = iniBalance;
    }
public void deposit(double amount){
    if (amount > 0){
        balance += amount;
        System.out.println("Deposited : $" + balance);
    } else{
        System.out.println("Invalid Deposit Amount!");
    }
}
public void withdraw( double amount){
    if (amount <= balance){
        balance -= amount;
        System.out.println("Withdrawn : $" + amount);
    }else{
        System.out.println("Insufficient balance or invalid amount.");
    }
}
public String getAccNumber(){
    return this.accountNumber;
}
public double getBalance(){
    return this.balance;
}
}
// sub-class for savings account
class savingsAccount extends BankAccount{
    private double interestRate;
    private static final double MIN_BALANCE = 1000 ;

public savingsAccount(String accountNumber, double iniBalance, double interestRate){
    super(accountNumber, iniBalance);
    this.interestRate = interestRate;
}
@Override
public void withdraw(double amount){
    if (getBalance() - amount < MIN_BALANCE) {
        System.out.println("Withdrawal denied!!... Balance cannot fall below: $" + MIN_BALANCE);
    }else{
    super.withdraw(amount);
}
} 

public void addInterest(){
    double interest = getBalance() * interestRate / 100;
    deposit(interest);
    System.out.println("Interest added: $" + interest);
}
public double getInterestRate(){
    return interestRate;
}
}
// account creation, deposit, interest addition, and controlled withdrawal.
public class BankSystem{
    public static void main(String[] args){
        savingsAccount myAcc = new savingsAccount("125N60", 2000.00, 2.5);
        System.out.println("Initial Balance: $" + myAcc.getBalance());

        myAcc.deposit(500);
        myAcc.addInterest();
        myAcc.withdraw(1200);
        /* Since 2500 - 1200 = 1300, withdrawing 800 from it would make the balance 500. Which is not permitted so the code below should give error or "invalid" outpud*/ 
        myAcc.withdraw(800);
        System.out.println("Final balance for Account "+ myAcc.getAccNumber()+" is : $"+ myAcc.getBalance());
    }
}