package oopzvíře;

public class Kočka extends Zvíře {
    private final String rasa;
    private final String jméno;

    public Kočka(int věk, String rasa, String jméno) {
        super(4, věk);
        this.rasa = rasa;
        this.jméno = jméno;
    }
    
    @Override
    public void představSe() {
        System.out.println("Jsem kočka "+this.jméno+", rasa: "+this.rasa);
        super.představSe();
    }
    
}
