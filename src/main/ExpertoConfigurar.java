
package main;

import DTO.DTOCriterio;
import DTO.DTOsConfiguración.*;
import java.util.ArrayList;
import java.util.List;
import entidades.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;




public class ExpertoConfigurar {
         
                
    public DTOErroresMensajes agregarConfiguracion(DTOAgregarConfiguracion dtoAgregarConfig){
        TipoCaso tc = new TipoCaso();
        DTOErroresMensajes dtoErrores = new DTOErroresMensajes();
        ConfiguracionTipoCaso configTC = new ConfiguracionTipoCaso();
        DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
        try{
        FachadaPersistencia.getInstance().iniciarTransaccion();//Instanciaciones de objetos a usar      
             
        List<DTOCriterio> validarCod = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("nroConfigTC");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(dtoAgregarConfig.getNroConfiguracion()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                validarCod.add(dtoCrit);
        try{      
            List objetoList = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",validarCod );
             int verificar = 0;
             for (Object x : objetoList) {  //Con este for verifico que no haya un código ya existente
                 configTC = (ConfiguracionTipoCaso)x; //Si ya existe ese código, settea a verificar para validar y que muestre un mensaje
                 verificar = configTC.getNroConfigTC();                
                 dtoErrores.setVerificarError(verificar);
                 
                }if(dtoErrores.getVerificarError() == 0 ){  //Comprobamos que el código no existe. Si existe settea el mensaje
                    if(dtoAgregarConfig.getNroConfiguracion() == 0){ //Verificamos que el codigo no sea cero, si es 0 Settea error
                                    dtoErrores.setVerificarError(1);
                                    dtoErrores.setErrorMensaje("El Código no esta permitido");                            
                             }else{
                                dtoErrores = validarFecha(dtoAgregarConfig.getFechaDesde());
                                    if(dtoErrores.getVerificarError()==0){
                                        
                                        dtoCrit.setAtributo("codTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                                        dtoCrit.setOperacion("=");
                                        dtoCrit.setValor(dtoAgregarConfig.getCodTipoCaso()); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                                        listadtoCrit.add(dtoCrit);


                                        //Busco el sector que ingrese por la interfaz y luego se lo asigno al Tipo Instancia que estoy creando
                                        List objetoList3 = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );
                                         for (Object x : objetoList3) {
                                             tc = (TipoCaso)x ;
                                             configTC.setTipoCaso(tc);
                                            }  

                                        //Asigno al tipo instancia que estoy creando el código y el nombre
                                        configTC.setNroConfigTC(dtoAgregarConfig.getNroConfiguracion());

                                        Date fecha = dtoAgregarConfig.getFechaDesde();
                                        SimpleDateFormat objSDF = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
                                        String fechaInicio = objSDF.format(fecha);

                                        configTC.setFechaInicioVigencia(objSDF.parse(fechaInicio));                       
                                        configTC.setFechaFinVigencia(null);
                                        configTC.setFechaVerificacion(null);
                                        FachadaPersistencia.getInstance().guardar(configTC); 
                                        
                                        
                                        
                    
                                    }}    }else{
                     dtoErrores.setErrorMensaje("El código ya existe");  //Muestra el mensaje si el código está existente
                     }
                }catch(Exception e){
                        System.out.println("No se pudo registrar la configuración de tipo caso"); 
                 }    
            }catch(Exception e){
                    System.out.println("No se pudo encontrar la configuración de tipo caso");                
        }
        return dtoErrores;
    }
    public DTOErroresMensajes modificarConfiguracion(DTOModificarConf dtoModificarConfig){
        TipoCaso tipoCaso = new TipoCaso();
        ConfiguracionTipoCaso configTipo = new ConfiguracionTipoCaso();
        DTOErroresMensajes dtoErrores = new DTOErroresMensajes();
        
        try{
            FachadaPersistencia.getInstance().iniciarTransaccion();    
            
            DTOCriterio dtoCrit = new DTOCriterio();//Lo necesitamos para hacer la busqueda en la base de datos
            List<DTOCriterio> listadtoCrit = new ArrayList<>();
            dtoCrit.setAtributo("nroConfigTC");  
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(dtoModificarConfig.getNroConfiguracion()); 
            
            listadtoCrit.add(dtoCrit);
            
            try{
                List objetoList = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",listadtoCrit );
                for (Object x : objetoList){
                    configTipo = (ConfiguracionTipoCaso)x;                 
                 
                    dtoCrit.setAtributo("codTipoCaso");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                    dtoCrit.setOperacion("=");
                    dtoCrit.setValor(dtoModificarConfig.getCodTipoCaso()); 
                    listadtoCrit.add(dtoCrit);
                    
                    List tipoCasoMof = FachadaPersistencia.getInstance().buscar("TipoCaso",listadtoCrit );
                    for (Object h : tipoCasoMof) {
                        tipoCaso = (TipoCaso)h ;
                        configTipo.setTipoCaso(tipoCaso);
                    }                      
                  
                    configTipo.setFechaInicioVigencia(dtoModificarConfig.getFechaDesde());
                    FachadaPersistencia.getInstance().modificar(configTipo);  
                } 
            }catch(Exception e){
                System.out.println("No se pudo modificar el TipoCaso"); 
            }    
        }catch(Exception e){
               System.out.println("No se pudo encontrar el TipoCaso");                
        }
          
       return dtoErrores;
    }
    public DTOVisualizarVerificar visualizarDatosYVerificar(int numConf){
        DTOVisualizarVerificar dtoVisu = new DTOVisualizarVerificar();
        DTOCriterio dtoCrit = new DTOCriterio();
        DTORenglones dtoRenglones = new DTORenglones();
        FachadaPersistencia.getInstance().iniciarTransaccion();//Instanciaciones de objetos a usar      
             
        List<DTOCriterio> validarCod = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
                dtoCrit.setAtributo("nroConfigTC");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
                dtoCrit.setOperacion("=");
                dtoCrit.setValor(numConf); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
                validarCod.add(dtoCrit);
        List datosFachada = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",validarCod );
        
        for(Object x : datosFachada){
           ConfiguracionTipoCaso llenado = (ConfiguracionTipoCaso) x;
            
            dtoVisu.setNroConfigTipoCaso(llenado.getNroConfigTC());
            dtoVisu.setCodTipoCaso(llenado.getTipoCaso().getCodTipoCaso());
            dtoVisu.setNombreTipoCaso(llenado.getTipoCaso().getNombreTipoCaso());
            dtoVisu.setFechaInicioVig(llenado.getFechaInicioVigencia());
            dtoVisu.setFechaFinVig(llenado.getFechaFinVigencia());
            dtoVisu.setFechaVerificacion(llenado.getFechaVerificacion());
            
            for (int i = 0; i < llenado.getTipoCtipoIns().size(); i++) { //Lleno la lista del dto con los renglones asignados
                dtoRenglones.setOrdenTCTI(llenado.getTipoCtipoIns().get(i).getOrdenTipoCasoTipoInstancia());
                dtoRenglones.setMinutosMAXReso(llenado.getTipoCtipoIns().get(i).getMinutosMaximoResolucion());
                dtoRenglones.setCodTI(llenado.getTipoCtipoIns().get(i).getTipoInstancia().getCodTipoInstancia());
                dtoRenglones.setNombreTI(llenado.getTipoCtipoIns().get(i).getTipoInstancia().getNombreTipoInstancia());               
                dtoVisu.addRenglones(dtoRenglones);                
            }           
        }
        
      return dtoVisu;  
    }
      
    public DTOErroresMensajes verificarConfiguracion(int numConf){
        Date fechaactual = new Date(System.currentTimeMillis());
        ConfiguracionTipoCaso configTC = new ConfiguracionTipoCaso();       
        DTOErroresMensajes dtoErrores = new DTOErroresMensajes();
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
        List<DTOCriterio> busquedaConf = new ArrayList<>();
        int codTC = 0;
        Date fechaIVaVerificar = null;
        
            dtoCrit.setAtributo("nroConfigTC");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(numConf); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            List objetoList = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",listadtoCrit );
            for(Object x : objetoList){
                configTC = (ConfiguracionTipoCaso) x;
                fechaIVaVerificar = configTC.getFechaInicioVigencia();
                codTC  = configTC.getTipoCaso().getCodTipoCaso();                    
            }
                      
            List objetoList1 = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",busquedaConf);
            for(Object x:objetoList1){
                configTC = (ConfiguracionTipoCaso) x;
                if(configTC.getFechaFinVigencia() == null){
                    if(configTC.getFechaVerificacion() != null){
                        if(configTC.getTipoCaso().getCodTipoCaso() == codTC){
                            if(fechaIVaVerificar.before(configTC.getFechaInicioVigencia())){
                                dtoErrores.setVerificarError(1);
                                dtoErrores.setErrorMensaje("La fechaDesde ingresada debe ser mayor a la fechaInicioVigencia de la configuración anterior verificada");
                                return dtoErrores;
                            }
                        }
                    }
                }
            }
            if(fechaIVaVerificar.before(fechaactual)){
                dtoErrores.setVerificarError(1);
                dtoErrores.setErrorMensaje("La fechaInicioVigencia debe ser mayor a la fechaActual");
                return dtoErrores;
            }
            dtoCrit.setAtributo("nroConfigTC");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(numConf); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            List objetoList2 = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",listadtoCrit );
            for(Object x : objetoList2){
                configTC = (ConfiguracionTipoCaso) x;
                configTC.setFechaVerificacion(fechaactual);
            }
            cerrarconfiguraciónanterior(numConf);
               
        return dtoErrores;
    }
    public void cerrarconfiguraciónanterior(int numConf) {
        ConfiguracionTipoCaso configTC = new ConfiguracionTipoCaso();       
        DTOCriterio dtoCrit = new DTOCriterio();
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
        List<DTOCriterio> busquedaConf = new ArrayList<>(); 
        int codTC = 0;
        Date fechaIVaVerificar = null;
        try{
        dtoCrit.setAtributo("nroConfigTC");  //Utilizamos la sentencias para buscar el sector que pusimos en el filtro 
            dtoCrit.setOperacion("=");
            dtoCrit.setValor(numConf); //En el caso de utilizar mas filtros usamos la cantidad necesaria de estas 3 sentencias
            listadtoCrit.add(dtoCrit);
            List objetoList = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",listadtoCrit );
            
            for(Object x : objetoList){
                configTC = (ConfiguracionTipoCaso) x;              
                codTC  = configTC.getTipoCaso().getCodTipoCaso(); 
                fechaIVaVerificar = configTC.getFechaInicioVigencia();
            }
                      
            List objetoList1 = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",busquedaConf);
            for(Object x:objetoList1){
                configTC = (ConfiguracionTipoCaso) x;
                if(configTC.getFechaFinVigencia() == null){
                    if(configTC.getFechaVerificacion() != null){
                        if(configTC.getTipoCaso().getCodTipoCaso() == codTC){
                            
                           SimpleDateFormat objSDF = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
                           String fechaEstablecer = objSDF.format(fechaIVaVerificar);
                            int anio=0,mes=0,dia = 0,hora=0,minuto=0,segundo=0;
                                try {
                                     String fechaEntera = fechaEstablecer;                                                          
                                     Date miFecha = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").parse(fechaEntera);

                                     Calendar calendario = Calendar.getInstance();                                                         
                                     calendario.setTime(miFecha);

                                      anio = calendario.get(Calendar.YEAR);
                                      mes = calendario.get(Calendar.MONTH);                                                      
                                      dia = calendario.get(Calendar.DAY_OF_MONTH);                                                          
                                      hora = calendario.get(Calendar.HOUR_OF_DAY);                                                            
                                      minuto = calendario.get(Calendar.MINUTE);
                                                calendario.add(minuto, -1);
                                      segundo = calendario.get(59);
                                     
                                 } catch (ParseException ex) {
                                     System.out.println("No se pudo armar la fecha");
                                 }     
                                
                           configTC.setFechaFinVigencia(objSDF.parse((dia+"/"+mes+"/"+anio+"-"+hora+":"+minuto+":"+segundo)));
                           JOptionPane.showMessageDialog(null, fechaEstablecer);
                        }
                    }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Algo fallo");
        }
    }
    public DTOErroresMensajes validarFecha(Date fechaDesde){
        ConfiguracionTipoCaso configTC = new ConfiguracionTipoCaso();
        DTOErroresMensajes dtoErrores = new DTOErroresMensajes();
        Date fechaactual = new Date(System.currentTimeMillis());
        
        if(fechaDesde.after(fechaactual)){                   
            List<DTOCriterio> validarCod = new ArrayList<>();//pasamos esta lista a la fachada de persistencia
             
       
            List datosFachada = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",validarCod );
            for(Object x: datosFachada){
                configTC = (ConfiguracionTipoCaso)x;                
                if(configTC.getFechaFinVigencia() == null){
                  //  if(configTC.getFechaVerificacion() != null){
                        if(fechaDesde.before(configTC.getFechaInicioVigencia())){                        
                            dtoErrores.setErrorMensaje("Fecha No permitida, ingrese otra");
                            dtoErrores.setVerificarError(1);   
                        }
                  //  } 
                }
            }
           
        }else{
            dtoErrores.setErrorMensaje("Debe ser una fecha posterior a la actual");
            dtoErrores.setVerificarError(1); 
        }
        return dtoErrores;
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
            if(tipoCaso.getFechaFinVigenciaTipoCaso() != null) return "El tipo de caso ingresado está dado de baja";
            return tipoCaso.getNombreTipoCaso();     
        }else {
            return "No existe el Tipo Caso Ingresado";
        }

    }
    public DTOModificarConf buscarPorNumConfig(int codSeleccionado){ 
        FachadaPersistencia.getInstance().iniciarTransaccion();  
        DTOCriterio dtoCrit = new DTOCriterio(); //Este DTO es el encargado de comunicarse con Hibernate y traernos las cosas de la base de datos
        List<DTOCriterio> listadtoCrit = new ArrayList<>();//pasamos esta lista a la fachada de persistenciaDTOCriterio dtoCrit = new DTOCriterio();
        DTOModificarConf dtoMod = new DTOModificarConf();
        dtoCrit.setAtributo("nroConfigTC");  
        dtoCrit.setOperacion("=");
        dtoCrit.setValor(codSeleccionado); 
        listadtoCrit.add(dtoCrit);
        List objetoList = FachadaPersistencia.getInstance().buscar("ConfiguracionTipoCaso",listadtoCrit );
        
        for (Object x : objetoList) {
            ConfiguracionTipoCaso configCaso = (ConfiguracionTipoCaso)x;
            dtoMod.setNroConfiguracion(configCaso.getNroConfigTC());
            dtoMod.setCodTipoCaso(configCaso.getTipoCaso().getCodTipoCaso());
            dtoMod.setNombreTipoCaso(configCaso.getTipoCaso().getNombreTipoCaso());
            dtoMod.setFechaDesde(configCaso.getFechaInicioVigencia());
        }       
        
        return dtoMod;
    }
    
    
}
