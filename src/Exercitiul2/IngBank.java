package Exercitiul2;
public class IngBank implements Bank {
    private int sum;
    private String nume;

    public IngBank(int sum) {
        this.sum = sum;
        this.nume="IngBank";
    }

    public void withdraw(int moneyOut) {
        System.out.println("You want to withdraw " + moneyOut );
        if(sum >= moneyOut) {
            this.sum = sum - moneyOut;
        }
        else {
            System.out.println("Not enough money left in your bank account");
        }
        System.out.println("Left money in account is " + sum );
    }


    public void deposit(int moneyIn) {
        System.out.println("You want to deposit " + moneyIn );
        this.sum=sum+moneyIn;
        System.out.println("Total amount of money is " + sum);
    }

    public String getNume(){
        return this.nume;
    }
}
