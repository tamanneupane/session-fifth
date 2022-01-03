package day4;

public class BankEncapsulation {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setAccountNumber("1");
        account1.setAccountHolderName("ABC");
        //TODO : Need to replace this set Account Balance As well
        account1.deposit(account1, 500);

        Account account2 = new Account();
        account2.setAccountNumber("2");
        account2.setAccountHolderName("Ram");
        //TODO : Need to replace this set Account Balance As well
        account2.deposit(account2,200000);

        // Interest calculation
        account1.addInterest(account1);

        System.out.println("********************** Before Transfer ************************");
        System.out.println("Account 2 : " + account2.getAccountBalance());
        System.out.println("Account 1: " + account1.getAccountBalance());

        //Transferring Balance (from A2 to A1 amount 500)
        account2.transferBalance(account1, account2, 500);

        System.out.println("********************** After Transfer ************************");
        System.out.println("Account 2 : " + account2.getAccountBalance());
        System.out.println("Account 1: " + account1.getAccountBalance());
    }


}
