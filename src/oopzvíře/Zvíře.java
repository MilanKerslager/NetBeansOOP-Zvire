package oopzvíře;

public class Zvíře {
    private int nohy;
    private int věk;

    // konstruktor (vytvoření Source -> Insert Code
    // konstruktor naplní členské proměnné nohy a věk
    public Zvíře(int nohy, int věk) {
        this.nohy = nohy;
        this.věk = věk;
    }
    public int getNohy() {
        return nohy;
    }
    public int getVěk() {
        return věk;
    }
    public void setNohy(int nohy) {
        this.nohy = nohy;
    }
    public void setVěk(int věk) {
        this.věk = věk;
    }
    public void představSe() {
        System.out.println("Počet nohou: "+this.nohy);
        System.out.println("Stáří: "+this.věk);
    }
}
