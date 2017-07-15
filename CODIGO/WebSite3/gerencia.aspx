<%@ Page Language="C#" AutoEventWireup="true" CodeFile="gerencia.aspx.cs" Inherits="gerencia" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Gerencia</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Gerencia</strong> Banca en Linea</a>
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
                    <ul class="actions">
                        <li><a href="#" class="button">Visualizar informes</a></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li><a href="#" class="button">Visualizar operaciones</a></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li><a href="#" class="button">Resumenes</a></li>
                    </ul>
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