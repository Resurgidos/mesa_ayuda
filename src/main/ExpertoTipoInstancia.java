
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
        try{
        FachadaPersistencia.getInstance().iniciarTransaccion();//Instanciaciones de objetos a usar      
             
        List<DTOCriterio> validarCod = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoTI.getCodTipoInstancia()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                validarCod.add(dtoCrit);
        try{       
        List objetoList = FachadaPersistencia.getInstance().buscar("Sector",validarCod );

         int verificar = 0;
             for (Object x : objetoList) {
                 tipoIns = (TipoInstancia)x;
                 verificar = tipoIns.getCodTipoInstancia();
                 System.out.println(sec.getNombreSector());
                 dtoTI.setVerificarError(verificar);
                }if(dtoTI.getVerificarError() == 0 ){  
                    if(dtoTI.getCodTipoInstancia() == 0){ //Verificamos que el codigo no sea cero
                                    dtoTI.setVerificarError(1);
                                    dtoTI.setErrorMensaje("El Código no esta permitido"); 
                    }else{
                        
                        dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                        dtoCrit.setOperacion("=");
                        dtoCrit.setValor(dtoTI.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                        listadtoCrit.add(dtoCrit);

                        List objetoList3 = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
                         for (Object x : objetoList3) {

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
                }
                }else{
                                dtoTI.setErrorMensaje("El código ya existe");        
                 }}catch(Exception e){
                        System.out.println("No se pudo registrar el sector"); 
                 }    
            }catch(Exception e){
                    System.out.println("No se pudo encontrar el sector");                
            }
            return dtoTI;
    }
        
        
   
    public DTOTipoInstancia modificarTipoInstancia(DTOTipoInstancia dtoTI){
        return null;
    }
    public DTOTipoInstancia bajaTipoInstancia(DTOTipoInstancia dtoTI){
        return null;
    }
    public List<DTOTipoInstancia> filtroTI(String nombreTI){
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(nombreTI.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(nombreTI)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else{
            dtoCrit.setAtributo("nombreTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(nombreTI); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);       
        }
            
            
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );
        List<DTOTipoInstancia> dtoList = new ArrayList<>();
        
        for (Object x : objetoList) {
            DTOTipoInstancia dtoTI = new DTOTipoInstancia();
            System.out.println("LLego antes");
            TipoInstancia ti = (TipoInstancia) x;
            dtoTI.setCodTipoInstancia(ti.getCodTipoInstancia());
            dtoTI.setNombreTipoInstancia(ti.getNombreTipoInstancia());
            dtoTI.setCodSector(ti.getSector().getCodSector());
            dtoTI.setNombreSector(ti.getSector().getNombreSector());
            dtoTI.setCodTipoTarea(ti.getTipoTarea().getCodTipoTarea());
            dtoTI.setNombreTipoTarea(ti.getTipoTarea().getNombreTipoTarea());
          //  if(ti.getFechaHoraFinVigenciaTipoInstancia() != null){
            dtoTI.setFechaHoraFinVigenciaTI(ti.getFechaHoraFinVigenciaTipoInstancia());
          //  }
            dtoList.add(dtoTI);
            System.out.println("LLega");
            
        }
        
        return dtoList;
    }
    
    
    public List<DTOTipoInstancia> filtradoSector(String dtoTI){
        DTOTipoInstancia dtosec = new DTOTipoInstancia();
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
            if(dtoTI.matches("[0-9]+") ){
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(dtoTI)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }else{
            dtoCrit.setAtributo("nombreSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(dtoTI); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }         
            List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
            List<DTOTipoInstancia> dtoList = new ArrayList<>();
            for (Object x : objetoList) {
              
                Sector sec = (Sector)x ;
                dtosec.setCodSector(sec.getCodSector());
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
            if(dtoTI.matches("[0-9]+") ){
            dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el TipoInstancia que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(dtoTI)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }else{
               dtoCrit.setAtributo("nombreTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(dtoTI); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }
            
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );
            List<DTOTipoInstancia> dtoList = new ArrayList<>();
            for (Object x : objetoList) {
                       
                
                TipoTarea tt = (TipoTarea)x ; //por cada objeto de la lista, se lo asigno a un objeto de la clase
                dtoTT.setCodSector(tt.getCodTipoTarea());
                dtoTT.setNombreTipoTarea(tt.getNombreTipoTarea());
                
                dtoList.add(dtoTT);
                }         
        return dtoList;
    }
}
   

