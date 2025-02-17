package hu.ruander.alakzatok;

public class Hasab extends FemAlakzat{
    private double A,B,M;

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getM() {
        return M;
    }

    public Hasab(double a, double b, double magassag) {
        this.A = a;
        this.B = b;
        this.M = magassag;
    }
    public double terfogat(){
        return A*B*M;
    }
    public double suly(){
        return getFajsuly();
    }
}
