package Exercitiul3;

public class Cat implements Animal {
    private String status;
    public Cat() {
        this.status = "None";
    }
    public String walk(){
        this.status = "cat walking";
        return this.status;
    }
    public String eat() {
        this.status = "cat eating";
        return this.status;
    }
    public String talk() {
        this.status = "cat talking";
        return this.status;
    }
}
