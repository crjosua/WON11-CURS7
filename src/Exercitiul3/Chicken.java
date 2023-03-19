package Exercitiul3;
public class Chicken implements Animal {
    private String status;
    public Chicken() {
        this.status = "None";
    }
    public String walk(){
        this.status = "Chicken walking";
        return this.status;
    }
    public String eat() {
        this.status = "Chicken eating";
        return this.status;
    }
    public String talk() {
        this.status = "Chicken talking";
        return this.status;
    }
}