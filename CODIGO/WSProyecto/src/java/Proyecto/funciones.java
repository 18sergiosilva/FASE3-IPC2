/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author elizabeth
 */
public class funciones {
    
    Conexion conexion;
    
    
    sumandos ids = new sumandos();
    
    public funciones(){
        conexion = new Conexion();
    }
    
    public String registrarIndividual(int CUI, String primerNombre, String segundoNombre, String tercerNombre, String primerApellido, String segundoApellido, String fecha, int edad,String pass){
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into clienteindividual(CUI,primerNombre,segundoNombre,tercerNombre,primerApellido,segundoApellido,nacimiento,edad,puntosAcumulados,puntosVencidos,puntosCambiados,pass) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, CUI);
            sentencia.setString(2, primerNombre);
            sentencia.setString(3, segundoNombre);
            sentencia.setString(4, tercerNombre);
            sentencia.setString(5, primerApellido);
            sentencia.setString(6, segundoApellido);
            sentencia.setString(7, fecha);
            sentencia.setInt(8, edad);
            sentencia.setInt(9, 0);
            sentencia.setInt(10, 0);
            sentencia.setInt(11, 0);
            sentencia.setString(12,pass);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "REGISTRO EXITOSO";
            }
            
        }
        catch(Exception e){
            
                    respuesta = "NO SE PUDO REGISTRAR";
                    System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    
    
    
    public String registrarEmpresa(int patente, String nombre, String encargado1, String encargado2, String encargado3,String pass){
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into empresa(patenteEmpresa,nombreEmpresa,encargado1,encargado2,encargado3,pass) values (?,?,?,?,?,?)");
            sentencia.setInt(1, patente);
            sentencia.setString(2, nombre);
            sentencia.setString(3, encargado1);
            sentencia.setString(4, encargado2);
            sentencia.setString(5, encargado3);
            sentencia.setString(6,pass);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "REGISTRO EXITOSO";
            }
            
        }
        catch(Exception e){
            
                    respuesta = "NO SE PUDO REGISTRAR";
                    System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    
    public String empleado(double salario, int patente, int cui){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into empleados(salario,empresa,cliente) values (?,?,?)");
           
            sentencia.setDouble(1, salario);
            sentencia.setInt(2, patente);
            sentencia.setInt(3, cui);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA REGISTRADO EL EMPLEADO CORRECTAMENTE";
                
            }
        } catch(Exception e){
            respuesta = "NO SE HA REGISTRADO EL EMPLEADO";
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    
    
    
    public String ingresarPrestamo(double monto, int modalidad, int cui){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into prestamos(monto,modalidad,aprobado,estado,cliente) values (?,?,?,?,?)");
           
            sentencia.setDouble(1, monto);
            sentencia.setInt(2, modalidad);
            sentencia.setInt(3,0);
            sentencia.setInt(4,0);
            sentencia.setInt(5,cui);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA AGREGADO EL PRESTAMO CORRECTAMENTE";
            }
            
            
        } catch(Exception e){
            respuesta = "NO SE HA AGREGADO EL PRESTAMO";
            System.out.println(e);
        }
        
        return respuesta;
    }
    
    
    
    public String agregarProducto(String nombre,int punto){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into productos(nombreProducto,puntos) values (?,?)");
            
            sentencia.setString(1,nombre);
            sentencia.setInt(2,punto);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA AGREGADO EL PRODUCTO CORRECTAMENTE";
            }
            
        } catch(Exception e){
            
            respuesta = "NO SE HA AGREGADO EL PRODUCTO" + e.toString();
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    public String cambiarProducto(String fecha, int cui, int cproducto){
        
        String respuesta = null;
        int uno,dos,tres,cuatro;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia1 = base.prepareStatement("select * from clienteindividual where CUI = ?");
            sentencia1.setInt(1,cui);
            ResultSet rs = sentencia1.executeQuery();
            
            if (rs.next()){
            
                uno = Integer.parseInt(rs.getString(9));
                dos = Integer.parseInt(rs.getString(11));
                
                PreparedStatement sentencia2 = base.prepareStatement("select * from productos where idProductos = ?");
                sentencia2.setInt(1,cproducto);
                ResultSet rs2 = sentencia2.executeQuery();
                
                if (rs2.next()){
                    
                    tres = Integer.parseInt(rs2.getString(3));
                    
                    if (uno>=tres){
                        
                        uno = uno - tres;
                        dos = dos + tres;
                        
                        PreparedStatement sentencia3 = base.prepareStatement("update clienteindividual set puntosAcumulados = ? where CUI = ?");
                        sentencia3.setDouble(1,uno);
                        sentencia3.setInt(2,cui);
                        ResultSet rs3 = sentencia3.executeQuery();
                        rs3.next();
                        
                        PreparedStatement sentencia4 = base.prepareStatement("update clienteindividual set puntosCambiados = ? where CUI = ?");
                        sentencia4.setDouble(1,dos);
                        sentencia4.setInt(2,cui);
                        ResultSet rs4 = sentencia4.executeQuery();
                        rs4.next();
                        
                        PreparedStatement sentencia5 = base.prepareStatement("select stock from proveedoresproducto where producto = ?");
                        sentencia5.setInt(1,cproducto);
                        ResultSet rs5 = sentencia5.executeQuery();
                         
                        
                        
                        if (rs5.next()){
                            cuatro = Integer.parseInt(rs5.getString(1));
                            
                            PreparedStatement sentencia6 = base.prepareStatement("update proveedoresproducto set stock = ? where producto = ?");
                        sentencia6.setInt(1,(cuatro -1));
                        sentencia6.setInt(2,cproducto);
                        ResultSet rs6 = sentencia6.executeQuery();
                        rs6.next();
                        
                        PreparedStatement sentencia = base.prepareStatement("insert into productoscambiados(fecha,cliente,producto) values (?,?,?)");
                        
                        sentencia.setString(1,fecha);
                        sentencia.setInt(2,cui);
                        sentencia.setInt(3,cproducto);
            
            
                        int respuestabase = sentencia.executeUpdate();
            
                        if (respuestabase == 1){
                         respuesta = "SE HA CAMBIADO EL PRODUCTO";
                        }
                        }
                        
                        
                        
                        
                        
                    } else {
                        respuesta = "NO CUENTA CON PUNTOS SUFICIENTES";
                    }
                    
                    
                } else {
                    respuesta = "NO SE HA CAMBIADO EL PRODUCTO";
                }
                
            } else {
                respuesta = "NO SE HA CAMBIADO EL PRODUCTO";
            }

        } catch(Exception e){
            
            
            respuesta = e.toString();
        }
        return respuesta; 
    }
    
    
    
    
    public String crearCuenta(String tipo, double fondos, double interes, int plazo, int cliente ){
        
         String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("insert into cuentas(tipo,cantidadChequeras,estado,fondos,interes,plazo,cliente) values (?,?,?,?,?,?,?)");
            
            sentencia.setString(1,tipo);
            sentencia.setInt(2, 0);
            sentencia.setInt(3, 1);
            sentencia.setDouble(4,fondos);
            sentencia.setDouble(5,interes);
            sentencia.setInt(6,plazo);
            sentencia.setInt(7,cliente);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA CREADO LA CUENTA";
               
            }
            
            
        }catch(Exception e){
            respuesta = "NO SE HA CREADO LA CUENTA";
            System.out.println(e);
        }
        
        return respuesta;
    }
    
    
    
    
    public String pagarPrestamo(double monto, String fecha, int cuenta, int prestamo){
        
        String respuesta = null;
        double fondos, nuevofondo,saldo, nuevosaldo; 
        int auxi,auxi2;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("select * from cuentas where noCuenta = ?");
            sentencia.setInt(1,cuenta);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()){
                fondos = Double.parseDouble(rs.getString(5)); 
                auxi = Integer.parseInt(rs.getString(4));
                PreparedStatement sentencia2 = base.prepareStatement("select * from prestamos where idPrestamo = ?");
                sentencia2.setInt(1,prestamo);
                ResultSet rs2 = sentencia2.executeQuery();
                
                
                if (rs2.next()==true && auxi==1){
                    
                    saldo = Double.parseDouble(rs2.getString(2));
                    auxi2 = Integer.parseInt(rs2.getString(5));
                    if (fondos>0 && saldo>0 && auxi2==1){
                        
                        nuevofondo = fondos-monto;
                        nuevosaldo = saldo-monto;
                        
                        PreparedStatement sentencia3 = base.prepareStatement("update cuentas set fondos = ? where noCuenta = ?");
                        sentencia3.setDouble(1,nuevofondo);
                        sentencia3.setInt(2,cuenta);
                        ResultSet rs3 = sentencia3.executeQuery();
                        rs3.next();
                        
                        PreparedStatement sentencia4 = base.prepareStatement("update prestamos set monto = ? where idPrestamo = ?");
                        sentencia4.setDouble(1,nuevosaldo);
                        sentencia4.setInt(2,prestamo);
                        ResultSet rs4 = sentencia4.executeQuery();
                        rs4.next();
                        
                        PreparedStatement sentencia5 = base.prepareStatement("insert into pagos(monto,fecha,prestamo,cuenta) values (?,?,?,?)");
                        
                        sentencia5.setDouble(1,monto);
                        sentencia5.setString(2,fecha);
                        sentencia5.setInt(3, prestamo);
                        sentencia5.setInt(4, cuenta);
                        
                         int respuestabase = sentencia5.executeUpdate();
            
                        if (respuestabase == 1){
                            respuesta = "SE HA REGISTRADO EL PAGO";
                            registroOperaciones("PAGO PRESTAMO",0,monto,cuenta,1);
                        }
                        
                        
                    } else {
                        respuesta = "LA CUENTA NO TIENE FONDOS SUFICIENTES O YA NO ES NECESARIO NINGUN PAGO";
                    }
                    
                } else {
                    respuesta = "NO SE HA REGISTRADO EL PAGO";
                }
                
            } else {
                respuesta = "NO SE HA REGISTRADO EL PAGO";
            }
            
            
            
        } catch(Exception e){
            respuesta = "NO SE HA REGISTRADO EL PAGO";
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    public String solicitarTalonario(int cuenta){
        
        String respuesta = null;
        int fondos,aux,jeje; 
        String auxe;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("select * from cuentas where noCuenta = ?");
            sentencia.setInt(1,cuenta);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()){
                
                fondos = Integer.parseInt(rs.getString(3));
                auxe = rs.getString(2);
                jeje = Integer.parseInt(rs.getString(4));
                if (fondos <4 && auxe.equals("monetario") && jeje == 1){
                    aux = fondos +1;
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set cantidadChequeras = ? where noCuenta = ?");
                    sentencia4.setInt(1,aux);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    
                    
                    
                    PreparedStatement sentencia5 = base.prepareStatement("insert into talonarios(cuenta) values (?)");
                    
                    sentencia5.setInt(1, cuenta);
                    
                    int respuestabase = sentencia5.executeUpdate();
            
                        if (respuestabase == 1){
                            respuesta = "SE HA BRINDADO NUEVO TALONARIO";
                            registroOperaciones("SOLICITUD TALONARIO",0,0,cuenta,1);
                        }
                } else {
                    respuesta = "YA SE HA BRINDADO EL LIMITE DE CHEQUERAS O NO ES MONETARIO";
                }
                
            } else {
                respuesta = "NO SE HA BRINDADO UNA NUEVA CHEQUERA1";
            }
            
            
        } catch(Exception e){
            
            System.out.println(e);
            respuesta = e.toString();
        }
        return respuesta;
    }
    
    
    
      public String agregarProveedor(String nombre){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into proveedores(nombre) values (?)");
            
            sentencia.setString(1,nombre);
            
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA AGREGADO EL PROVEEDOR CORRECTAMENTE";
            }
            
        } catch(Exception e){
            
            respuesta = "NO SE HA AGREGADO EL PROVEEDOR";
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    public String chequesCambiados(int cuenta, double monto){
        
        String respuesta = null;
        String auxe;
        double auxi;
        int auxii;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("select * from cuentas where noCuenta = ?");
            sentencia.setInt(1,cuenta);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()){
                
                auxi = Double.parseDouble(rs.getString(5));
                auxe = rs.getString(2);
                auxii = Integer.parseInt(rs.getString(4));
                if (auxi >monto && auxe.equals("monetario") && auxii ==1){
                    auxi = auxi - monto;
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set fondos = ? where noCuenta = ?");
                    sentencia4.setDouble(1,auxi);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    
                    
                    
                    PreparedStatement sentencia5 = base.prepareStatement("insert into cheques(monto,cuenta) values (?,?)");
                  
                    sentencia5.setDouble(1, monto);
                    sentencia5.setInt(2,cuenta);
                    
                    int respuestabase = sentencia5.executeUpdate();
            
                        if (respuestabase == 1){
                            respuesta = "SE HA CAMBIADO UN  NUEVO CHEQUE";
                            registroOperaciones("CAMBIO CHEQUE",0,monto,cuenta,1);
                            
                        }
                } else {
                    respuesta = "LA CUENTA NO TIENE FONDOS SUFICIENTES O NO ES MONETARIA";
                }
                
            } else {
                respuesta = "NO SE HA CAMBIADO UN  NUEVO CHEQUE";
            }
            
            
        } catch(Exception e){
            
            System.out.println(e);
            respuesta = e.toString();
        }
        return respuesta;
    }
    
    
    
    public String agregarAgencia(String departamento, String municipio){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into agencia(departamento,municipio) values (?,?)");
           
            sentencia.setString(1,departamento);
            sentencia.setString(2,municipio);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA AGREGADO LA AGENCIA CORRECTAMENTE";
            }
            
        } catch(Exception e){
            
            respuesta = "NO SE HA AGREGADO LA AGENCIA CORRECTAMENTE";
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    public String agregarOperador(int categoria, String nombre, String apellido, int agencia,String pass){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{ 
            PreparedStatement sentencia = base.prepareStatement("insert into operadores(categoria,nombre,apellido,pass,agencia) values (?,?,?,?,?)");
           
            sentencia.setInt(1, categoria);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellido);
            sentencia.setString(4, pass);
            sentencia.setInt(5, agencia);
            
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA AGREGADO EL OPERADOR CORRECTAMENTE";
            }
        } catch(Exception e){
            respuesta = "NO SE HA AGREGADO EL OPERADOR CORRECTAMENTE";
        }
        
        return respuesta;
    }
    
    
    
    
    public String agregarStock(int stock, int proveedor, int producto){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{ 
            
            
            PreparedStatement sentencia1 = base.prepareStatement("select * from proveedores where idProveedores = ?");
            sentencia1.setInt(1,proveedor);
            ResultSet rs = sentencia1.executeQuery();
            
            if (rs.next()){
            
                PreparedStatement sentencia2 = base.prepareStatement("select * from productos where idProductos = ?");
                sentencia2.setInt(1,producto);
                ResultSet rs2 = sentencia2.executeQuery();
                
                
                if (rs2.next()){
                    
                    PreparedStatement sentencia = base.prepareStatement("insert into proveedoresproducto(stock,proveedores,producto) values (?,?,?)");
                    
                    sentencia.setInt(1, stock);
                    sentencia.setInt(2, proveedor);
                    sentencia.setInt(3, producto);
                    
                    
                    int respuestabase = sentencia.executeUpdate();
            
                        if (respuestabase == 1){
                            respuesta = "SE HA ACTUALIZADO EL STOCK";
                        }
                    
                    
                } else {
                    respuesta = "NO EXISTE EL PRODUCTO";
                }
                
            } else {
                respuesta = "NO EXISTE EL PROVEEDOR";
            }
            
            
        } catch(Exception e){
            respuesta = "NO SE ACTUALIZO EL STOCK";
            System.out.println(e);
        }
         return respuesta;
    }
    
    
    public String suspenderActivarCuenta(String estado, int cuenta){
        String respuesta = null;
        Connection base = conexion.Conectar();
        
        if (estado.equals("ACTIVAR")){
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from cuentas where noCuenta = ?");
                sentencia1.setInt(1,cuenta);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set estado = ? where noCuenta = ?");
                    sentencia4.setDouble(1,1);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    respuesta = "SE ACTIVO LA CUENTA";
                    registroOperaciones("ACTIVACION CUENTA",0,0,cuenta,1);
                } else {
                    respuesta = "NO SE PUDO ENCONTRAR LA CUENTA";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
            
            
        } else if (estado.equals("DESACTIVAR")){
            
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from cuentas where noCuenta = ?");
                sentencia1.setInt(1,cuenta);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set estado = ? where noCuenta = ?");
                    sentencia4.setDouble(1,0);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    respuesta = "SE DESACTIVO LA CUENTA";
                    registroOperaciones("DESACTIVACION CUENTA",0,0,cuenta,1);
                } else {
                    respuesta = "NO SE PUDO ENCONTRAR LA CUENTA";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
             
            
        } else {
            respuesta = "NO SE PUDO REALIZAR LA ACCION";
        }
        
        return respuesta;
    }
    
    
    
    public String iniciarSesion(String tipo, int identificador, String pass){
        String respuesta = null;
        Connection base = conexion.Conectar();
        
        if (tipo.equals("INDIVIDUAL")){
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from clienteindividual where CUI = ? and pass = ?");
                sentencia1.setInt(1,identificador);
                sentencia1.setString(2,pass);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    respuesta = "SE INICIO LA SESION";
                } else {
                    respuesta = "NO SE INICIO LA SESION";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
             
           
        } else if (tipo.equals("EMPRESARIAL")){
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from empresa where patenteEmpresa = ? and pass = ?");
                sentencia1.setInt(1,identificador);
                sentencia1.setString(2,pass);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    respuesta = "SE INICIO LA SESION";
                } else {
                    respuesta = "NO SE INICIO LA SESION";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
            
            
        } else if (tipo.equals("TRABAJADOR")){
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from operadores where idOperador = ? and pass = ?");
                sentencia1.setInt(1,identificador);
                sentencia1.setString(2,pass);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    respuesta = "SE INICIO LA SESION";
                } else {
                    respuesta = "NO SE INICIO LA SESION";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
             
            
            
        } else {
            respuesta = "NO SE INICIO LA SESION";
        }
        return respuesta;
    }
    
    
    public String cambiarPass(String tipo, int identificador, String biejo, String nuevo){
        String respuesta = null;
        Connection base = conexion.Conectar();
        
        if (tipo.equals("INDIVIDUAL")){
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from clienteindividual where CUI = ?");
                sentencia1.setInt(1,identificador);
                
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    if (rs.getString(12).equals(biejo)){
                        
                        PreparedStatement sentencia4 = base.prepareStatement("update clienteindividual set pass = ? where CUI = ?");
                        sentencia4.setString(1,nuevo);
                        sentencia4.setInt(2,identificador);
                        ResultSet rs4 = sentencia4.executeQuery();
                        rs4.next();
                        respuesta = "SE CAMBIO EL PASSWORD";
                        
                    } else {
                        respuesta = "PASSWORD ANTIGUO NO CONCUERDA";
                    }
                    
                    
                    
                } else {
                    respuesta = "NO SE ENCONTRO LA CUENTA";
                }
                
                
                
            } catch(Exception e){
                
                respuesta = e.toString();
            }
             
           
        } else if (tipo.equals("EMPRESARIAL")){
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from empresa where patenteEmpresa = ?");
                sentencia1.setInt(1,identificador);
                
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    if (rs.getString(6).equals(biejo)){
                        
                        PreparedStatement sentencia4 = base.prepareStatement("update empresa set pass = ? where patenteEmpresa = ?");
                        sentencia4.setString(1,nuevo);
                        sentencia4.setInt(2,identificador);
                        ResultSet rs4 = sentencia4.executeQuery();
                        rs4.next();
                        respuesta = "SE CAMBIO EL PASSWORD";
                        
                    } else {
                        respuesta = "PASSWORD ANTIGUO NO CONCUERDA";
                    }
                    
                    
                    
                } else {
                    respuesta = "NO SE ENCONTRO LA CUENTA";
                }
                
                
                
            } catch(Exception e){
                
                respuesta = e.toString();
            }
            
        } else if (tipo.equals("TRABAJADOR")){
            
            
               try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from operadores where idOperador = ?");
                sentencia1.setInt(1,identificador);
                
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    if (rs.getString(5).equals(biejo)){
                        
                        PreparedStatement sentencia4 = base.prepareStatement("update operadores set pass = ? where idOperador = ?");
                        sentencia4.setString(1,nuevo);
                        sentencia4.setInt(2,identificador);
                        ResultSet rs4 = sentencia4.executeQuery();
                        rs4.next();
                        respuesta = "SE CAMBIO EL PASSWORD";
                        
                    } else {
                        respuesta = "PASSWORD ANTIGUO NO CONCUERDA";
                    }
                    
                    
                    
                } else {
                    respuesta = "NO SE ENCONTRO LA CUENTA";
                }
                
                
                
            } catch(Exception e){
                
                respuesta = e.toString();
            }
             
            
            
        } else {
            respuesta = "NO SE CAMBIO EL PASSWORD";
        }
        
        
        return respuesta;
    }
    
    
    public String depositoEfectivo(int cuenta, double monto, int cliente){
        
        String respuesta = null;
        double auxi,auxi2;
        int auxii;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("select * from cuentas where noCuenta = ?");
            sentencia.setInt(1,cuenta);
            ResultSet rs = sentencia.executeQuery();
            
            
            if (rs.next()){
                auxi = Double.parseDouble(rs.getString(5));
                auxi2 = auxi + monto;
                auxii=Integer.parseInt(rs.getString(4));
                
                
                if (auxii == 1) {
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set fondos = ? where noCuenta = ?");
                    sentencia4.setDouble(1,auxi2);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    respuesta = "SE REALIZO EL DEPOSITO";
                    registroOperaciones("DEPOSITO EFECTIVO",monto,0,cuenta,1);
                    sumarPuntos(cliente,1000);
                    
                } else {
                    respuesta = "CUENTA NO ESTA ACTIVA";
                }
                
                
                
            }
        } catch(Exception e){
            respuesta = "NO SE REALIZO EL DEPOSITO";
        }
        return respuesta;
    }
    
    
    public String depositoCheque(int cuentadebitar, int cuentasumar, double monto,int cliente){
        
        String respuesta;
        chequesCambiados(cuentadebitar,monto);
        respuesta = depositoEfectivo(cuentasumar,monto,cliente);
        return respuesta;
    }
    
    
    public String registroOperaciones(String accion, double entra, double sale, int cuenta, int operador){
        
        String respuesta = null;
       
        Connection base = conexion.Conectar();
        
        try{
            
            
            PreparedStatement sentencia = base.prepareStatement("insert into registrooperaciones(accion,recibe,entrega,cuenta,operador) values (?,?,?,?,?)");
            
            sentencia.setString(1, accion);
            sentencia.setDouble(2, entra);
            sentencia.setDouble(3, sale);
            sentencia.setInt(4,cuenta);
            sentencia.setInt(5,operador);
            
            
            int respuestabase = sentencia.executeUpdate();
            
                        if (respuestabase == 1){
                            respuesta = "SE HA REGISTRADO LA OPERACION";
                        } else {
                            respuesta = "NO SE HA REGRISTRADO LA OPERACION";
                        }
            
        } catch(Exception e){
            respuesta = "NO SE HA REGRISTRADO LA OPERACION";
        }
        return respuesta;
    }
    
    
    
    
    
    
    public String[] recibe(int noCuenta){
        
        String[] respuesta = null;
        int cantidadElementos;
        int aux = 0;
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("SELECT count(recibe) FROM registrooperaciones WHERE cuenta=?");
            sentencia.setInt(1, noCuenta);
            ResultSet rs = sentencia.executeQuery();
                   
                if(rs.next()){
                    cantidadElementos = rs.getInt(1);
                    respuesta = new String[cantidadElementos];
                    
                    PreparedStatement sentencia2 = base.prepareStatement("select recibe from registrooperaciones where cuenta = ?");
                    sentencia2.setInt(1,noCuenta);
                    ResultSet rss = sentencia2.executeQuery();
                    
            
            
                   while (rss.next()){
                       
                        
                            respuesta[aux] = ""+rss.getInt(aux+1);
                        aux++;
                        
                        } 
                    
            }
              
        } catch(Exception e){
            System.out.println(e);
        }
        
      return respuesta;
        
    }
    
    
    
    
    
     public String retiroEfectivo(int cuenta, double monto){
        
        String respuesta = null;
        String auxe;
        double auxi;
        int auxii;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("select * from cuentas where noCuenta = ?");
            sentencia.setInt(1,cuenta);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()){
                
                auxi = Double.parseDouble(rs.getString(5));
                auxe = rs.getString(2);
                auxii = Integer.parseInt(rs.getString(4));
                if (auxi >monto && auxe.equals("monetario") && auxii ==1){
                    auxi = auxi - monto;
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set fondos = ? where noCuenta = ?");
                    sentencia4.setDouble(1,auxi);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                            respuesta = "SE HA REALIZADO UN NUEVO RETIRO";
                            registroOperaciones("RETIRO EN EFECTIVO",0,monto,cuenta,1);
                        
                } else {
                    respuesta = "LA CUENTA NO TIENE FONDOS SUFICIENTES O NO ES MONETARIA";
                }
                
            } else {
                respuesta = "NO SE HA REALIZADO UN NUEVO RETIRO";
            }
            
            
        } catch(Exception e){
            
            System.out.println(e);
            respuesta = e.toString();
        }
        return respuesta;
    }
    
    
    
    
    public String aprobarRechazarPrestamo(String estado, int prestamo){
        String respuesta = null;
        Connection base = conexion.Conectar();
        int auxi = 0;
        
        if (estado.equals("APROBAR")){
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from prestamos where idPrestamo = ?");
                sentencia1.setInt(1,prestamo);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    auxi = Integer.parseInt(rs.getString(6));
                    PreparedStatement sentencia4 = base.prepareStatement("update prestamos set aprobado = ? where idPrestamo = ?");
                    sentencia4.setDouble(1,1);
                    sentencia4.setInt(2,prestamo);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    respuesta = "SE APROBO EL PRESTAMO";
                    registroOperaciones("APROBACION PRESTAMO",0,0,auxi,1);
                } else {
                    respuesta = "NO SE PUDO ENCONTRAR EL PRESTAMO";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
            
            
        } else if (estado.equals("RECHAZAR")){
            
            
            
            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from prestamos where idPrestamo = ?");
                sentencia1.setInt(1,prestamo);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    auxi = Integer.parseInt(rs.getString(6));
                    PreparedStatement sentencia4 = base.prepareStatement("update prestamos set aprobado = ? where idPrestamo = ?");
                    sentencia4.setDouble(1,0);
                    sentencia4.setInt(2,prestamo);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    respuesta = "SE RECHAZO UN PRESTAMO";
                    registroOperaciones("RECHAZO DE PRESTAMO",0,0,auxi,1);
                } else {
                    respuesta = "NO SE PUDO ENCONTRAR EL PRESTAMO";
                }
                
                
                
            } catch(Exception e){
                respuesta = e.toString();
            }
             
            
        } else {
            respuesta = "NO SE PUDO REALIZAR LA ACCION";
        }
        
        return respuesta;
    }
    
    
    
     public String debito(int cuenta, double monto){
        
        String respuesta = null;
        String auxe;
        double auxi;
        int auxii;
        Connection base = conexion.Conectar();
        
        try{
            
            PreparedStatement sentencia = base.prepareStatement("select * from cuentas where noCuenta = ?");
            sentencia.setInt(1,cuenta);
            ResultSet rs = sentencia.executeQuery();
            
            if (rs.next()){
                
                auxi = Double.parseDouble(rs.getString(5));
                auxe = rs.getString(2);
                auxii = Integer.parseInt(rs.getString(4));
                if (auxi >monto && auxe.equals("monetario") && auxii ==1){
                    auxi = auxi - monto;
                    PreparedStatement sentencia4 = base.prepareStatement("update cuentas set fondos = ? where noCuenta = ?");
                    sentencia4.setDouble(1,auxi);
                    sentencia4.setInt(2,cuenta);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                   
            
                        
                            respuesta = "SE HA REALIZADO UN DEBITO";
                            registroOperaciones("DEBITO TRANSACCION",0,monto,cuenta,1);
                        
                } else {
                    respuesta = "LA CUENTA NO TIENE FONDOS SUFICIENTES O NO ES MONETARIA";
                }
                
            } else {
                respuesta = "NO SE HA REALIZADO EL DEBITO";
            }
            
            
        } catch(Exception e){
            
            System.out.println(e);
            respuesta = e.toString();
        }
        return respuesta;
    }
    
    
     public String transaccionesPropias(int cuentadebitar, int cuentasumar, double monto,int cliente){
        
        String respuesta,respuesta2;
        respuesta2 = debito(cuentadebitar,monto);
        if (respuesta2.equals("SE HA REALIZADO UN DEBITO")){
             respuesta = depositoEfectivo(cuentasumar,monto,cliente);
             registroOperaciones("TRANSFERENCIA PROPIA",0,0,cuentadebitar,1);
        } else {
            respuesta = "NO SE PUDO REALIZAR LA TRANSACCION";
        }
       
        return respuesta;
    }
    
    
    
    
    public String historialPuntos(int identificador){
        String respuesta = null;
        Connection base = conexion.Conectar();

            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from clienteindividual where CUI = ?");
                sentencia1.setInt(1,identificador);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){
                    
                    respuesta = "PUNTOS ACUMULADOS: " + rs.getString(9) + " PUNTOS VENCIDOS: " + rs.getString(10) + " PUNTOS CAMBIADOS: " + rs.getString(11);
                } else {
                    respuesta = "NO SE ENCUENTRA LA CUENTA";
                }
                 
            } catch(Exception e){
                
                respuesta = e.toString();
                
            }

        return respuesta;
    }
    
    
    
    
    public String sumarPuntos(int cliente, int puntos){
        String respuesta = null;
        Connection base = conexion.Conectar();
        int punto = 0;

            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from clienteindividual where CUI = ?");
                sentencia1.setInt(1,cliente);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){  
                    punto = Integer.parseInt(rs.getString(9));
                    punto = punto + puntos;
                    PreparedStatement sentencia4 = base.prepareStatement("update clienteindividual set puntosAcumulados = ? where CUI = ?");
                    sentencia4.setDouble(1,punto);
                    sentencia4.setInt(2,cliente);
                    ResultSet rs4 = sentencia4.executeQuery();
                    rs4.next();
                    respuesta = "SE SUMARON PUNTOS";
                    registroOperaciones("SUMA DE PUNTOS",0,0,cliente,1);
                    
                    
                } else {
                    
                }
            } catch(Exception e){
                
            }
            return respuesta;
    }
    
    
    
    public String aprobarTerceros(int cuentaPrimaria,int cuentaSecundaria){
        
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into terceros(cuentaTercera,cuenta) values (?,?)");
            
            sentencia.setInt(1,cuentaSecundaria);
            sentencia.setInt(2,cuentaPrimaria);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "SE HA APROBADO LA CUENTA";
                registroOperaciones("APROBAR TRANSFERENCIA A TERCEROS",0,0,cuentaPrimaria,1);
            }
            
        } catch(Exception e){
            
            respuesta = "NO SE HA APROBADO LA CUENTA" + e.toString();
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    
    public String depositoTerceros(int cuentaprincipal, int cuentaSecundaria, double monto,int cliente){
        
        String respuesta = null;
        Connection base = conexion.Conectar();
       

            try{ 
                PreparedStatement sentencia1 = base.prepareStatement("select * from terceros where cuentaTercera = ? and cuenta = ?");
                sentencia1.setInt(1,cuentaSecundaria);
                sentencia1.setInt(2,cuentaprincipal);
                ResultSet rs = sentencia1.executeQuery();
                
                
                if (rs.next()){  
                    respuesta = depositoEfectivo(cuentaSecundaria, monto, cliente);
                    registroOperaciones("TRANSFERENCIA A TERCEROS",0,0,cuentaprincipal,1);
                    
                } else {
                    respuesta = "NO SE PUEDE REALIZAR LA TRANSACCION A TERCEROS";
                }
            
            
            
            } catch(Exception e){
                respuesta = e.toString();
            }
            return respuesta;
    }
    
    
    
    
    
    public String promedioDepositos(int cuenta){
        String respuesta = null;
        Connection base = conexion.Conectar();
        double promedio = 0;
        double auxi = 0;
        int cont = 0;
        String sql = "";

            try{ 
                sql = "select recibe from registrooperaciones where accion = 'DEPOSITO EFECTIVO' and cuenta = " + cuenta;
                
                Statement st = base.createStatement();
                ResultSet rs = st.executeQuery(sql);
             
                
                while(rs.next()){
                    auxi = Double.parseDouble(rs.getString(1));
                    promedio = promedio + auxi;
                    cont++;
                }
                promedio = promedio / cont;
                respuesta = "" + promedio;
                
            } catch(Exception e){
                respuesta = e.toString();
            }
            return respuesta;
    } 
    
    
    public String promedioRetiros(int cuenta){
        String respuesta = null;
        Connection base = conexion.Conectar();
        double promedio = 0;
        double auxi = 0;
        int cont = 0;
        String sql = "";

            try{ 
                sql = "select entrega from registrooperaciones where accion = 'RETIRO EN EFECTIVO' and cuenta = " + cuenta;
                
                Statement st = base.createStatement();
                ResultSet rs = st.executeQuery(sql);
             
                
                while(rs.next()){
                    auxi = Double.parseDouble(rs.getString(1));
                    promedio = promedio + auxi;
                    cont++;
                }
                promedio = promedio / cont;
                respuesta = "" + promedio;
                
            } catch(Exception e){
                respuesta = e.toString();
            }
            return respuesta;
    }
    
    
    public String[] verProductos(){

        Connection base = conexion.Conectar();
        int cont = 0;
        int cantidad = 0;
        String sql = "";
        String [] productos = null;

            try{ 
                
                PreparedStatement sentencia3 = base.prepareStatement("select count(puntos) from productos");
                ResultSet rsss = sentencia3.executeQuery();
                if (rsss.next()){
                    cantidad = Integer.parseInt(rsss.getString(1));
                    productos = new String[cantidad];
                    
                    sql = "select * from productos";
                
                    Statement st = base.createStatement();
                    ResultSet rs = st.executeQuery(sql);
             
                
                    while(rs.next()){
                        productos[cont] = rs.getString(2) + "," + rs.getString(3);
                        cont++;
                    }
                    
                    } else {
                    
                    }
                
                
            } catch(Exception e){
                
            }
            return productos;
    }
    
    
    
   public String[] verPrestamos(int empresa){

        Connection base = conexion.Conectar();
        int idcliente = 0;
        int idprestamo = 0;
        int aux = 0;
        int cont = 0;
        double monto = 0;
        String sql = "";
        String [] productos = null;
        ArrayList<String> datos = new ArrayList<String>();

            try{ 
                
                sql = "select * from prestamos";
                
                    Statement st = base.createStatement();
                    ResultSet rs = st.executeQuery(sql);
             
                
                    while(rs.next()){
                        idcliente = Integer.parseInt(rs.getString(6));
                        idprestamo = Integer.parseInt(rs.getString(1));
                        monto = Double.parseDouble(rs.getString(2));
                        PreparedStatement sentencia3 = base.prepareStatement("select * from empleados where cliente = ? and empresa = ?");
                        sentencia3.setInt(1,idcliente);
                        sentencia3.setInt(2,empresa);
                        ResultSet rsss = sentencia3.executeQuery();
                        
                        if (rsss.next()){
                            aux++;
                            
                        } else {
                            
                        }
                    }
                    
                    productos = new String[aux];
                      
            } catch(Exception e){
                
            }
            
            try{ 
                
                sql = "select * from prestamos";
                
                    Statement st = base.createStatement();
                    ResultSet rs = st.executeQuery(sql);
             
                
                    while(rs.next()){
                        idcliente = Integer.parseInt(rs.getString(6));
                        idprestamo = Integer.parseInt(rs.getString(1));
                        monto = Double.parseDouble(rs.getString(2));
                        PreparedStatement sentencia3 = base.prepareStatement("select * from empleados where cliente = ? and empresa = ?");
                        sentencia3.setInt(1,idcliente);
                        sentencia3.setInt(2,empresa);
                        ResultSet rsss = sentencia3.executeQuery();
                        
                        if (rsss.next()){
                            productos[cont] = idprestamo+","+monto+","+idcliente;
                            cont++;
                        } else {
                            
                        }
                    }
                      
            } catch(Exception e){
                
            }

            return productos;
    }
    
    
    
    
    
    public String[] DepositosEC(int cuenta){
        
        Connection base = conexion.Conectar();
        
        String sql = "";
        int cont = 0;
        int cantidad = 0;
        String [] productos = null;

            try{ 
                
                
                PreparedStatement sentencia3 = base.prepareStatement("select count (recibe) from registrooperaciones where accion = 'DEPOSITO EFECTIVO' and cuenta = ? ");
                sentencia3.setInt(1,cuenta);
                ResultSet rsss = sentencia3.executeQuery();
                if (rsss.next()){
                    cantidad = Integer.parseInt(rsss.getString(1));
                    productos = new String[cantidad];
                    
                sql = "select recibe from registrooperaciones where accion = 'DEPOSITO EFECTIVO' and cuenta = " + cuenta;
                
                Statement st = base.createStatement();
                ResultSet rs = st.executeQuery(sql);
             
                
                while(rs.next()){
                    productos[cont] = rs.getString(1);
                    cont++;
                    
                }
                    
                    
                } else {
                    
                }
                
            } catch(Exception e){
            }
            return productos;
    } 
    
    
    
    public String[] RetirosEC(int cuenta){
        
        Connection base = conexion.Conectar();
        
        String sql = "";
        int cont = 0;
        int cantidad = 0;
        String [] productos = null;

            try{ 
                
                
                PreparedStatement sentencia3 = base.prepareStatement("select count(entrega) from registrooperaciones where cuenta = ? and accion = 'RETIRO EN EFECTIVO' or accion = 'CAMBIO CHEQUE' or accion = 'DEBITO TRANSACCION'");
                sentencia3.setInt(1,cuenta);
                ResultSet rsss = sentencia3.executeQuery();
                if (rsss.next()){
                    cantidad = Integer.parseInt(rsss.getString(1));
                    productos = new String[cantidad];
                    
                sql = "select entrega from registrooperaciones where cuenta = " + cuenta + " and accion = 'RETIRO EN EFECTIVO' or accion = 'CAMBIO CHEQUE' or accion = 'DEBITO TRANSACCION'";
                
                Statement st = base.createStatement();
                ResultSet rs = st.executeQuery(sql);
             
                
                while(rs.next()){
                    productos[cont] = rs.getString(1);
                    cont++;
                    
                }
                    
                    
                } else {
                    
                }
                
            } catch(Exception e){
            }
            return productos;
    } 
    
    
    
    
    public String encabezado(int noCuenta){
        String respuesta = null;
        Connection base = conexion.Conectar();
       

            try{ 
                
                PreparedStatement sentencia1 = base.prepareStatement("select * from empleados where cliente = ?");
                sentencia1.setInt(1,noCuenta);
                ResultSet rsss = sentencia1.executeQuery();
                
                if (rsss.next()){
                    
                    PreparedStatement sentencia2 = base.prepareStatement("select * from cuentas where noCuenta = ?");
                    sentencia2.setInt(1,noCuenta);
                    ResultSet rss = sentencia2.executeQuery();
                
                        if (rss.next()){
                            respuesta = rss.getString(1) + "," + rss.getString(2)+ ",SI NOMINA";
                        } else {
                            respuesta = "ERROR DE ENCONTRAR CUENTA";
                        }
                    
                } else {
                    
                    PreparedStatement sentencia2 = base.prepareStatement("select * from cuentas where noCuenta = ?");
                    sentencia2.setInt(1,noCuenta);
                    ResultSet rss = sentencia2.executeQuery();
                
                        if (rss.next()){
                            respuesta = rss.getString(1) + "," + rss.getString(2)+ ",NO NOMINA";
                        } else {
                            respuesta = "ERROR DE ENCONTRAR CUENTA";
                        }
                    
                }
                  
                
            } catch(Exception e){
                
            }
            
            return respuesta;
    }
    
    
    
    public String pagos(int empresa){
        String respuesta = "";
        Connection base = conexion.Conectar();
        String sql = "";
        double aux = 0;
        int aux2 = 0;
        int aux3 = 0;
        
            try{ 
                sql = "select * from empleados where empresa = " + empresa;
                
                Statement st = base.createStatement();
                ResultSet rs = st.executeQuery(sql);
             
                
                while(rs.next()){
                    aux2 = Integer.parseInt(rs.getString(4));
                    aux = Double.parseDouble(rs.getString(2));
                    PreparedStatement sentencia1 = base.prepareStatement("select * from cuentas where cliente = ?");
                    sentencia1.setInt(1,aux2);
                    ResultSet rsss = sentencia1.executeQuery();
                    
                    if (rsss.next()){
                        aux3 = Integer.parseInt(rsss.getString(1));
                        depositoEfectivo(aux3,aux,aux2);
                    } else {
                        
                    }  
                }
                
                respuesta = "PAGO REALIZADO";
                
                
            } catch(Exception e){
                respuesta = "PAGO NO REALIZADO";
            }
            return respuesta;
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String registrarLibro(int idLibro, String nombreLibro, int noEjemplares, int noPaginas, int tema, int autor){
        String respuesta = null;
        
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("insert into libro(idLibro,nombreLibro,noEjemplares,noPaginas,unidadesPrestadas,unidadesDisponibles,cantidadPrestados,cantidadRestaurados,tema,autor) values (?,?,?,?,?,?,?,?,?,?)");
            sentencia.setInt(1, idLibro);
            sentencia.setString(2, nombreLibro);
            sentencia.setInt(3, noEjemplares);
            sentencia.setInt(4, noPaginas);
            sentencia.setInt(5, 0);
            sentencia.setInt(6, noEjemplares);
            sentencia.setInt(7, 0);
            sentencia.setInt(8, 0);
            sentencia.setInt(9, tema);
            sentencia.setInt(10, autor);
            
            int respuestabase = sentencia.executeUpdate();
            
            if (respuestabase == 1){
                respuesta = "REGISTRO EXITOSO";
            }
            
        }
        catch(Exception e){
                    System.out.println(e);
        }
        return respuesta;
    }
    
    public String consultaLibro(int idLibro){
        String respuesta = null;
        int autor;
        
        Connection base = conexion.Conectar();
        
        
        try{
            PreparedStatement sentencia = base.prepareStatement("select * from libro where idlibro = ?");
            sentencia.setInt(1,idLibro);
            ResultSet rs = sentencia.executeQuery();
           
            if (rs.next()){
                autor = Integer.parseInt(rs.getString(10));
                
                respuesta = "NOMBRE DEL LIBRO: " + rs.getString(2) + " EXISTENCIA: " + rs.getString(3) + " DISPONIBLES: " + rs.getString(6) + " PRESTADOS: " + rs.getString(5) + " EN RESTAURACION: " + rs.getString(8);
                PreparedStatement sentencia2 = base.prepareStatement("select * from autor where idAutor = ?");
                sentencia2.setInt(1,autor);
                ResultSet rss = sentencia2.executeQuery();
                
                if (rss.next()){
                     respuesta = respuesta + " AUTOR: " + rss.getString(2);
                     PreparedStatement sentencia3 = base.prepareStatement("SELECT count(libros) FROM cola WHERE libros=?");
                     sentencia3.setInt(1,idLibro);
                     ResultSet rsss = sentencia3.executeQuery();
                     
                     if(rsss.next()){
                         respuesta = respuesta + " EN COLA: " + rsss.getString(1);
                         return respuesta;
                     }
                }
            } else {
                respuesta = "EL LIBRO NO SE ENCUENTRA EN LA BIBLIOTECA";
            }
            
        }catch(Exception e){
            
            System.out.println(e);
        }
        
        return respuesta;
    }
    
    
    
    public String restauracion(int idLibro){
        String respuesta = "";
        int autorw,aux2,aux22,disponibles;
        Connection base = conexion.Conectar();
        
        
        try{
            PreparedStatement sentencia = base.prepareStatement("select * from libro where idlibro = ?");
            sentencia.setInt(1,idLibro);
            ResultSet rs = sentencia.executeQuery();
           
            if (rs.next()){
                autorw = Integer.parseInt(rs.getString(8));
                aux2 = autorw +1;
                disponibles = Integer.parseInt(rs.getString(6));
                
                if(disponibles>0){
                    
                PreparedStatement sentencia2 = base.prepareStatement("update libro set cantidadRestaurados = ? where idlibro = ?");
                sentencia2.setInt(1,aux2);
                sentencia2.setInt(2,idLibro);
                ResultSet rss = sentencia2.executeQuery();
                rss.next();
                aux22 = disponibles - 1;
                PreparedStatement sentencia3 = base.prepareStatement("update libro set unidadesDisponibles = ? where idlibro = ?");
                sentencia3.setInt(1,aux22);
                sentencia3.setInt(2,idLibro);
                ResultSet rsss = sentencia3.executeQuery();
                rsss.next();
                respuesta = "SE AÑADIO UN NUEVO LIBRO A RESTAURACION";
                return respuesta;
                } else {
                    respuesta = "NO SE AÑADIO EL LIBRO A RESTAURACION";
                }
                
            } else {
                respuesta = "EL LIBRO NO SE ENCUENTRA EN LA BIBLIOTECA";
            }
            
        }catch(Exception e){
            
            System.out.println(e);
        }
        
        return respuesta;
    }
    
    
    public String prestamo(int noCarnet, int idLibro, int idPrestamo, String fecha, int idEP, String hora, int idEmpleado){
        String respuesta = "";
        int autorw,aux2,aux22,a1,a2,a3,a4;
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("select * from estudiante where noCarnet = ?");
            sentencia.setInt(1,noCarnet);
            ResultSet rs = sentencia.executeQuery();
             
            
            
            
            if (rs.next()){
                
                PreparedStatement sentencia2 = base.prepareStatement("select * from libro where idlibro = ?");
                sentencia2.setInt(1,idLibro);
                ResultSet rss = sentencia2.executeQuery();
                
                
                if (rss.next()){
                  
                    autorw = Integer.parseInt(rss.getString(6));
                    aux22 = Integer.parseInt(rss.getString(5));
                    aux2 = Integer.parseInt(rss.getString(7));
                   
                    
                    
                    
                    
                    if (autorw > 0){
                        a1 = autorw -1;
                        a2 = aux22 + 1;
                        a3 = aux2 + 1;
                        
                        
                        
                        PreparedStatement sentencia8 = base.prepareStatement("SELECT count(estudiante) FROM prestamos WHERE estudiante=?");
                        sentencia8.setInt(1,noCarnet);
                        ResultSet rssssssss = sentencia8.executeQuery();
                        rssssssss.next();
                        a4 = Integer.parseInt(rssssssss.getString(1));
                        
                        if(a4>=5){
                            
                            respuesta = "EL ESTUDIANTE YA ALCANZO EL LIMITE DE PRESTAMOS";
                            
                        } else {
                            
                            
                            PreparedStatement sentencia3 = base.prepareStatement("insert into prestamos(idPrestamo,fechaPrestamo,Libro,Estudiante) values (?,?,?,?)");
                        sentencia3.setInt(1,idPrestamo);
                        sentencia3.setString(2,fecha);
                        sentencia3.setInt(3,idLibro);
                        sentencia3.setInt(4,noCarnet);
                        ResultSet rsss = sentencia3.executeQuery();
                        rsss.next();
                        
                        PreparedStatement sentencia4 = base.prepareStatement("insert into empleado_prestamo(idEmpleadoPrestamo,hora,empleado,prestamo) values (?,?,?,?)");
                        sentencia4.setInt(1,idEP);
                        sentencia4.setString(2,hora);
                        sentencia4.setInt(3,idEmpleado);
                        sentencia4.setInt(4,idPrestamo);
                        ResultSet rssss = sentencia4.executeQuery();
                        rssss.next();
                        
                        
                        PreparedStatement sentencia5 = base.prepareStatement("update libro set unidadesDisponibles = ? where idlibro = ?");
                        sentencia5.setInt(1,a1);
                        sentencia5.setInt(2,idLibro);
                        ResultSet rsssss = sentencia5.executeQuery();
                        rsssss.next();
                        
                        PreparedStatement sentencia6 = base.prepareStatement("update libro set unidadesPrestadas = ? where idlibro = ?");
                        sentencia6.setInt(1,a2);
                        sentencia6.setInt(2,idLibro);
                        ResultSet rssssss = sentencia6.executeQuery();
                        rssssss.next();
                        
                        PreparedStatement sentencia7 = base.prepareStatement("update libro set cantidadPrestados = ? where idlibro = ?");
                        sentencia7.setInt(1,a3);
                        sentencia7.setInt(2,idLibro);
                        ResultSet rsssssss = sentencia7.executeQuery();
                        rsssssss.next();
                        
                        respuesta = "PRESTAMO REALIZADO";
                        return respuesta;
                            
                        
                    }
                        
                        
                    } else {
                        
                        respuesta = "NO HAY UNIDADES DE ESE LIBRO DISPONIBLES";
                        
                        
                    }
                   
                    
                } else {
                    
                    respuesta = "EL LIBRO NO EXISTE EN LA BIBLIOTECA";
                    
                  
                }
                
                
                
            } else {
                respuesta = "EL ESTUDIANTE NO SE ENCUENTRA REGISTRADO";
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
        return respuesta;
    }
    
    
    public String cola(int idCola, int noCarnet, int idLibro){
        
        String respuesta = "";
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("select * from estudiante where noCarnet = ?");
            sentencia.setInt(1,noCarnet);
            ResultSet rs = sentencia.executeQuery();
            
            
            
            if (rs.next()){
                
                PreparedStatement sentencia2 = base.prepareStatement("select * from libro where idlibro = ?");
                sentencia2.setInt(1,idLibro);
                ResultSet rss = sentencia2.executeQuery();
                
                
                 if (rss.next()){
                     PreparedStatement sentencia3 = base.prepareStatement("insert into cola(idCola,estudiantes,libros) values(?,?,?)");
                     sentencia3.setInt(1,idCola);
                     sentencia3.setInt(2,noCarnet);
                     sentencia3.setInt(3,idLibro);
                     ResultSet rsss = sentencia3.executeQuery();
                     rsss.next();
                     respuesta = "SE A AÑADIDO A LA COLA";
                     return respuesta;
                     
                 } else {
                     respuesta = "EL LIBRO NO EXISTE EN LA BIBLIOTECA";
                 }
                
            } else {
                respuesta = "EL ESTUDIANTE NO SE ENCUENTRA REGISTRADO";
                
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        return respuesta;
    }
    
    
    public String devolucion(int noCarnet, int idLibro){
        
        String respuesta = "";
        int autorw,aux2,aux22,a1,a2;
        Connection base = conexion.Conectar();
        
        try{
            PreparedStatement sentencia = base.prepareStatement("select * from prestamos where Libro = ? and Estudiante = ?");
            sentencia.setInt(1,idLibro);
            sentencia.setInt(2,noCarnet);
            ResultSet rs = sentencia.executeQuery();
            
            
            
             if (rs.next()){
               
                PreparedStatement sentencia2 = base.prepareStatement("select * from libro where idLibro = ?");
                sentencia2.setInt(1,idLibro);
                ResultSet rss = sentencia2.executeQuery();
                
                
                
                if (rss.next()){
                    
                    aux2 = Integer.parseInt(rss.getString(6));
                    aux22 = Integer.parseInt(rss.getString(5));
                    a1 = aux2 + 1;
                    a2 = aux22 - 1;
                    
                    PreparedStatement sentencia3 = base.prepareStatement("delete from prestamos where Estudiante = ? and Libro = ?");
                    sentencia3.setInt(1,noCarnet);
                    sentencia3.setInt(2,idLibro);
                    ResultSet rsss = sentencia3.executeQuery();
                    rsss.next();
                    
                    
                    PreparedStatement sentencia4 = base.prepareStatement("update libro set unidadesPrestadas = ? where idLibro = ?");
                    sentencia4.setInt(1,a2);
                    sentencia4.setInt(2,idLibro);
                    ResultSet rssss = sentencia4.executeQuery();
                    rssss.next();
                    respuesta = "perr";
                    
                    PreparedStatement sentencia5 = base.prepareStatement("update libro set unidadesDisponibles = ? where idlibro = ?");
                    sentencia5.setInt(1,a1);
                    sentencia5.setInt(2,idLibro);
                    ResultSet rsssss = sentencia5.executeQuery();
                    rsssss.next();
                    
                    respuesta = "SE HA DEVUELTO EL LIBRO";
                    return respuesta;
                    
                } else {
                    respuesta = "NO SE HA DEVUELTO EL LIBRO";
                }
                
            } else {
                 
                 respuesta = "NO SE HA DEVUELTO EL LIBRO";
                 
             } 
            
        } catch(Exception e){
            System.out.println(e);
        }
        
        return respuesta;
    }
    
    
    
    
}
    
    

