     class Account {
    int accountNumber;
    String holderName;

    Account(int no, String name) {
        accountNumber = no;
        holderName = name;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    double balance;

    SavingsAccount(int no, String name, double rate, double bal) {
        super(no, name);
        interestRate = rate;
        balance = bal;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        display();
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Jyoti", 5, 10000);
        s.calculateInterest();
    }
}
    

