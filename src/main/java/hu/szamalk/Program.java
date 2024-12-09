package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Program {
    public static void main(String[] args) {
        Tabla t = new Tabla('#');
        System.out.println("4.feladat:");
        System.out.println(t.megjelenit());
        t.elhelyez(8);
        System.out.println("6.feladat:");
        System.out.println(t.megjelenit());
    }
}
