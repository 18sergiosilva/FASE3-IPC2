<%@ Page Language="C#" AutoEventWireup="true" CodeFile="verPrestamos.aspx.cs" Inherits="verPrestamos" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Ver Prestamos</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Ver Prestamos</strong> Banca en Linea</a>
        <nav>
            <a href="#menu">Menu</a>
        </nav>
    </header>
    <!-- Nav -->
    <nav id="menu">
        <ul class="links">
            <li><a href="generic - Copy - Copy - Copy.aspx">Home</a></li>
            <li><a href="vincular.aspx">Vincular Cuenta</a></li>
            <li><a href="usuario existente.aspx">Vincular Usuario</a></li>
            <li><a href="desdecero.aspx">Crear Usuario</a></li>
            <li><a href="pagoSalarios.aspx">Pago de Salarios</a></li>
            <li><a href="ARPrestamosEmpresa.aspx">Aprobar/Rechazar Prestamo Empresarial</a></li>
            <li><a href="verPrestamos.aspx">Ver Prestamos</a></li>
            
        </ul>
    </nav>
    <!-- Main -->
    <section id="main">
        <div class="inner">

            <header>


                <h1>&nbsp;</h1>
                
                    <div>
                        <ul class="actions">
                            <li>
                            </li>
                        </ul>
                    </div>
                    
                <div>
                    <ul class="actions">
                        <li>PATENTE:<asp:TextBox ID="TextBox2" runat="server" Width="523px"></asp:TextBox>
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
                        <li>
                            <asp:Button ID="Button1" runat="server" Text="Ver Prestamos" Width="988px" OnClick="Button1_Click" />
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Table ID="Table1" runat="server">
                            </asp:Table>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
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
    </form>
</body>
</html>

