package Exercitiul2;

public class run {
    public static void main(String[] args) {
        Bank bank1 = new IngBank(100);
        System.out.println("Contul la banca " + bank1.getNume());
        bank1.withdraw(20);
        bank1.deposit(200);

        Bank bank2 = new BtBank(50);
        System.out.println("Contul la banca " + bank2.getNume());
        bank2.withdraw(58);
        bank2.deposit(20);

        Bank bank3 = new BrdBank(1500);
        System.out.println("Contul la banca " + bank3.getNume());
        bank3.withdraw(1000);
        bank3.deposit(2000);
    }
}
