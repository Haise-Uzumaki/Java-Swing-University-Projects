class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHOlderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    void showDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
    }
}
