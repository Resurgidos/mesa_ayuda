package Controller;

import DTO.DTOSector;
import java.util.List;


import main.Experto;

public class ControladorABMSector {

    private Experto experto = new Experto();

   /* public void Metodo() {
        experto.Metodo();
    }*/
    public void agregarSector(Integer codsec, String nombreSect, String descripSect){
        experto.agregarSector(codsec,nombreSect,descripSect);
    }
    public DTOSector modificarSector(String nombreSector){
        
        return null; 
    }
    public void bajaSector(Integer codSector){
        experto.bajaSector(codSector);
    }
    
    public List<DTOSector> FiltradoMostrarDTO(String nombreSector){
        return experto.filtrado(nombreSector);
    }
    
    
    
    
}
