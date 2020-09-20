package main;

import entidades.*;
import main.DTOCriterio;




public class Experto {

    public void Metodo() {
     crearElementos();
    }
     void crearElementos() {
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        
        EstadoCaso ec = new EstadoCaso();
        
        ec.setCodEstadoCaso(0);
        ec.setNombreEstadoCaso("Hola");
        
         FachadaPersistencia.getInstance().guardar(ec);
         FachadaPersistencia.getInstance().finalizarTransaccion();
        
    } 
}  


