package oopzvíře;

public class OOPZvíře {

    public static void main(String[] args) {
        Zvíře pes1 = new Zvíře(4, 2);
        
        System.out.println("Dřevní výpis psa: ");
        System.out.println("Počet nohou: "+pes1.getNohy());
        System.out.println("Stáří: "+pes1.getVěk());
        
        System.out.println("");
        
        System.out.println("Výpis psa metodou představSe: ");
        pes1.představSe();
        
        pes1.setVěk(12);
        System.out.println("Pes zestárnul:");
        pes1.představSe();
        
        Pes pes2 = new Pes(6, "voříšek");
        pes2.představSe();
        pes2.aport();
        
        Pes pes3 = new Pes(2, "Zlatý retriever");
        pes3.představSe();
        pes3.aport();
        
        Kočka kocka1 = new Kočka(3, "angorák", "Líza");
        kocka1.představSe();
        
        Ryba ryba1 = new Ryba(1, "neonka");
        ryba1.představSe();
        
    }
    
}
