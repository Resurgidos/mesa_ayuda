package main;
import DTO.*;
import entidades.*;
import java.util.List;

public class Experto {

    public void agregarSector(Integer codsec, String nombreSect, String descripSect) { //Metodo del experto con el cual creamos un objeto Sector
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
    public DTOSector modificarSector(String nombreSector){
        return null;  
        
    }
    public void bajaSector(Integer codSector){
        
    }
    /**
     * Busca objetos con un atributo nulo.
     */
    public DTOSector buscarTodosLosObjetosDeUnaClase() {
        List objetoList = FachadaPersistencia.getInstance().buscar("Sector", null);

        for (Object x : objetoList) {
            Sector sector = (Sector) x;
            sector.getCodSector();
            sector.getNombreSector();
            sector.getDescripcionSector();
            sector.getFechaHoraFinVigenciaSector();
            objetoList.add(sector);
        }
    //    DTOSector dto = (Sector) objetoList.get();
      //  return objetoList;
      return null;
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

