package main;
import DTO.*;
import entidades.*;
import java.util.ArrayList;
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
//    public DTOSector buscarTodosLosObjetosDeUnaClase() {
//        List objetoList = FachadaPersistencia.getInstance().buscar("Sector", null);
//
//        for (Object x : objetoList) {
//            Sector sector = (Sector) x;
//            sector.getCodSector();
//            sector.getNombreSector();
//            sector.getDescripcionSector();
//            sector.getFechaHoraFinVigenciaSector();
//            objetoList.add(sector);
//        }
//    //    DTOSector dto = (Sector) objetoList.get();
//      //  return objetoList;
//      return null;
//    }
    
    
    public List<DTOSector> filtrado(String nombreSector) {
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(nombreSector.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(nombreSector)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else {
            dtoCrit.setAtributo("nombreSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(nombreSector); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }


        List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
        List<DTOSector> dtoList = new ArrayList<>();
        for (Object x : objetoList) {
            DTOSector dtosec = new DTOSector();
            Sector sector = (Sector) x;
            dtosec.setCodSector(sector.getCodSector());
            dtosec.setNombreSector(sector.getNombreSector());
            dtosec.setDescripcionSector(sector.getDescripcionSector());
            dtosec.setFechaFinVigenciaSector(sector.getFechaHoraFinVigenciaSector());
            dtoList.add(dtosec);
        }
       return dtoList ;

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

