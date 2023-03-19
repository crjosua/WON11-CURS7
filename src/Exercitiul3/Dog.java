package Exercitiul3;

public class Dog implements Animal {
    private String status;
    public Dog() {
        this.status = "None";
    }
    public String walk(){
        this.status = "dog walking";
        return this.status;
    }
    public String eat() {
        this.status = "dog eating";
        return this.status;
    }
    public String talk() {
        this.status = "dog talking";
        return this.status;
    }
}
