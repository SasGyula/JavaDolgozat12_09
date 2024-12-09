package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Program {
    public static void main(String[] args) {
        Tabla t = new Tabla('#');
        System.out.println("4.feladat: Az üres tábla:");
        System.out.println(t.megjelenit());
        t.elhelyez(8);
        System.out.println("6.feladat: A feltöltött tábla:");
        System.out.println(t.megjelenit());
        System.out.println("9.feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + t.uresOszlopokSzama());
        System.out.println("Sorok: " + t.uresSorokSzama());
    }
}
