package Exercitiul3;

public class Mouse implements Animal {
    private String status;
    public Mouse() {
        this.status = "None";
    }
    public String walk(){
        this.status = "Mouse walking";
        return this.status;
    }
    public String eat() {
        this.status = "mouse eating";
        return this.status;
    }
    public String talk() {
        this.status = "mouse talking";
        return this.status;
    }
}
