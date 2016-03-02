package oopzvíře;

public class Pes extends Zvíře {
    private String rasa;

    public Pes(int věk, String rasa) {
        // voláme nadřízený konstruktor, pes má vždycky 4 nohy
        super(4, věk);
        this.rasa = rasa;
    }
    
    public void aport() {
        if (getVěk() < 4) {
            System.out.println("Aportuji...");
        } else {
            System.out.println("Nepruď, jsem starej!");
        }
    }
    
    @Override
    public void představSe() {
        System.out.println("Jsem pes, rasa: "+this.rasa);
        super.představSe();
    }
    
}
