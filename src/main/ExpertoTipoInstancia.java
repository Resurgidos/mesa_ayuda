
package main;

import DTO.DTOCriterio;
import DTO.DTOsTipoInstancia.DTOFiltroTI;
import DTO.DTOsTipoInstancia.DTOAgregarTipoInstancia;
import DTO.DTOsTipoInstancia.DTOErrorMensajes;
import DTO.DTOsTipoInstancia.DTOModificarTipoInstancia;
import DTO.DTOsTipoInstancia.DTOVisualizarDatosTI;
import entidades.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class ExpertoTipoInstancia {
          

    public DTOErrorMensajes agregarTipoInstancia(DTOAgregarTipoInstancia dtoAgregarTI){  
        TipoInstancia tipoIns = new TipoInstancia(); 
        TipoTarea tt = new TipoTarea();
        Sector sec = new Sector();
        DTOErrorMensajes dtoErrores = new DTOErrorMensajes();
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
        try{
        FachadaPersistencia.getInstance().iniciarTransaccion();//Instanciaciones de objetos a usar      
             
        List<DTOCriterio> validarCod = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoAgregarTI.getCodTipoInstancia()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                validarCod.add(dtoCrit);
        try{      
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",validarCod );
             int verificar = 0;
             for (Object x : objetoList) {  //Con este for verifico que no haya un código ya existente
                 tipoIns = (TipoInstancia)x; //Si ya existe ese código, settea a verificar para validar y que muestre un mensaje
                 verificar = tipoIns.getCodTipoInstancia();                
                 dtoErrores.setVerificarError(verificar);
                 
                }if(dtoErrores.getVerificarError() == 0 ){  //Comprobamos que el código no existe. Si existe settea el mensaje
                    if(dtoAgregarTI.getCodTipoInstancia() == 0){ //Verificamos que el codigo no sea cero, si es 0 Settea error
                                    dtoErrores.setVerificarError(1);
                                    dtoErrores.setErrorMensaje("El Código no esta permitido"); 
                    }else{                        
                        dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                        dtoCrit.setOperacion("=");
                        dtoCrit.setValor(dtoAgregarTI.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                        listadtoCrit.add(dtoCrit);
                        
                        
                        //Busco el sector que ingrese por la interfaz y luego se lo asigno al Tipo Instancia que estoy creando
                        List objetoList3 = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
                         for (Object x : objetoList3) {
                             sec = (Sector)x ;
                             tipoIns.setSector(sec);
                            }  

                        dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                        dtoCrit.setOperacion("=");
                        dtoCrit.setValor(dtoAgregarTI.getCodTipoTarea()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                        listadtoCrit.add(dtoCrit);

                        //Busco el TipoTarea que ingrese por la interfaz y luego se lo asigno al Tipo Instancia que estoy creando
                        List objetoList2 = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit);
                         for (Object x : objetoList2) {
                             tt = (TipoTarea)x ;
                             tipoIns.setTipoTarea(tt);
                            }            
                        
                        //Asigno al tipo instancia que estoy creando el código y el nombre
                        tipoIns.setCodTipoInstancia(dtoAgregarTI.getCodTipoInstancia());           
                        tipoIns.setNombreTipoInstancia(dtoAgregarTI.getNombreTipoInstancia());          
                        
                       FachadaPersistencia.getInstance().guardar(tipoIns);
                    }
                }else{
                     dtoErrores.setErrorMensaje("El código ya existe");  //Muestra el mensaje si el código está existente
                     }
                }catch(Exception e){
                        System.out.println("No se pudo registrar el TipoInstancia"); 
                 }    
            }catch(Exception e){
                    System.out.println("No se pudo encontrar el TipoInstancia");                
        }
        return dtoErrores;
    }
        
        
   
    public DTOErrorMensajes modificarTipoInstancia(DTOModificarTipoInstancia dtoModificarTI){
        Sector sec = new Sector();
        TipoTarea tt  = new TipoTarea();
        TipoInstancia ti = new TipoInstancia();
        DTOErrorMensajes dtoErrores = new DTOErrorMensajes();
        try{
            FachadaPersistencia.getInstance().iniciarTransaccion();    
            DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
            List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoModificarTI.getCodTipoInstancia()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                listadtoCrit.add(dtoCrit);
           try{
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );
             for (Object x : objetoList){
                 ti = (TipoInstancia)x;
                 
                  
                   dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                        dtoCrit.setOperacion("=");
                        dtoCrit.setValor(dtoModificarTI.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                        listadtoCrit.add(dtoCrit);

                        List secmod = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
                         for (Object h : secmod) {

                             sec = (Sector)h ;
                             ti.setSector(sec);
                          //   System.out.println(sec.getNombreSector());
                            }  
                        
                        dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                        dtoCrit.setOperacion("=");
                        dtoCrit.setValor(dtoModificarTI.getCodTipoTarea()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                        listadtoCrit.add(dtoCrit);


                        List ttmod = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit);
                         for (Object j : ttmod) {
                             tt = (TipoTarea)j ;
                             ti.setTipoTarea(tt);
                            // System.out.println(tt.getNombreTipoTarea());
                            } 
                   ti.setNombreTipoInstancia(dtoModificarTI.getNombreTipoInstancia());
                   FachadaPersistencia.getInstance().modificar(ti);  
             } }catch(Exception e){
               System.out.println("No se pudo modificar el sector"); 
                 }    
        }catch(Exception e){
                System.out.println("No se pudo encontrar el sector");                
        }
          
       return dtoErrores;
    }
    public void bajaTipoInstancia(int codTipoInstancia){
        Date fecha = new Date();
            
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
            dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(codTipoInstancia); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
        
            // datos que Setteamos fecha y hora              
            SimpleDateFormat objSDF = new SimpleDateFormat("dd/MM/yyyy - HH:mm"); // La cadena de formato de fecha se pasa como un argumento al objeto 
            String fechaFin = objSDF.format(fecha);    
            System.out.println(fechaFin);
                List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );        
                for(Object x : objetoList){
                    TipoInstancia ti = (TipoInstancia) x ;
                    try{
                    ti.setFechaHoraFinVigenciaTipoInstancia(objSDF.parse(fechaFin));
                    }catch(Exception e){
                        e.getMessage();
                    }
        }
       
       
    }
    
    public DTOVisualizarDatosTI visualizarDatosTipoInstancia(int codTipoInstancia){
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
        DTOVisualizarDatosTI dtoVisualizar = new DTOVisualizarDatosTI();
            dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(codTipoInstancia); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );
           
            for (Object x : objetoList) {
                
                TipoInstancia ti = (TipoInstancia)x ; //por cada objeto de la lista, se lo asigno a un objeto de la clase
                dtoVisualizar.setCodTipoInstancia(ti.getCodTipoInstancia());
                dtoVisualizar.setNombreTipoInstancia(ti.getNombreTipoInstancia());
                dtoVisualizar.setFechaHoraFinVigenciaTipoInstancia(ti.getFechaHoraFinVigenciaTipoInstancia());
                dtoVisualizar.setCodSector(ti.getSector().getCodSector());
                dtoVisualizar.setNombreSector(ti.getSector().getNombreSector());
                dtoVisualizar.setFechaHoraFinVigenciaSector(ti.getSector().getFechaHoraFinVigenciaSector());
                dtoVisualizar.setCodTipoTarea(ti.getTipoTarea().getCodTipoTarea());
                dtoVisualizar.setNombreTipoTarea(ti.getTipoTarea().getNombreTipoTarea());
                dtoVisualizar.setFechaHoraFinVigenciaTipoTarea(ti.getTipoTarea().getFechaHoraFinVigenciaTipoTarea());               
                }  
        
        return dtoVisualizar;
    }
    
    
    
    
    
    public List<DTOFiltroTI> filtroTI(String filTipoInstancia){
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(filTipoInstancia.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(filTipoInstancia)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else{
            dtoCrit.setAtributo("nombreTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(filTipoInstancia); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);       
        }
            
            
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );
        List<DTOFiltroTI> dtoList = new ArrayList<>();
        
        for (Object x : objetoList) {
            DTOFiltroTI dtoTI = new DTOFiltroTI();
            
            TipoInstancia ti = (TipoInstancia) x;
            dtoTI.setCodTipoInstancia(ti.getCodTipoInstancia());
            dtoTI.setNombreTipoInstancia(ti.getNombreTipoInstancia());            
            dtoTI.setNombreSector(ti.getSector().getNombreSector());            
            dtoTI.setNombreTipoTarea(ti.getTipoTarea().getNombreTipoTarea());
            dtoTI.setFechaHoraFinVigenciaTI(ti.getFechaHoraFinVigenciaTipoInstancia());          
            dtoList.add(dtoTI);
           }       
        return dtoList;
    }
    
    
    public DTOModificarTipoInstancia buscarPorCodTipoInstancia(int filTipoInstancia){
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
        DTOModificarTipoInstancia dtoModificar = new DTOModificarTipoInstancia();
            dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(filTipoInstancia); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );
           
            for (Object x : objetoList) {
                
                TipoInstancia ti = (TipoInstancia)x ; //por cada objeto de la lista, se lo asigno a un objeto de la clase
                dtoModificar.setCodTipoInstancia(ti.getCodTipoInstancia());
                dtoModificar.setNombreTipoInstancia(ti.getNombreTipoInstancia());
                dtoModificar.setCodSector(ti.getSector().getCodSector());
                dtoModificar.setNombreSector(ti.getSector().getNombreSector());
                dtoModificar.setCodTipoTarea(ti.getTipoTarea().getCodTipoTarea());
                dtoModificar.setNombreTipoTarea(ti.getTipoTarea().getNombreTipoTarea());
                
                }    
           return dtoModificar;
    }
    public String buscarNombSector(String filSector){
         
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
            
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(filSector)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
            List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
            for (Object x : objetoList) {
                String nombreSec = null;
                Sector sec = (Sector)x ;
                nombreSec = sec.getNombreSector();
                return nombreSec;
            }
          
          return "No se encontro el Sector"; 
    }
    public String buscarNombTipoTarea(String filTipoTarea){
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
            
            dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(filTipoTarea)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );
           
            for (Object x : objetoList) {
                String nombreTT = null;
                TipoTarea tt = (TipoTarea)x ; //por cada objeto de la lista, se lo asigno a un objeto de la clase
                nombreTT = tt.getNombreTipoTarea();
                return nombreTT;
                }                    
          return "No se encontro el TipoTarea"; 
    }
    /*
    public List<DTOAgregarTipoInstancia> filtradoSector(String filSector){
        DTOAgregarTipoInstancia dtosec = new DTOAgregarTipoInstancia();
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
            if(filSector.matches("[0-9]+") ){
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(filSector)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }else{
            dtoCrit.setAtributo("nombreSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(filSector); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }         
            List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
            List<DTOAgregarTipoInstancia> dtoList = new ArrayList<>();
            for (Object x : objetoList) {
              
                Sector sec = (Sector)x ;
                dtosec.setCodSector(sec.getCodSector());
                dtosec.setNombreSector(sec.getNombreSector());
              //  dtosec.setFechaFinVigenciaSector(sec.getFechaHoraFinVigenciaSector());
               
                
                dtoList.add(dtosec);
                }         
        return dtoList;
    }
    
    public List<DTOAgregarTipoInstancia> filtradoTT(String filTipoTarea){
        DTOAgregarTipoInstancia dtoTT = new DTOAgregarTipoInstancia();
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
            if(filTipoTarea.matches("[0-9]+") ){
            dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el TipoInstancia que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(filTipoTarea)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }else{
               dtoCrit.setAtributo("nombreTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(filTipoTarea); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            }
            
            List objetoList = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit );
            List<DTOAgregarTipoInstancia> dtoList = new ArrayList<>();
            for (Object x : objetoList) {
                TipoTarea tt = (TipoTarea)x ; //por cada objeto de la lista, se lo asigno a un objeto de la clase
                dtoTT.setCodTipoTarea(tt.getCodTipoTarea());               
                dtoTT.setNombreTipoTarea(tt.getNombreTipoTarea());
              //  dtoTT.setFechaFinVigenciaTT(tt.getFechaHoraFinVigenciaTipoTarea());
                dtoList.add(dtoTT);
                }         
        return dtoList;
    }*/
}
   

