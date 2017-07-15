<%@ Page Language="C#" AutoEventWireup="true" CodeFile="añadirStock.aspx.cs" Inherits="añadirStock" %>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Añadir Stock</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="main.css" />
</head>
<body>
    <form id="form1" runat="server">
    <!-- Header -->
    <header id="header">
        <a href="index.html" class="logo"><strong>Añadir Stock</strong> Banca en Linea</a>
        <nav>
            <a href="#menu">Menu</a>
        </nav>
    </header>
    <!-- Nav -->
    <nav id="menu">
        <ul class="links">
            <li><a href="generic - Copy.aspx">Home</a></li>
            <li><a href="añadirGerentesAgencia.aspx">Añadir Gerentes Agencia</a></li>
            <li><a href="AñadirAgencias.aspx">Añadir Agencias</a></li>
            <li><a href="añadirCajero.aspx">Añadir Cajeros</a></li>
            <li><a href="añadirProveedores.aspx">Añadir Proveedores</a></li>
            <li><a href="añadirProductos.aspx">Añadir Productos</a></li>
            <li><a href="añadirStock.aspx">Añadir Stock</a></li>
           
            
        </ul>
    </nav>
    <!-- Main -->
    <section id="main">
        <div class="inner">

            <header>


                <h1>&nbsp;</h1>
                
                    <div>
                        <ul class="actions">
                            <li>STOCK:<asp:TextBox ID="TextBox1" runat="server" Width="523px"></asp:TextBox>
                            </li>
                        </ul>
                    </div>
                    
                <div>
                    <ul class="actions">
                        <li>PRODUCTO:<asp:TextBox ID="TextBox2" runat="server" Width="523px"></asp:TextBox>
                        </li>
                    </ul>
                </div>

                <div>
                    <ul class="actions">
                        <li>
                            PROVEEDOR:
                            <asp:TextBox ID="TextBox3" runat="server" Width="523px"></asp:TextBox>
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
                            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Añadir Stock" Width="944px" />
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
         class="copyright">
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

