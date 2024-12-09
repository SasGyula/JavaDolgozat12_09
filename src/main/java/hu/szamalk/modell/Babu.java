package hu.szamalk.modell;

public class Babu {
    private int ero;
    private String szin;
    public Babu(String szin) {
        this(1, szin);
    }

    public Babu(int ero, String szin) {
        this.ero = ero;
        this.szin = szin;
        if(ero <1 ||ero > 9){
            System.out.println("Minimum 1, maximum 9 ereje lehet egy bábúnak");
            this.ero = 1;
        }else {
            this.ero = ero;
        }
    }

}
