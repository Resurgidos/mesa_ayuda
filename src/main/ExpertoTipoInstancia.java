
package main;

import DTO.DTOCriterio;


import DTO.DTOTipoInstancia;
import entidades.*;
import java.util.ArrayList;
import java.util.List;


public class ExpertoTipoInstancia {
          

    public DTOTipoInstancia agregarTipoInstancia(DTOTipoInstancia dtoTI){  
        TipoInstancia tipoIns = new TipoInstancia(); 
        TipoTarea tt = new TipoTarea();
        Sector sec = new Sector();
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
        FachadaPersistencia.getInstance().iniciarTransaccion();//Instanciaciones de objetos a usar      
                
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoTI.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
            List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
             for (Object x : objetoList) {
              
                 sec = (Sector)x ;
                 System.out.println(sec.getNombreSector());
                }  
            
            dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoTI.getCodTipoTarea()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
            
            List objetoList2 = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit);
             for (Object x : objetoList2) {
                 tt = (TipoTarea)x ;
                 System.out.println(tt.getNombreTipoTarea());
                }            
                    
            tipoIns.setCodTipoInstancia(dtoTI.getCodTipoInstancia());           
            tipoIns.setNombreTipoInstancia(dtoTI.getNombreTipoInstancia());          
            tipoIns.setSector(sec);
            System.out.println(sec.getNombreSector());
            tipoIns.setTipoTarea(tt);
            System.out.println(tt.getNombreTipoTarea());
            FachadaPersistencia.getInstance().guardar(tipoIns);
            FachadaPersistencia.getInstance().finalizarTransaccion();
                                                                           
        return dtoTI;
    }
        
        
   
    public DTOTipoInstancia modificarTipoInstancia(DTOTipoInstancia dtoTI){
        return null;
    }
    
    public List<DTOTipoInstancia> filtradoSector(String dtoTI){
        DTOTipoInstancia dtosec = new DTOTipoInstancia();
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
  
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(dtoTI)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
                     
            List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
            List<DTOTipoInstancia> dtoList = new ArrayList<>();
            for (Object x : objetoList) {
              
                Sector sec = (Sector)x ;
                dtosec.setNombreSector(sec.getNombreSector());
               
                
                dtoList.add(dtosec);
                }         
        return dtoList;
    }
    
    public List<DTOTipoInstancia> filtradoTT(String dtoTI){
        DTOTipoInstancia dtoTT = new DTOTipoInstancia();
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
  
            dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el TipoInstancia que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(dtoTI)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
                     
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );
            List<DTOTipoInstancia> dtoList = new ArrayList<>();
            for (Object x : objetoList) {
                       
                
                TipoTarea tt = (TipoTarea)x ; //por cada objeto de la lista, se lo asigno a un objeto de la clase
                dtoTT.setNombreTipoTarea(tt.getNombreTipoTarea());
                dtoList.add(dtoTT);
                }         
        return dtoList;
    }
}
   

