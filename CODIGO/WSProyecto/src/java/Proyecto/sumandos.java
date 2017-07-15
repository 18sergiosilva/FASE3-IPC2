/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author elizabeth
 */
public class sumandos {
    
    int codigoEmpleado = 1;
    int codigoPrestamo = 1;
    int codigoProducto = 1;
    int productosCambiados = 1;
    int nocuenta = 1;
    int idPago = 1;
    int notalonario = 1;
    int idProveedor = 1;
    int nocheque = 1;
    int idagencia = 1;
    int idoperador = 1;
    int idoperadoresproducto = 1;
    int registroOperaciones = 1;
    
    public sumandos(){
        
    }
    
    public void sumar(String rubro){
        switch(rubro){
            case "codigoempleado":
                codigoEmpleado++;
                break;
            case "codigoPrestamo":
                codigoPrestamo++;
                break;
            case "codigoProducto":
                codigoProducto = codigoProducto+1;
                break;
            case "productosCambiados":
                productosCambiados++;
                break;
            case "nocuenta":
                nocuenta++;
                break;
            case "idPago":
                idPago++;
                break;
            case "notalonario":
                notalonario++;
                break;
            case "idProveedor":
                idProveedor++;
                break;
             case "nocheque":
                nocheque++;
                break;
            case "idoperador":
                idoperador++;
                break;
            case "idoperadoresproducto":
                idoperadoresproducto++;
                break;
            case "registroOperaciones":
                registroOperaciones++;
                break;
            case "idagencia":
                idagencia++;
                break;
   
        }
                
    }
}
