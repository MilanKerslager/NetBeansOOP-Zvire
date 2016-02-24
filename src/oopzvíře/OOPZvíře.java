package oopzvíře;

public class OOPZvíře {

    public static void main(String[] args) {
        Zvíře pes = new Zvíře(4, 2);
        
        System.out.println("Dřevní výpis psa: ");
        System.out.println("Počet nohou: "+pes.getNohy());
        System.out.println("Stáří: "+pes.getVěk());
        
        System.out.println("");
        
        System.out.println("Výpis psa metodou představSe: ");
        pes.představSe();
        
        pes.setVěk(12);
        System.out.println("Pes zestárnul:");
        pes.představSe();
    }
    
}
