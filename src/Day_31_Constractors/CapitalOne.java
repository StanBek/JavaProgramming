package Day_31_Constractors;

public class CapitalOne {

    public static void main(String[] args) {

    BankAccount account1= new BankAccount();
    account1.setInfo("Stan Bek",123456789);
    System.out.println(account1);

    account1.deposit(1000);
    account1.checkBalance();

    account1.withdraw(900);
    account1.checkBalance();

    BankAccount account2=new BankAccount();
    account2.setInfo("Tim Arstanbek",003030303);
    account2.deposit(1000);
    account2.checkBalance();








    }
}
