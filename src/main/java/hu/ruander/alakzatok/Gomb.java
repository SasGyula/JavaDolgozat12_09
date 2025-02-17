package hu.ruander.alakzatok;

public class Gomb extends FemAlakzat{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }
    public double terfogat(){
        return 4.0/3.0 * Math.PI * Math.pow(sugar, 3);
    }
    public double suly(){
        return terfogat()*getFajsuly();
    }
}
