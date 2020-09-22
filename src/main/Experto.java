package main;

import entidades.*;

public class Experto {

    public void agregarSector(Integer codsec, String nombreSect, String descripSect) {
      FachadaPersistencia.getInstance().iniciarTransaccion();  
        
        //Instanciaciones de objetos a usar      
        Sector sector = new Sector();
       
        //Pasamos los parametros al Sector      
        sector.setCodSector(codsec);
        sector.setNombreSector(nombreSect);
        sector.setDescripcionSector(descripSect);;
        FachadaPersistencia.getInstance().guardar(sector);            
        FachadaPersistencia.getInstance().finalizarTransaccion();
    }
         
}  





 /* ConfiguracionTipoCaso configTC = new ConfiguracionTipoCaso();
        TipoCasoTipoInstancia tcti = new TipoCasoTipoInstancia();
        TipoCaso tc = new TipoCaso();
        TipoInstancia ti = new TipoInstancia();*/
        /*    TipoTarea tt = new TipoTarea();*/
 /*  tt.setCodTipoTarea(44);
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
        
        
       */

