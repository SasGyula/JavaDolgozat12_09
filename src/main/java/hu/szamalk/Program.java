package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Program {
    public static void main(String[] args) {
        Tabla t = new Tabla('#');
        System.out.println(t.megjelenit());
        t.elhelyez(2);
        System.out.println(t.megjelenit());
    }
}
