package hu.ruander.alakzatok;

public abstract class FemAlakzat {
    private static double fajsuly = 1.15;
    public FemAlakzat(){
    }
    public static double getFajsuly(){
        return fajsuly;
    };

    public abstract double terfogat();
    public abstract double suly();

}
