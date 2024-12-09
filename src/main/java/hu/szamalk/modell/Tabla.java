package hu.szamalk.modell;

import java.util.Random;

public class Tabla {
    private Character [][] t;
    private Character uresCella;
    private Random rn = new Random();

    public Tabla(Character uresCella) {
        t = new Character[8][8];
        this.uresCella = uresCella;
        feltolt();
    }
    private void feltolt(){
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                t[i][j] = uresCella;
            }
        }
    }

    public void elhelyez(int n){
        int rnOszlop;
        int rnSor;
        for(int i = 0; i < n; i++){
            rnOszlop = rn.nextInt(0,8);
            rnSor = rn.nextInt(0,8);
            this.t[rnSor][rnOszlop] = 'K';
        }
    }
    public void fajlbaIr(){

    }
    public String megjelenit(){
        String s = "";
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(j % 8 == 0){
                    s += '\n';
                    s += t[i][j];
                }else {
                    s += t[i][j];
                }
            }
        }
        return s;
    }
    public void tabla(){

    }
    public boolean uresSor(int sor){
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
    public boolean uresOszlop(int oszlop){
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
    public int uresOszlopokSzama(){
        return 0;
    }
    public int uresSorokSzama(){
        return 0;
    }
}
