package labs;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("465329874", 1000.50);
        BankAccount acc2 = new BankAccount("463987861", 2000);
        BankAccount acc3 = new BankAccount("7908743245", 3000.75);
        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.payBill(20);
        System.out.println(acc1.toString());
    }

}

class BankAccount implements IInterest {
    private static int iD = 1000;
    private String accountNumber;
    private static final String routingNumber = "005400657";
    private String name;
    private String SSN;
    private double balance;

    public BankAccount(String SSN, double initDeposit) {
        System.out.println("New Account Created");
        this.balance = initDeposit;
        this.SSN =SSN;
        iD++;
        setAccountNumber();
    }
    private void setAccountNumber(){
        int random = (int) (Math.random()*10);
        accountNumber = iD + "" + random + SSN.substring(0, 2);
        System.out.println("Your account number is: " + accountNumber);
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void payBill(double amount) {
    	balance = balance-amount;
    	showBalance();
    }
    public void makeDeposit(double amount) {
    	balance = balance + amount;
    	showBalance();
    }
    public void showBalance() {
    	System.out.println(balance);
    }
    public void accrue() {
    	balance = balance * (1 + rate/100);
    	showBalance();
    }
    public String toString() {
    	return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
    }
}