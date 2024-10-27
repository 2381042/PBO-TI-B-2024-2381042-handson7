package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount giorRotinsulu = new BankAccount(100);
        giorRotinsulu.deposit(10);
        System.out.println(giorRotinsulu.getSaldo());
    }
}