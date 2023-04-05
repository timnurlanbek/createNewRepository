package constructor2;

public class BankAccount2 {

    String accountNumber, accountHolderName;

    double balance, interestRate, overdraftLimit;

    // -----------------------------------------------------

    public BankAccount2 (){
        accountHolderName = "Unknown";
        accountNumber = "none";
        balance = 0;
        interestRate = 0;
        overdraftLimit = 0;


    }
    // ========================================================



    public BankAccount2(String accountHolderName, String accountNumber, double balance, double interestRate, double overdraftLimit){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }


    public BankAccount2 (BankAccount2 other){
        this.accountHolderName = other.accountHolderName;
        this.accountNumber = other.accountNumber;
        this.balance = other.balance;
        this.interestRate = other.interestRate;
        this.overdraftLimit = other.overdraftLimit;

    }


    //---------------------------------------------------------------------

    public String getAccountNumber (){
        return accountNumber;
    }

    public String getAccountHolderName (){
        return accountHolderName;
    }


    public double getBalance () {
        return balance;
    }


    public double getInterestRate (){
        return interestRate;
    }

    public double getOverdraftLimit (){
        return overdraftLimit;
    }

    // --


    public void deposit (double add){
         balance += add;
    }

    public void withdraw (double withdraw){
        if (balance - withdraw < overdraftLimit){
            System.out.println("Error: The withdrawal of this amount is not allowed");
        }
        else balance-= withdraw;
    }

    /*
    A method named "calculateInterest" that calculates
     and returns the interest earned on the balance based on the interest rate.
     */

    public double calculateInterest (){
        return balance/ 100 * interestRate;
    }

    // --

    /*
    A method named "getDetails" that returns a string with the
    account number, account holder's name, balance, interest rate, and overdraft limit.
     */

    public String getDetails (){
        String info = "Account Holder Name: " + accountHolderName
                + "Account Number: " + accountNumber
                + "Balance: " + balance
                + "Interest Rate: " + interestRate
                + "Overdraft Limit: " + overdraftLimit;
        return info;
    }


    public static void main(String[] args) {


    }


}
