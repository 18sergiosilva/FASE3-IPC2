<%@ Page Language="C#" AutoEventWireup="true" CodeFile="canje.aspx.cs" Inherits="canje" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Canjear Productos</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Canjear Productos</strong> Banca en Linea</a>
        <nav>
            <a href="#menu">Menu</a>
        </nav>
    </header>

        <nav id="menu">
        <ul class="links">
             <li><a href="generic.aspx">Home</a></li>
            <li><a href="AperturaCuenta.aspx">Apertura de Cuenta</a></li>
            <li><a href="SolicitudPrestamo.aspx">Solicitudes de Prestamo</a></li>
            <li><a href="SuspenderActivar.aspx">Suspender/Activar Cuentas</a></li>
            <li><a href="CambiarPassword.aspx">Cambiar Password</a></li>
            <li><a href="EstadoCuenta.aspx">Estados de Cuenta</a></li>
            <li><a href="autorizarTerceros.aspx">Autorizar Cuenta Tercera</a></li>
            <li><a href="historialPuntos.aspx">Historial de Puntos</a></li>
            <li><a href="ARPrestamos.aspx">Aprobar/Rechazar Prestamos</a></li>
            <li><a href="canje.aspx">Canjear Productos</a></li>
            <li><a href="Reportes.aspx">Reportes</a></li>
            <li><a href="transaccionesTerceros.aspx">Transacciones a Terceros</a></li>
            <li><a href="transaccionesPropias.aspx">Transacciones Propias</a></li>
        </ul>
    </nav>
        <section id="main">
            <div class="inner">

                <header>


                <div>
                    <ul class="actions">
                    </ul>
                </div>

                <div>
                    <asp:Table ID="Table1" runat="server">
                    </asp:Table>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                        <li>
                            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Ver Productos" Width="938px" />
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Label ID="Label1" runat="server" Text="CUI:" Visible="False"></asp:Label>
                            <asp:TextBox ID="TextBox1" runat="server" Visible="False" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Label ID="Label3" runat="server" Text="PRODUCTO:" Visible="False"></asp:Label>
                            <asp:TextBox ID="TextBox2" runat="server" Visible="False" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <p>
                        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Cambiar Producto" Visible="False" Width="946px" />
                    </p>
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
    </form>
</body>
</html>

