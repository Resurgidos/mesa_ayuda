package main;
import DTO.*;
import entidades.*;
import java.util.ArrayList;
import java.util.List;

public class ExpertoSector {

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
    public DTOSector modificarSector(String codSector, String nombreSector, String descrSector){
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
        if(nombreSector.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(codSector)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        
        }else{
            System.out.println("No se paso ningun codigo como parametro en el experto modificarSector");
        }
        List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
        
        return null;  
        
        
    }
    public void bajaSector(Integer codSector){
        
    }
   
    
    
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