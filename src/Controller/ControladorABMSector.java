package Controller;

import DTO.DTOSector;
import java.util.List;


import main.ExpertoSector;

public class ControladorABMSector {

    private ExpertoSector experto = new ExpertoSector();

   /* public void Metodo() {
        experto.Metodo();
    }*/
    public void agregarSector(DTOSector dtoSec){
        experto.agregarSector(dtoSec);
    }
    public DTOSector modificarSector(DTOSector dtoSec){
        experto.modificarSector(dtoSec);
        return null; 
    }
     
    public void bajaSector(DTOSector dtobaja){
        experto.bajaSector(dtobaja);
    }
    
    public List<DTOSector> FiltradoMostrarDTO(String nombreSector){
        return experto.filtrado(nombreSector);
    }
    
    
    
    
}
