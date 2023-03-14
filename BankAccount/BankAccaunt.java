package BankAccount;

public class BankAccaunt {
    String accountNumber;
    String accountHolderName;
    double balance;

    double dailyWithdrawedAmount;
    double dailyWithdrawLimit = 5000;

    public void deposit(double amount){
        balance += amount;
        System.out.println("INFO: " + accountHolderName + " " +
                "successfully deposited " + amount + "$");
    }

    public void setAccountNumber(String accountNumber){
        boolean isValidAccountNumber = true;
        if (accountNumber.length() == 8){
                 // by default is true
            for (int i = 0; i < 8; i++){
                if (Character.isDigit(accountNumber.charAt(i))){
                    System.out.println("WARNING: The account number must only contain digits.");
                    isValidAccountNumber = false;
                }
            }
        }
        else{
            System.out.println("WARNING:  The length of account number must be 8");
            isValidAccountNumber = false;

        }
        // log = is a message for developer and user, what is going on in application.

        if (isValidAccountNumber){
            System.out.println("Great, account number is valid!");
            this.accountNumber = accountNumber;
        }
        else {
            System.out.println("Failure:");
        }
    }


    public boolean withdraw(double amount)
    {
    /*
    1. user must not be able to withdraw more money than he has in the balance
    2. the amount should be positive number
    3. check that user did not exceed the dailyLimit
     */


        if (amount > 0 && amount <= balance &&
                amount <= dailyWithdrawLimit &&
                dailyWithdrawedAmount + amount <= dailyWithdrawLimit) {

            System.out.println("Transaction is approved. Withdrawing: " + amount + "$");
            balance -= amount;
            dailyWithdrawedAmount += amount;
            return true;
        }else{
            if (amount > dailyWithdrawLimit || dailyWithdrawedAmount + amount > dailyWithdrawLimit) {
                System.out.println("The daily withdrawal limit should not exceed 5000$");
                System.out.println("You already withdrawed " + dailyWithdrawedAmount);
                return false;
            }
            if (amount > balance){
                System.out.println("Insufficient funds");
                return false;
            }

            System.out.println("Something happened! Failed to withdraw. Please try again");
            return false;
        }

    }


    public String getAccountNumber(){
        return accountNumber;
    }


    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountNumberName){

        boolean isValidAccountHolderName = true;

        if (accountHolderName.equals(null) || accountHolderName.isEmpty() || accountHolderName.trim().length() == 0 ||
                accountHolderName.length() > 256) {
            isValidAccountHolderName = false;

        }

        if (isValidAccountHolderName){
            System.out.println("SUCCESS: Account holder name is valid");
        }
        else {
            System.out.println("FAILURE: Account holder name must not be empty or more than 256 letters");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void printInfro(){
        String str = "Account holder's name: " + accountHolderName + "\n" +
                "Account number: " + accountNumber + "\n" +
                "Current balance: " + balance + "\n" +
                "Today withdrawed: " + dailyWithdrawedAmount + "$";
        System.out.println(str);
    }



}
