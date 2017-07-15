<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ARPrestamosEmpresa.aspx.cs" Inherits="ARPrestamosEmpresa" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Aprobar/Rechazar Prestamo Empresarial</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Aprobar/Rechazar Prestamo Empresarial</strong> Banca en Linea</a>
        <nav>
            <a href="#menu">Menu</a>
        </nav>
    </header>

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
    <section id="main">
        <div class="inner">

            <header>


                    <div>
                        <ul class="actions">
                            <li>CUENTA:<asp:TextBox ID="TextBox1" runat="server" Width="523px"></asp:TextBox>
                            </li>
                        </ul>
                    </div>
                    
                <div>
                    <ul class="actions">
                        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Ver Historial" Width="974px" />
                    <ul class="actions">
                        <asp:Label ID="Label2" runat="server" Text="PROMEDIO DEPOSITOS:" Visible="False"></asp:Label>
                        <asp:TextBox ID="TextBox2" runat="server" Visible="False" Width="523px"></asp:TextBox>
                    </ul>
                    </ul>
                </div>

                <div>
                    <asp:Label ID="Label3" runat="server" Text="PROMEDIO RETIROS:" Visible="False"></asp:Label>
                    <asp:TextBox ID="TextBox3" runat="server" Visible="False" Width="523px"></asp:TextBox>
                </div>

                <div>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Label ID="Label4" runat="server" Text="ACCION:" Visible="False"></asp:Label>
                            <asp:DropDownList ID="DropDownList1" runat="server" Visible="False" Width="530px">
                                <asp:ListItem>APROBAR</asp:ListItem>
                                <asp:ListItem>RECHAZAR</asp:ListItem>
                            </asp:DropDownList>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Label ID="Label5" runat="server" Text="PRESTAMO:" Visible="False"></asp:Label>
                            <asp:TextBox ID="TextBox4" runat="server" Visible="False" Width="523px"></asp:TextBox>
                        </li>
                        <li>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Aprobar/Rechazar Prestamo Empresarial" Visible="False" Width="977px" />
                        </li>
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



