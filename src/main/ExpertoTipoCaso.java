/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DTO.*;
import entidades.TipoCaso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julie
 */
public class ExpertoTipoCaso {
    public List<DTOTipoCaso> filtrado(String nombreTipoCaso) {
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia

        if(nombreTipoCaso.matches("[0-9]+") ) {//El matches es propia d ejava y evalua lo que hay entre parentesis
            dtoCrit.setAtributo("codTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(Integer.parseInt(nombreTipoCaso)); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }else {
            dtoCrit.setAtributo("nombreTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("like");
            dtoCrit.setValor(nombreTipoCaso); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
        }


        List objetoList = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );
        List<DTOTipoCaso> dtoList = new ArrayList<>();
        for (Object x : objetoList) {
            DTOTipoCaso dtoTipoCaso = new DTOTipoCaso();
            TipoCaso tipocaso = (TipoCaso) x;
            dtoTipoCaso.setCodTipoCaso(tipocaso.getCodTipoCaso());
            dtoTipoCaso.setNombreTipoCaso(tipocaso.getNombreTipoCaso());

            if(tipocaso.getFechaFinVigenciaTipoCaso()!= null){
            dtoTipoCaso.setFechaFinVigenciaTipoCaso(tipocaso.getFechaFinVigenciaTipoCaso());
            }
            dtoList.add(dtoTipoCaso);
            
            
        }
       return dtoList ;

    }  

    public DTOTipoCaso agregarTipoCaso(DTOTipoCaso dtoTCaso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DTOTipoCaso modificarTipoCaso(DTOTipoCaso dtoTCaso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void bajaTipoCaso(DTOTipoCaso dtoTCaso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
