package hu.szamalk;


import hu.szamalk.modell.LogikaiJatek;


public class Program {
    public static void main(String[] args) {
        LogikaiJatek l = new LogikaiJatek(2);
        l.kezd();
        System.out.println(l.getJatekDb());
    }
}

