package Controller;

import DTO.DTOSector;
import java.util.List;


import main.ExpertoSector;

public class ControladorABMSector {

    private ExpertoSector experto = new ExpertoSector();

   /* public void Metodo() {
        experto.Metodo();
    }*/
    public void agregarSector(Integer codsec, String nombreSect, String descripSect){
        experto.agregarSector(codsec,nombreSect,descripSect);
    }
    public DTOSector modificarSector(String codSector, String nombreSector, String descrSector){
        experto.modificarSector(codSector, nombreSector, descrSector);
        return null; 
    }
    public void bajaSector(Integer codSector){
        experto.bajaSector(codSector);
    }
    
    public List<DTOSector> FiltradoMostrarDTO(String nombreSector){
        return experto.filtrado(nombreSector);
    }
    
    
    
    
}
