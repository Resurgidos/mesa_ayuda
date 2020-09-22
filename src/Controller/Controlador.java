package Controller;
import interfaces.*;
import main.Experto;
public class Controlador {

    private Experto experto = new Experto();

   /* public void Metodo() {
        experto.Metodo();
    }*/
    public void agregarSector(Integer codsec, String nombreSect, String descripSect){
        experto.agregarSector(codsec,nombreSect,descripSect);
    }
}
