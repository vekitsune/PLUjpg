/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plukodtanuloprogram;

/**
 *
 * @author Verosffy
 */
public class Adat {

    private String nev;
    private String kod;
    private String kepcim;
    private Kategoria besorolas;
    String eleresiUt;

    public Adat(String nev, String kod) {
        this.nev = nev;
        this.kod = kod;
        besorolas = Kategoria.Egyeb;
        kepcim = "nincsMegadva.jpg";
        eleresiUt = "egyeb.dat";
    }
    public void eleresiUtIni(){
        switch (besorolas) {
            case Egyeb:
                eleresiUt = "egyeb.dat";
                break;
            case Pekaru:
                eleresiUt = "pekaru.dat";
                break;
            case ZoldsegGyumolcs:
                eleresiUt = "zgy.dat";
                break;
            default:
                eleresiUt = null;
                break;
    }
    }
    public void adatModositas(String masnev, String maskod, String maskepcim, Kategoria masKateg) {
        nev = masnev;
        kod = maskod;
        kepcim = maskepcim;
        besorolas = masKateg;
        eleresiUtIni();
        

        

    }

    public Adat(String nev, String kod, String kepcim, Kategoria besorolas) {
        this.nev = nev;
        this.kod = kod;
        this.kepcim = kepcim;
        this.besorolas = besorolas;
        eleresiUtIni();
        
        
    }

    public Kategoria getBesorolas() {
        return besorolas;
    }

    public void setBesorolas(Kategoria besorolas) {
        this.besorolas = besorolas;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKepcim() {
        return kepcim;
    }

    public void setKepcim(String kepcim) {
        this.kepcim = kepcim;
    }

}
