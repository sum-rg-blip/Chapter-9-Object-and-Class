package Chapter9ObjectsAndClasses;

public class TestAccount {
    public static void main(String[] args) {
        Account account=new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("The balance : " + account.getBalance());
        System.out.println("The monthly interest : " + account.getMonthlyInterest());
        System.out.println("The date when this account was created : " + account.getDateCreated());


    }
}
