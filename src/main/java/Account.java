public class Account {

    private double balance;

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance) {
        if (balance < 0.0) {
            System.out.println("You can not withdraw this amount");
        } else {
            this.balance = balance;
        }
    }
    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("Can't deposit negative amount!");
        }
    }
    public void withdraw(double amount){
        if(amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("Can't withdraw more than balance!");
        }
    }
}
