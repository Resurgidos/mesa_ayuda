
package main;

import DTO.DTOCriterio;
import DTO.DTOTipoInstancia;
import entidades.*;
import java.util.ArrayList;
import java.util.List;

public class ExpertoTipoInstancia {

    public DTOTipoInstancia agregarTipoInstancia(DTOTipoInstancia dtoTI){
       
        
      return null;  
    }
    
    public List<DTOTipoInstancia> filtroAgregar(DTOTipoInstancia dtoTI){
         DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
        
        FachadaPersistencia.getInstance().iniciarTransaccion();  
       if(dtoTI.getCodSector()!=0){
        dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
        dtoCrit.setOperacion("=");
        dtoCrit.setValor(dtoTI.getCodSector()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
        listadtoCrit.add(dtoCrit);
       }else if(dtoTI.getCodTipoTarea() !=0){
        dtoCrit.setAtributo("codTipoTarea");  //Utilizamos la sentencias para buscar el TipoTarea que pusimos en el filtro 
        dtoCrit.setOperacion("=");
        dtoCrit.setValor(dtoTI.getCodTipoTarea()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
        listadtoCrit.add(dtoCrit);
       }
        List objetoList = FachadaPersistencia.getInstance().buscar("Sector",listadtoCrit );
        List objetoList2 = FachadaPersistencia.getInstance().buscar("TipoTarea",listadtoCrit ); 
        List<DTOTipoInstancia> fil = new ArrayList<>();
        DTOTipoInstancia dtoFil = new DTOTipoInstancia();
         if(dtoTI.getCodSector()!=0){for(Object x : objetoList){
            
            Sector sec = (Sector)x;
            dtoFil.setNombreSector(sec.getNombreSector());
            fil.add(dtoFil);
            System.out.println(fil.get(0));
        } }else if(dtoTI.getCodTipoTarea() !=0){    
          for(Object x : objetoList2){
            
            TipoTarea tt = (TipoTarea) x;
            dtoFil.setNombreTipoTarea(tt.getNombreTipoTarea());
            fil.add(dtoFil);
              System.out.println(fil.get(1));
          }}
          return fil;
    }
    public List<DTOTipoInstancia> filtradoTI(DTOTipoInstancia dtoTI){
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
        if(dtoTI.getCodTipoInstancia() != 0) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoTI.getCodTipoInstancia()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else if(dtoTI.getNombreTipoInstancia() != "") {
            dtoCrit.setAtributo("nombreSector");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(dtoTI.getNombreTipoInstancia()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);                   
        }
        return null;
    }
}
