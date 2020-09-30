
package main;

import DTO.DTOCriterio;


import DTO.DTOTipoInstancia;
import entidades.*;
import java.util.ArrayList;
import java.util.List;


public class ExpertoTipoInstancia {
          

    public DTOTipoInstancia agregarTipoInstancia(DTOTipoInstancia dtoTI){  
      //   try{
        FachadaPersistencia.getInstance().iniciarTransaccion();          
        //Instanciaciones de objetos a usar      
        TipoInstancia TI = new TipoInstancia();          
                  
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
        List<DTOCriterio> listadtoTraer = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                /*dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoTI.getCodTipoInstancia()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                listadtoCrit.add(dtoCrit);*/
                
               dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoTI.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                listadtoTraer.add(dtoCrit);
                
                dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoTI.getCodTipoTarea()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                listadtoTraer.add(dtoCrit);
                
                
                List objetoList3 = FachadaPersistencia.getInstance().buscar("Sector",listadtoTraer );
                List objetoList2 = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoTraer);
              //  List objetoList = FachadaPersistencia.getInstance().buscar("TipoInstancia",listadtoCrit );
                 TI.setCodTipoInstancia(dtoTI.getCodTipoInstancia());
                 TI.setNombreTipoInstancia(dtoTI.getNombreTipoInstancia());
                 for (Object x : objetoList3) {
                                        Sector sec = (Sector)x ;
                                        TI.setSector((Sector)sec);
                                        }
                                        
                                        for (Object x : objetoList2) {
                                        TipoTarea tt = (TipoTarea)x ;
                                        TI.setTipoTarea(tt);
                                        
                FachadaPersistencia.getInstance().guardar(TI); 
                                            System.out.println("Se guardo");
                                        
             /*   try{ 
                                        int verificar = 0;
                    System.out.println("Muestrafjskdgjskdbgkjs,kdbglfdnhdf");
                        for(Object x : objetoList){
                            TipoInstancia ti= (TipoInstancia)x;
                            verificar = ti.getCodTipoInstancia(); 
                            dtoTI.setVerificarError(verificar);
                            }
                            System.out.println(verificar);
                            if(dtoTI.getVerificarError()== 0 ){ //Verificamos que El codigo no se repita
                                //Pasamos los parametros al Sector   
                                if(dtoTI.getCodTipoInstancia()== 0){ //Verificamos que el codigo no sea cero
                                    dtoTI.setVerificarError(1);
                                    dtoTI.setErrorMensaje("El Código no esta permitido");                                                                        
                                }else{
                                   
                                    
                                 /*   
                                        
                                        
                                        }
                                        System.out.println("LLego");
                                               
                            }}else{
                                dtoTI.setErrorMensaje("El código ya existe");        
                 }}catch(Exception e){
                        System.out.println("No se pudo registrar el sector"); 
                 }    
            }catch(Exception e){
                    System.out.println("No se pudo encontrar el sector");                
            }*/
        //return dtoTI;
                                        }
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
   

