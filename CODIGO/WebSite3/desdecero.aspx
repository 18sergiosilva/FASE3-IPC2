<%@ Page Language="C#" AutoEventWireup="true" CodeFile="desdecero.aspx.cs" Inherits="desdecero" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Crear Usuario</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Crear Usuario</strong> Banca en Linea</a>
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


                    <ul class="actions">
                        <li>CUI:<asp:TextBox ID="TextBox1" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>PRIMER NOMBRE:<asp:TextBox ID="TextBox2" runat="server" Width="523px"></asp:TextBox>
                        </li>
                        <li></li>
                    </ul>
                    <ul class="actions">
                        <li>SEGUNDO NOMBRE:<asp:TextBox ID="TextBox3" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>TECER NOMBRE:<asp:TextBox ID="TextBox4" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>PRIMER APELLIDO:<asp:TextBox ID="TextBox5" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>SEGUNDO APELLIDO:<asp:TextBox ID="TextBox6" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>FECHA NACIMIENTO:<asp:TextBox ID="TextBox7" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>EDAD:<asp:TextBox ID="TextBox8" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>PASSWORD:<asp:TextBox ID="TextBox9" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                    <ul class="actions">
                        <li>TIPO:<asp:TextBox ID="TextBox10" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                
                    <div>
                        <ul class="actions">
                            <li>FONDOS:<asp:TextBox ID="TextBox11" runat="server" Width="523px"></asp:TextBox>
                            </li>
                        </ul>
                    </div>
                    
                <div>
                    <ul class="actions">
                        <li>INTERES:<asp:TextBox ID="TextBox12" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>PLAZO:<asp:TextBox ID="TextBox13" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>SALARIO:<asp:TextBox ID="TextBox14" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                            PATENTE:
                            <asp:TextBox ID="TextBox15" runat="server" Width="523px"></asp:TextBox>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li></li>
                        <li>
                        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Asignar" Width="933px" />
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