package hu.szamalk.modell;

import java.util.Arrays;


public class LogikaiJatek extends Jatek {
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        tabla = new Babu[4][5];
        sorrend = new int[10];
        if(babuDb <2 ||babuDb > 15){
            System.out.println("Minimum 2, maximum 15 bábut fogad el a program");
            this.babuDb = 3;
        }else {
            this.babuDb = babuDb;
        }
    }
    public boolean van8FelettEro(){
        return false;
    }
    public void kezd(){
        System.out.println("Kezdés: ");
    }
    public void ment(){
        System.out.println("Mentés: ");
    }
    public void vege(){
        System.out.println("Vége: ");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "babuDb=" + babuDb +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", tabla=" + Arrays.toString(tabla) +
                '}';
    }
}
