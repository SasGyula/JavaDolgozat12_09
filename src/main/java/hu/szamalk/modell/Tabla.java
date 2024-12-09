package hu.szamalk.modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Tabla {
    private Character[][] t;
    private Character uresCella;
    private Random rn = new Random();

    public Tabla(Character uresCella) {
        t = new Character[8][8];
        this.uresCella = uresCella;
        tabla();
    }

    public void elhelyez(int n) {
        int rnOszlop;
        int rnSor;
        for (int i = 0; i < n; i++) {
            rnOszlop = rn.nextInt(0, 8);
            rnSor = rn.nextInt(0, 8);
            while(this.t[rnSor][rnOszlop] == 'K'){
                rnOszlop = rn.nextInt(0, 8);
                rnSor = rn.nextInt(0, 8);
            }
            this.t[rnSor][rnOszlop] = 'K';
        }
    }

    public String megjelenit() {
        String s = "";
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (j % 8 == 0) {
                    s += '\n';
                    s += t[i][j];
                } else {
                    s += t[i][j];
                }
            }
        }
        return s;
    }

    public void tabla() {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = uresCella;
            }
        }
    }

    public boolean uresSor(int sor) {
        boolean s = true;
        int i = 0;
        while (i < t[sor].length) {
            if (t[sor][i] == 'K') {
                s = false;
                break;
            }
            i++;
        }
        return s;
    }

    public boolean uresOszlop(int oszlop) {
        boolean s = true;
        int i = 0;
        while (i < t.length) {
            if (t[i][oszlop] == 'K') {
                s = false;
                break;
            }
            i++;
        }
        return s;
    }

    public int uresOszlopokSzama() {
        int s = 0;
        for (int i = 0; i < t[0].length; i++) {
            if (uresOszlop(i) == true) {
                s++;
            }
        }
        return s;
    }

    public int uresSorokSzama() {
        int s = 0;
        for (int i = 0; i < t.length; i++) {
            if (uresSor(i) == true) {
                s++;
            }
        }
        return s;
    }


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
        fajlbaIr(forras);
    }
    public static void fajlbaIr(Path forras) throws IOException {
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