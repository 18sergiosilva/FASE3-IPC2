<%@ Page Language="C#" AutoEventWireup="true" CodeFile="usuario existente.aspx.cs" Inherits="usuario_existente" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Vincular Usuario</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Vincular Usuario</strong> Banca en Linea</a>
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
                            <li>TIPO:<asp:TextBox ID="TextBox1" runat="server" Width="523px"></asp:TextBox>
                            </li>
                        </ul>
                    </div>
                    
                <div>
                    <ul class="actions">
                        <li>FONDOS:<asp:TextBox ID="TextBox2" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>INTERES:<asp:TextBox ID="TextBox3" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>PLAZO:<asp:TextBox ID="TextBox4" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>CUI:<asp:TextBox ID="TextBox5" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                            PATENTE:<asp:TextBox ID="TextBox6" runat="server" Width="523px"></asp:TextBox>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                        <li>SALARIO:<asp:TextBox ID="TextBox7" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                        <li>
                        <asp:Button ID="Button1" runat="server" Text="Asignar" Width="933px" OnClick="Button1_Click" />
                        </li>
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