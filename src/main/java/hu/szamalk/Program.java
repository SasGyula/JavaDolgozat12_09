package hu.szamalk;

import hu.szamalk.modell.Tabla;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
    public static void main(String[] args) throws IOException {
        Path forras = Paths.get("C:\\Users\\sas.gyula\\IdeaProjects\\SasGyulaDolgozat\\src\\main\\java\\hu\\szamalk\\tablak64.txt");
        Tabla t = new Tabla('#');
        System.out.println("4.feladat: Az üres tábla:");
        System.out.println(t.megjelenit());
        t.elhelyez(8);
        System.out.println("6.feladat: A feltöltött tábla:");
        System.out.println(t.megjelenit());
        System.out.println("9.feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + t.uresOszlopokSzama());
        System.out.println("Sorok: " + t.uresSorokSzama());
        fajlbaIras(forras);
    }
    public static void fajlbaIras(Path forras) throws IOException {
        String s = "";
        for(int i = 1; i<65; i++){
            Tabla t = new Tabla('*');
            t.elhelyez(i);
            s += t.megjelenit() + "\n";
        }
        try {
            Files.write(forras, s.getBytes());
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}

