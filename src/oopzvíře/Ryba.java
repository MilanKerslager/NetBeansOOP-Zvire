package oopzvíře;

public class Ryba extends Zvíře {
    private final String druh;

    public Ryba(int věk, String druh) {
        super(0, věk);
        this.druh = druh;
    }
    
    @Override
    public void představSe() {
        System.out.println("Jsem ryba, druh: "+this.druh);
        super.představSe();
    }
}
