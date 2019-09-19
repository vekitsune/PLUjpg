/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plukodtanuloprogram;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Verosffy
 */
public class Adatkezelo {
  
    ArrayList<Adat>adatListaSzukitett;
    ArrayList<Adat>listaPekaru=new ArrayList<>();
    ArrayList<Adat>listaZGy=new ArrayList<>();
    ArrayList<Adat>listaEgyeb=new ArrayList<>();
    ArrayList<Adat>listaTeljes=new ArrayList<>();
    String[]nev;
    String[]kod;
    
    public void listaFeltoltes(String eleresiUt){
       
        try{
            FileInputStream file=new FileInputStream(eleresiUt);
            ObjectInputStream bejovoadatok=new ObjectInputStream(file);
            boolean vegeVanaFilenak=false;
            
            while(!vegeVanaFilenak)
                try{
                    listaPekaru.add((Adat)bejovoadatok.readObject());
                }catch(EOFException ex){
                    vegeVanaFilenak=true;
            
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Adatkezelo.class.getName()).log(Level.SEVERE, null, ex);
                }
            bejovoadatok.close();
            file.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Adatkezelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Adatkezelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    
}
