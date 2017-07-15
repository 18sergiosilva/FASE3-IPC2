/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author elizabeth
 */
@WebService(serviceName = "WSProyectoIPC2")
public class WSProyectoIPC2 {




    /**
     * Web service operation
     */
    @WebMethod(operationName = "registroIndividual")
    public String registroIndividual(@WebParam(name = "CUI") int CUI, @WebParam(name = "primerNombre") String primerNombre, @WebParam(name = "segundoNombre") String segundoNombre, @WebParam(name = "tercerNombre") String tercerNombre, @WebParam(name = "primerApellido") String primerApellido, @WebParam(name = "segundoApellido") String segundoApellido, @WebParam(name = "fecha") String fecha, @WebParam(name = "edad") int edad, @WebParam(name = "pass") String pass) {
        funciones func = new funciones();
        String respuesta = func.registrarIndividual(CUI, primerNombre, segundoNombre, tercerNombre, primerApellido, segundoApellido, fecha, edad, pass);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registroEmpresa")
    public String registroEmpresa(@WebParam(name = "Patente") int Patente, @WebParam(name = "nombre") String nombre, @WebParam(name = "encargado1") String encargado1, @WebParam(name = "encargado2") String encargado2, @WebParam(name = "encargado3") String encargado3, @WebParam(name = "pass") String pass) {
        funciones func = new funciones();
        String respuesta = func.registrarEmpresa(Patente, nombre, encargado1, encargado2, encargado3, pass);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "empleados")
    public String empleados(@WebParam(name = "salario") double salario, @WebParam(name = "patente") int patente, @WebParam(name = "cui") int cui) {
        funciones func = new funciones();
        String respuesta = func.empleado(salario, patente, cui);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "prestamos")
    public String prestamos(@WebParam(name = "monto") double monto, @WebParam(name = "modalidad") int modalidad, @WebParam(name = "cliente") int cliente) {
        funciones func = new funciones();
        String respuesta = func.ingresarPrestamo(monto, modalidad, cliente);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarProducto")
    public String agregarProducto(@WebParam(name = "nombreProducto") String nombreProducto,@WebParam(name = "punto") int punto) {
        funciones func = new funciones();
        String respuesta = func.agregarProducto(nombreProducto,punto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarProducto")
    public String cambiarProducto(@WebParam(name = "fecha") String fecha, @WebParam(name = "cui") int cui, @WebParam(name = "codigoProducto") int codigoProducto) {
        funciones func = new funciones();
        String respuesta = func.cambiarProducto(fecha, cui, codigoProducto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearCuenta")
    public String crearCuenta(@WebParam(name = "tipo") String tipo, @WebParam(name = "fondos") double fondos, @WebParam(name = "interes") double interes, @WebParam(name = "plazo") int plazo, @WebParam(name = "cui") int cui) {
        funciones func = new funciones();
        String respuesta = func.crearCuenta(tipo, fondos, interes, plazo, cui);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagarPrestamo")
    public String pagarPrestamo(@WebParam(name = "monto") double monto, @WebParam(name = "fecha") String fecha, @WebParam(name = "nocuenta") int nocuenta, @WebParam(name = "idprestamo") int idprestamo) {
        funciones func = new funciones();
        String respuesta = func.pagarPrestamo(monto, fecha, nocuenta, idprestamo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "solicitarChequera")
    public String solicitarChequera(@WebParam(name = "nocuenta") int nocuenta) {
        funciones func = new funciones();
        String respuesta = func.solicitarTalonario(nocuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarProveedor")
    public String agregarProveedor(@WebParam(name = "nombre") String nombre) {
        funciones func = new funciones();
        String respuesta = func.agregarProveedor(nombre);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarCheque")
    public String cambiarCheque(@WebParam(name = "cuenta") int cuenta, @WebParam(name = "monto") double monto) {
        funciones func = new funciones();
        String respuesta = func.chequesCambiados(cuenta, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarAgencia")
    public String agregarAgencia(@WebParam(name = "departamento") String departamento, @WebParam(name = "municipio") String municipio) {
        funciones func = new funciones();
        String respuesta = func.agregarAgencia(departamento, municipio);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarOperador")
    public String agregarOperador(@WebParam(name = "categoria") int categoria, @WebParam(name = "nomnbre") String nomnbre, @WebParam(name = "apellido") String apellido, @WebParam(name = "agencia") int agencia,@WebParam(name = "pass") String pass) {
        funciones func = new funciones();
        String respuesta = func.agregarOperador(categoria, nomnbre, apellido, agencia,pass);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarStock")
    public String agregarStock(@WebParam(name = "stock") int stock, @WebParam(name = "producto") int producto, @WebParam(name = "proveedor") int proveedor) {
        funciones func = new funciones();
        String respuesta = func.agregarStock(stock, proveedor, producto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "activarDesactivarCuenta")
    public String activarDesactivarCuenta(@WebParam(name = "accion") String accion, @WebParam(name = "noCuenta") int noCuenta) {
        funciones func = new funciones();
        String respuesta = func.suspenderActivarCuenta(accion, noCuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "iniciarSesion")
    public String iniciarSesion(@WebParam(name = "tipo") String tipo, @WebParam(name = "identificador") int identificador, @WebParam(name = "password") String password) {
        funciones func = new funciones();
        String respuesta = func.iniciarSesion(tipo, identificador, password);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarPassword")
    public String cambiarPassword(@WebParam(name = "tipo") String tipo, @WebParam(name = "indentificador") int indentificador, @WebParam(name = "biejo") String biejo, @WebParam(name = "nuevo") String nuevo) {
        funciones func = new funciones();
        String respuesta = func.cambiarPass(tipo, indentificador, biejo, nuevo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "depositoEfectivo")
    public String depositoEfectivo(@WebParam(name = "noCuenta") int noCuenta, @WebParam(name = "monto") double monto,@WebParam(name = "cliente") int cliente) {
        funciones func = new funciones();
        String respuesta = func.depositoEfectivo(noCuenta, monto,cliente);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "depositoCheque")
    public String depositoCheque(@WebParam(name = "cuentarestar") int cuentarestar, @WebParam(name = "cuentasumar") int cuentasumar, @WebParam(name = "monto") double monto,@WebParam(name = "cliente") int cliente) {
        funciones func = new funciones();
        String respuesta = func.depositoCheque(cuentarestar, cuentasumar, monto,cliente);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "recibe")
    public String[] recibe(@WebParam(name = "noCuenta") int noCuenta) {
        funciones func = new funciones();
        String[] respuesta = func.recibe(noCuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retiroEfectivo")
    public String retiroEfectivo(@WebParam(name = "noCuenta") int noCuenta, @WebParam(name = "monto") double monto) {
        funciones func = new funciones();
        String respuesta = func.retiroEfectivo(noCuenta, monto);
        return respuesta;
    }
    
    
    
   
    /**
     * Web service operation
     */
    @WebMethod(operationName = "aprobarRechazarPrestamo")
    public String aprobarRechazarPrestamo(@WebParam(name = "accion") String accion, @WebParam(name = "prestamo") int prestamo) {
         funciones func = new funciones();
        String respuesta = func.aprobarRechazarPrestamo(accion, prestamo);
        return respuesta;
    }

   
/**
     * Web service operation
     */
    @WebMethod(operationName = "transaccionPropia")
    public String transaccionPropia(@WebParam(name = "cuentaBeneficiaria") int cuentaBeneficiaria, @WebParam(name = "cuentaBenefactora") int cuentaBenefactora, @WebParam(name = "monto") double monto,@WebParam(name = "cliente") int cliente) {
         funciones func = new funciones();
        String respuesta = func.transaccionesPropias(cuentaBenefactora, cuentaBeneficiaria, monto,cliente);
        return respuesta;
    }
   
 /**
     * Web service operation
     */
    @WebMethod(operationName = "historialPuntos")
    public String historialPuntos(@WebParam(name = "cliente") int cliente) {
       funciones func = new funciones();
        String respuesta = func.historialPuntos(cliente);
        return respuesta;
    }
    
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumarPuntos")
    public String sumarPuntos(@WebParam(name = "cuenta") int cuenta, @WebParam(name = "puntos") int puntos) {
         funciones func = new funciones();
        String respuesta = func.sumarPuntos(cuenta, puntos);
        return respuesta;
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "aprobarCuenta")
    public String aprobarCuenta(@WebParam(name = "cuentaPrincipal") int cuentaPrincipal, @WebParam(name = "cuentaSecundaria") int cuentaSecundaria) {
        funciones func = new funciones();
        String respuesta = func.aprobarTerceros(cuentaPrincipal, cuentaSecundaria);
        return respuesta;
    }
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "transaccionesTerceras")
    public String transaccionesTerceras(@WebParam(name = "cuenta1") int cuenta1, @WebParam(name = "cuenta2") int cuenta2, @WebParam(name = "monto") double monto, @WebParam(name = "cliente") int cliente) {
        funciones func = new funciones();
        String respuesta = func.depositoTerceros(cuenta1, cuenta2, monto, cliente);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "promedioDepositos")
    public String promedioDepositos(@WebParam(name = "cuenta") int cuenta) {
        funciones func = new funciones();
        String respuesta = func.promedioDepositos(cuenta);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "promedioRetiros")
    public String promedioRetiros(@WebParam(name = "cuenta") int cuenta) {
        funciones func = new funciones();
        String respuesta = func.promedioRetiros(cuenta);
        return respuesta;
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "verProductos")
    public String[] verProductos() {
        funciones func = new funciones();
        String [] respuesta = func.verProductos();
        return respuesta;
    }
    
   
/**
     * Web service operation
     */
    @WebMethod(operationName = "encabezado")
    public String encabezado(@WebParam(name = "cuenta") int cuenta) {
        funciones func = new funciones();
        String respuesta = func.encabezado(cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagoSalario")
    public String pagoSalario(@WebParam(name = "empresa") int empresa) {
        funciones func = new funciones();
        String respuesta = func.pagos(empresa);
        return respuesta;
    }

    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ECDeposito")
    public String[] ECDeposito(@WebParam(name = "cuenta") int cuenta) {
        funciones func = new funciones();
        String [] respuesta = func.DepositosEC(cuenta);
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ECRetiro")
    public String[] ECRetiro(@WebParam(name = "cuenta") int cuenta) {
        funciones func = new funciones();
        String [] respuesta = func.RetirosEC(cuenta);
        return respuesta;
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "verPres")
    public String[] verPres(@WebParam(name = "empresa") int empresa) {
        funciones func = new funciones();
        String [] respuesta = func.verPrestamos(empresa);
        return respuesta;
    }
    
    
}
