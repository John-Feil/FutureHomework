public class Atm {
    public static void main(String[] args) {
        Account checkinsAccount = new Account();
        checkinsAccount.setBalance(1000.00);
        checkinsAccount.deposit(500);
        checkinsAccount.withdraw(600);
        System.out.println(checkinsAccount.getBalance());
    }
}
