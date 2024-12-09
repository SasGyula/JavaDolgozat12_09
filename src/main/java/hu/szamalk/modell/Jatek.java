package hu.szamalk.modell;

public abstract class Jatek {
    private static int jatekDb = 0;

    public Jatek() {
        jatekDb++;
    }

    public static int getJatekDb() { return jatekDb; }

    public void kezd(){

    };
    public void ment(){

    };
    public void vege(){

    };

}
