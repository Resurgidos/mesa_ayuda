package main;

import entidades.*;
import java.util.ArrayList;

public class Experto {

    public void Metodo() {
     crearElementos();
    }
    ArrayList<TipoCasoTipoInstancia> lista = new ArrayList<>();
     void crearElementos() {
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        
        //Instanciaciones de objetos a usar 
        ConfiguracionTipoCaso configTC = new ConfiguracionTipoCaso();
        TipoCasoTipoInstancia tcti = new TipoCasoTipoInstancia();
        TipoCaso tc = new TipoCaso();
        TipoInstancia ti = new TipoInstancia();
        Sector sector = new Sector();
        TipoTarea tt = new TipoTarea();
        
        //Creamos Sector
        sector.setCodSector(98);
        sector.setNombreSector("software");
        FachadaPersistencia.getInstance().guardar(sector);
       
        tt.setCodTipoTarea(44);
        tt.setNombreTipoTarea("Alquilar");
        FachadaPersistencia.getInstance().guardar(tt);
        
        ti.setCodTipoInstancia(999);
        ti.setNombreTipoInstancia("prueba");
        ti.setSector(sector);
        ti.setTipoTarea(tt);
        FachadaPersistencia.getInstance().guardar(ti);
        
        tc.setCodTipoCaso(777);
        tc.setNombreTipoCaso("Falla");
        FachadaPersistencia.getInstance().guardar(tc);
        
        tcti.setOrdenTipoCasoTipoInstancia(55);
        tcti.setTipoInstancia(ti);
        FachadaPersistencia.getInstance().guardar(tcti);
        
        configTC.setNroConfigTC(7);
        configTC.setTipoCaso(tc);
        configTC.addTipoCasoTipoInstancia(tcti);
        FachadaPersistencia.getInstance().guardar(configTC);
        
        
       
        
        
        
        
         
                

        
       
        
        
        
        
         FachadaPersistencia.getInstance().finalizarTransaccion();
        
         
    } 
         
}  

