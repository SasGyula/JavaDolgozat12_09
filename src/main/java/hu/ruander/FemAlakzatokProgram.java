package hu.ruander;

import hu.ruander.alakzatok.FemAlakzat;
import hu.ruander.alakzatok.Gomb;
import java.util.ArrayList;

public class FemAlakzatokProgram {
    ArrayList<FemAlakzat> lista;
    public FemAlakzatokProgram(){
        lista = new ArrayList<>();
    }
    public void ujAlakzat(FemAlakzat alakzat) {
        lista.add(alakzat);
    }

    public ArrayList<FemAlakzat> getLista() {
        return new ArrayList<>(this.lista);
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FemAlakzat femAlakzat : lista) {
            osszSuly += femAlakzat.suly();
        }
        return osszSuly;
    }

    public double gombokOsszSuly() {
        double osszSuly = 0;
//        for (FemAlakzat femAlakzat : lista) {
//            if(lista.contains(Gomb)) {
//                osszSuly += femAlakzat.suly();
//            }
//        }
        return osszSuly;
    }

    public FemAlakzat minV() {
        int seged = 0;
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).terfogat() < lista.get(i-1).terfogat()){
                seged = i;
            }
        }
        return lista.get(seged);
    }

    public FemAlakzat maxV() {
        return null;
    }
}
