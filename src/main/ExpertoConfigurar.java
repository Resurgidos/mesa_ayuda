
package main;

import DTO.DTOCriterio;
import DTO.DTOsConfiguración.DTOTipoConfiguracionGrilla;
import java.util.ArrayList;
import java.util.List;
import entidades.*;

public class ExpertoConfigurar {
        
    public void agregarConfiguracion(DTOTipoConfiguracionGrilla dtoTC){
         
    }
    
    public List<DTOTipoConfiguracionGrilla> filtroConfiguracion(String nombreConfiguracion){
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(nombreConfiguracion.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
//            dtoCrit.setAtributo("codTipoInstancia");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
//            dtoCrit.setOperacion("=");
//            dtoCrit.setValor(Integer.parseInt(nombreConfiguracion)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
//            listadtoCrit.add(dtoCrit);
        }else{
//            dtoCrit.setAtributo("nroConfigTC");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
//            dtoCrit.setOperacion("like");
//            dtoCrit.setValor("%"+nombreConfiguracion+"%"); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
//            listadtoCrit.add(dtoCrit);       
        }
        
        List objetoList = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",listadtoCrit );
        List<DTOTipoConfiguracionGrilla> dtoList = new ArrayList<>();
        
        for (Object x : objetoList) {
            DTOTipoConfiguracionGrilla dtoConfig = new DTOTipoConfiguracionGrilla();
            
            ConfiguracionTipoCaso tc = (ConfiguracionTipoCaso) x;
            
            dtoConfig.setNroConfig(tc.getNroConfigTC());         
            dtoConfig.setCodTipoCaso(tc.getTipoCaso().getCodTipoCaso());
            dtoConfig.setFechaInicioVigencia(tc.getFechaInicioVigencia());
            dtoConfig.setFechaFinVigencia(tc.getFechaFinVigencia());
            dtoConfig.setFechaVerificacion(tc.getFechaVerificacion());
            
            dtoList.add(dtoConfig);        
        }
     
        return dtoList;  
    }

    public String inputCodTipoCaso(String codCaso) {
        
        System.out.println("input"+ codCaso);
        
        FachadaPersistencia.getInstance().iniciarTransaccion();
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();
        
        dtoCrit.setAtributo("codTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
        dtoCrit.setOperacion("=");
        dtoCrit.setValor(Integer.parseInt(codCaso)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
        listadtoCrit.add(dtoCrit);
        
        List objetoList = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );
            
        System.out.println(objetoList.size());
        
        if(objetoList.size() > 0){
            TipoCaso tipoCaso = (TipoCaso) objetoList.get(0);        
            return tipoCaso.getNombreTipoCaso();     
        }else {
            return "No existe el Tipo Caso Ingresado";
        }

    }
}
