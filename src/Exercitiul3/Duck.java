package Exercitiul3;
public class Duck implements Animal {
    private String status;
    public Duck() {
        this.status = "None";
    }
    public String walk(){
        this.status = "Duck walking";
        return this.status;
    }
    public String eat() {
        this.status = "Duck eating";
        return this.status;
    }
    public String talk() {
        this.status = "Duck talking";
        return this.status;
    }
}
