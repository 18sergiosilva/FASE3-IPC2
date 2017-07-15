<%@ Page Language="C#" AutoEventWireup="true" CodeFile="cuentas.aspx.cs" Inherits="cuentas" %>

<!DOCTYPE html>

<html>
<head>
    <title>Cuentas</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Cuentas</strong> Banca en Linea</a>
        <nav>
            <a href="#menu">Menu</a>
        </nav>
    </header>
    <!-- Nav -->
    <nav id="menu">
        <ul class="links">
            <li><a href="generic.aspx">Home</a></li>
            <li><a href="cuentas.aspx">Cuentas</a></li>
            <li><a href="servicio al cliente.aspx">Servicio al Cliente</a></li>
            <li><a href="cajero.aspx">Cajero</a></li>
            <li><a href="gerencia.aspx">Gerencia</a></li>
            <li><a href="puntos preferenciales.aspx">Puntos Preferenciales</a></li>
            <li><a href="nomina.aspx">Nominas</a></li>
        </ul>
    </nav>
    <!-- Main -->
    <section id="main">
        <div class="inner">
            
            <header>

                
                <h1>Nombre_del_Cliente</h1>

                <div>
                    <h4>Cuentas Monetarias</h4>

                    <div class="table-wrapper">
                        <table class="alt">
                            <thead>
                                <tr>
                                    <th>No Cuenta</th>
                                    <th>Tipo</th>
                                    <th>Saldo</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Monetaria</td>
                                    <td>29.99</td>
                                </tr>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Monetaria</td>
                                    <td>19.99</td>
                                </tr>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Monetaria</td>
                                    <td>29.99</td>
                                </tr>
                            </tbody>
                           
                                
                            
                        </table>
                        
                    </div>


                </div>

                <div>
                    <h4>Cuentas de Ahorro</h4>

                    <div class="table-wrapper">
                        <table class="alt">
                            <thead>
                                <tr>
                                    <th>No Cuenta</th>
                                    <th>Tipo</th>
                                    <th>Saldo</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Ahorro</td>
                                    <td>29.99</td>
                                </tr>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Ahorro</td>
                                    <td>19.99</td>
                                </tr>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Ahorro</td>
                                    <td>29.99</td>
                                </tr>
                            </tbody>



                        </table>

                    </div>
                </div>

                <div>
                    <h4>Cuentas a Plazo Fijo</h4>

                    <div class="table-wrapper">
                        <table class="alt">
                            <thead>
                                <tr>
                                    <th>No Cuenta</th>
                                    <th>Tipo</th>
                                    <th>Saldo</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Plazo Fijo</td>
                                    <td>29.99</td>
                                </tr>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Plazo Fijo</td>
                                    <td>19.99</td>
                                </tr>
                                <tr>
                                    <td>1234567-8</td>
                                    <td>Plazo Fijo</td>
                                    <td>29.99</td>
                                </tr>
                            </tbody>



                        </table>

                    </div>
                </div>
                
                
                
                

            </header>

        </div>
    </section>
    <!-- Footer -->
    <footer id="footer">
        >
        <div class="copyright">
            &copy; Untitled. Sergio Silva 2017.
        </div>
    </footer>
    <!-- Scripts -->
			<script src="jquery.min.js"></script>
			<script src="jquery.scrolly.min.js"></script>
			<script src="skel.min.js"></script>
			<script src="util.js"></script>
			<script src="main.js"></script>
</body>
</html>